import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import domain.Guide;
import domain.Student;

public class HBMMergingDetachedObjs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*try(Session s = HibernateUtil.getSessionFactory().openSession()){
			s.beginTransaction();
			Student s1 = new Student();
			s1.setName("Mubeen");
			Student s2 = new Student();
			s2.setName("Mubeen");
			Guide g = new Guide();
			g.addStudent(s1);
			g.addStudent(s2);
			s.persist(g);
			s.getTransaction().commit();
		}*/
		
		Runnable r1 = ()->{
			Set<Student> students = null;
			try(Session s = HibernateUtil.getSessionFactory().openSession()){
				s.beginTransaction();
				Guide g = s.find(Guide.class, 1L);
				students = g.getStudents();
				System.out.println(students.size());
				s.getTransaction().commit();
				Iterator<Student> it=students.iterator();
				while(it.hasNext()) {
					Student stu = it.next();
					if(stu.getId()==2L) {
						stu.setName("Mubeen");
					}
				}
				Thread.sleep(3000);
//				s1.setName("CO CO COLA");
				s.beginTransaction();
				s.getTransaction().commit();
			}catch(Exception e) {
				
			}
		};
		Thread t1 = new Thread(r1);
		
		Runnable r2 = ()->{
			Set<Student> students = null;
			try(Session s = HibernateUtil.getSessionFactory().openSession()){
				s.beginTransaction();
				Guide g = s.find(Guide.class, 1L);
				students = g.getStudents();
				System.out.println(students.size());
				s.getTransaction().commit();
				Thread.sleep(1000);
//				Student s1 = students.iterator().next();
//				Thread.sleep(3000);
				Iterator<Student> it=students.iterator();
				while(it.hasNext()) {
					Student stu = it.next();
					if(stu.getId()==2L) {
						stu.setName("Muneer");
					}
				}
//				s1.setName("Mubeen-Changed");
				s.beginTransaction();
				s.getTransaction().commit();
			}catch(Exception e) {
				
			}
		};
		
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		
		
	}

}
