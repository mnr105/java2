package Controller;

import java.io.File;
import java.io.FileReader;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class hibernateUtil {

	static FileReader ceva = null;
	static File ceva2 = null;

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			ceva2 = new File(
					"C:\\Users\\SIIROM_0098\\git\\java2\\CRM2\\resources\\hibernate.cfg.xml");

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

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
