import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;

import domain.Guide;
import domain.Student;

public class HBMAbsurd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> students = new HashSet<>();
		try(Session s = HibernateUtil.getSessionFactory().openSession()){
			s.beginTransaction();
			Student s1 = new Student();
			System.out.println(s1.hashCode());
			s1.setName("Spicy");
			students.add(s1);
			s.persist(s1);
			System.out.println("Result : "+students.contains(s1));
			System.out.println(s1.hashCode());
			s.getTransaction().commit();
		}
			
	}

}
