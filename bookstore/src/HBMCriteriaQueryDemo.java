import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.criterion.Restrictions;

import domain.Guide;

public class HBMCriteriaQueryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Session s = HibernateUtil.getSessionFactory().openSession()){
			Criteria criteria = s.createCriteria(Guide.class);
			criteria.add(Restrictions.in("name", "Mubeen"));
			
			
		}

	}

}
