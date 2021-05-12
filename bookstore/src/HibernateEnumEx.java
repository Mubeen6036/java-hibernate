import org.hibernate.Session;

import domain.Employee;
import domain.EmployeeStatus;

public class HibernateEnumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Session s = HibernateUtil.getSessionFactory().openSession()){
			Employee e = new Employee();
			e.setEmployeeStatus(EmployeeStatus.PART_TIME);
			s.beginTransaction();
			s.persist(e);
			s.getTransaction().commit();
		}
	}

}
