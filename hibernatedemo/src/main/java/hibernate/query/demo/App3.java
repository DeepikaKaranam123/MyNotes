package hibernate.query.demo;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.query.Query;

import com.lvg.hibernate.entity.Address2;
import com.lvg.hibernate.util.HibernateUtil;

public class App3 {

	public static void main(String[] args) {
		SessionFactory factory=HibernateUtil.buildSessionFactory();
        Session session=factory.openSession();
        Criteria crt=session.createCriteria(Address2.class);
        crt.add();
        List<Address2> list=crt.list();
        for(Address2 a:list)
        {
        	System.out.println(a.getAddressId()+" "+a.getHouseNo()+" "+a.getStreetName()+" "+a.getCityName()+" "+a.getStateName());
        }
      
		session.close();
		HibernateUtil.shutdown();

	}

}
