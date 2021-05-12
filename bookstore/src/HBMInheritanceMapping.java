import org.hibernate.Session;

import domain.Cat;
import domain.Dog;

public class HBMInheritanceMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Session s=HibernateUtil.getSessionFactory().openSession()){
			s.beginTransaction();
			Dog d = new Dog();
			d.setName("DOG");
			Cat c = new Cat();
			c.setName("CAT");
			s.save(d); s.save(c);
			s.getTransaction().commit();
			s.close();
		}
	}

}
