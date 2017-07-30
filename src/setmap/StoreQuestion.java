package setmap;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		HashSet <String> sh1=new HashSet<String>();
		sh1.add("java is programing");
		sh1.add("it is platform independent");
		
		HashSet <String> sh2=new HashSet<String>();
		sh2.add("servlet is interface");
		sh2.add("you can use it");
		
		Question question1=new Question();
		question1.setQname("whate is java?");
		question1.setAnswer(sh1);
		
		Question question2=new Question();
		question2.setQname("Whate is Servalet?");
		question2.setAnswer(sh2);
		
		session.persist(question1);
		//session.persist(question2);
		
		
		tx.commit();
		
		session.close();
		
		System.out.println("success");

	}

}
