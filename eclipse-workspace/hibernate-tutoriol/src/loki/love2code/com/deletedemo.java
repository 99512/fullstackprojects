package loki.love2code.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import loki.love2code.demo.entity.Instructor;
import loki.love2code.demo.entity.InsturnctorDetails;
import loki.love2code.demo.entity.Student;

public class deletedemo {
	
	public static void main(String args[]) {
		
		SessionFactory factory=new Configuration()
				               .configure("hibernate.cfg.xml")
				               .addAnnotatedClass(Instructor.class)
				               .addAnnotatedClass(InsturnctorDetails.class)
				               .buildSessionFactory();
		
		Session session=factory.getCurrentSession();
			
		try {
	
		      session.beginTransaction();
		    int theid=1;
		    Instructor tempinInstructor=session.get(Instructor.class, theid);
		    System.out.println(tempinInstructor);
			
		    
		    if(tempinInstructor != null) {
		    	System.out.println("delete"+tempinInstructor);
		    	session.delete(tempinInstructor);
		    }
		    
		    
			session.getTransaction().commit();
			System.out.println("done");
		}
		finally {
			factory.close();
		}
	}

}
