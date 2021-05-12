import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();
	private static SessionFactory buildSessionFactory() {
		try {
			StandardServiceRegistry standardServiceRegistry =
					new StandardServiceRegistryBuilder().configure("hibernate.config.xml").build();
			Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
			return metadata.getSessionFactoryBuilder().build();
			
			}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
