import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import domain.Friend;

public class HibernatCollectionMappingDemo {
	public static void main(String[] args) {
		Friend f = new Friend();
		Set<String> s = new HashSet<>();
		s.add("Mubeen");
		s.add("Musthafa");
		s.add("chicha");
		f.setNicknames(s);
		try(Session sess= HibernateUtil.getSessionFactory().openSession()){
			sess.beginTransaction();
			sess.persist(f);
			sess.getTransaction().commit();
		}
	}
}
