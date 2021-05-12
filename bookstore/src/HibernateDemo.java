import org.hibernate.Session;

import domain.Address;
import domain.Guide;
import domain.Message;
import domain.Person;
import domain.Student;



public class HibernateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		domain.Message m = new domain.Message();
//		m.setText("Hello! How you doing?");
		Person person = new Person();
		person.setName("Muben");
		Address add = new Address();
		add.setAddressLine1("Pedaravuru");
		add.setStreet("Brahmamgari veedhi");
		add.setCity("Tenali");
		add.setZip("500032");
		person.setAddress(add);
		
		Student s = new Student();
		s.setName("Mubeen");
		Guide g = new Guide();
		g.setName("Mr.Guide");
		s.setGuide(g);
		
		Student s1 = new Student();
		s1.setName("Muneer");
		s1.setGuide(g);
		
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
//			session.getTransaction().begin();
//			Message m1 = (Message)session.get(Message.class, 4L);
//			m1.setText("MUBBBBB11");
//			Message m2 = new Message();
//			m2.setId(m1.getId());
//			m2.setText(m1.getText());
//			session.update(m1);
////			m1.setText("MUBBBBB12");
//			session.update(m2);
//			session.getTransaction().commit();
//			System.out.println(m1.getText());
			
			
			
			session.getTransaction().begin();
//			session.persist(s);
//			session.persist(s1);
			
			Student s2 = (Student)session.get(Student.class, 6l);
			session.remove(s2);
			session.getTransaction().commit();
			
		}
		
	}

}
