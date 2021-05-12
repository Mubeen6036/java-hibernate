import org.hibernate.Session;

import domain.Guide;
import domain.Student;

public class HBMEqualsAndHashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		try (Session s = HibernateUtil.getSessionFactory().openSession()){
			s.beginTransaction();
			Student s1 = new Student();
			s1.setName("Mubeen");
			Student s2 = new Student();
			s2.setName("Mubeen1");
			Guide g = new Guide();
			g.setName("Bitch");
			g.addStudent(s1);
			g.addStudent(s2);
			s.persist(g);
			s.getTransaction().commit();
		}*/
		Student student  =null;
		try (Session s = HibernateUtil.getSessionFactory().openSession()){
			s.beginTransaction();
			student = s.find(Student.class, 2L);
			Guide g = s.find(Guide.class, 1L);
			System.out.println(g.getStudents().size() + "    "+ g.getStudents().contains(student));

			s.getTransaction().commit();
		}
		
		/*try (Session s = HibernateUtil.getSessionFactory().openSession()){
			s.beginTransaction();
			Guide g = s.find(Guide.class, 1L);
			System.out.println(g.getStudents().size() + "    "+ g.getStudents().contains(student));
			s.getTransaction().commit();
		}*/
	}

}
