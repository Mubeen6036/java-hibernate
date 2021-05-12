

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import domain.Guide;

public class HbmJPQLDemo {
	public static void main(String[] args) {
		try(Session s = HibernateUtil.getSessionFactory().openSession()){
			String name = "Mubeen";
//			Query q = s.createQuery("select guide from Guide guide left join guide.students student where student.id is null");
			Query q = s.createQuery("select guide from Guide guide left join guide.students student");

			//			q.setParameter("name", name);
			List<Guide> g =q.getResultList();
			System.out.println(g.size());
			for(Object g1 :g) {
				Guide guide = (Guide)g1;
				System.out.println(guide.getName());
			}
		}
	}
}
