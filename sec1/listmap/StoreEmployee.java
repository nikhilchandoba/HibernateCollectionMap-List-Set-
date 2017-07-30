package listmap;

import java.util.LinkedList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreEmployee {

	public static void main(String[] args) {
	
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		LinkedList<String>ll=new LinkedList<String>();//in hbm file we need to mention list
		//with element  key, index..
		
		ll.add("ram");
		ll.add("lakhan");
		ll.add("gavrav");
		
		
		Employee em=new Employee();
		em.setId(1);
		em.setEmpNa("er nikhil");
		em.setSubemp(ll);
		
		
		session.persist(em);
		
		tx.commit();
		session.close();
		
		System.out.println("ok set");
	}

}
