import org.hibernate.Session;

import domain.Address;
import domain.Customer;
import domain.Guide;
import domain.Passport;
import domain.Person;
import domain.Student;

public class HibernateOneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c = new Customer();
		c.setName("Mubeen");
	
		Passport p = new Passport();
		c.setPassport(p);
		
		
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
			Customer c1=session.get(Customer.class, 9l);
			session.remove(c1);
			session.getTransaction().commit();
			
		}
		
	
	}

}
