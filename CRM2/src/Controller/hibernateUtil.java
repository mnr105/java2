package Controller;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.io.FileReader;

public class hibernateUtil {

    static FileReader ceva = null;
    static File ceva2 = null;

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            ceva2 = new File(
                    "C:\\Users\\lluca\\IdeaProjects\\Licenta\\java2\\CRM2\\resources\\hibernate.cfg.xml"
            );

            Configuration configuration = new Configuration().configure(ceva2);
            // configuration.addAnnotatedClass(Persoana.class);
            return configuration
                    .buildSessionFactory(new StandardServiceRegistryBuilder()
                            .applySettings(configuration.getProperties())
                            .build());

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Eroare la construirea Factory-ului");

        }
    }

    //jdbc:mysql://127.0.0.1:3306/?user=root
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
