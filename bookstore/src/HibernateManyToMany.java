import org.hibernate.Session;

import domain.Actor;
import domain.Movie;

public class HibernateManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		m1.setMovieName("Bahubali");
		m2.setMovieName("KFG");
		Actor a1 = new Actor();
		Actor a2 = new Actor();
		Actor a3 = new Actor();
		a1.setActorName("Prabhas");
		a2.setActorName("Nayanatara");
		a3.setActorName("Mubeen");
		m1.getActors().add(a1);
		m1.getActors().add(a2);
		m2.getActors().add(a3);
		m2.getActors().add(a2);
		
		try(Session s = HibernateUtil.getSessionFactory().openSession()){
			s.beginTransaction();
			s.persist(m1);
			s.persist(m2);
			s.getTransaction().commit();
		}
		
	}

}
