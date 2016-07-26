package Controller;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
 

public class hibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {

			Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		//	configuration.addAnnotatedClass(Persoana.class);
			return configuration
					.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
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
