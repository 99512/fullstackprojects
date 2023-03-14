package loki.love2code.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import loki.love2code.demo.entity.Instructor;
import loki.love2code.demo.entity.InsturnctorDetails;
import loki.love2code.demo.entity.Student;

public class InstructorDetails {
	
	public static void main(String args[]) {
		
		SessionFactory factory=new Configuration()
				               .configure("hibernate.cfg.xml")
				               .addAnnotatedClass(Instructor.class)
				               .addAnnotatedClass(InsturnctorDetails.class)
				               .buildSessionFactory();
		
		Session session=factory.getCurrentSession();
			
		try {
	
		      session.beginTransaction();
		      
		      int theid=5;
		      InsturnctorDetails insturnctorDetails=session.get(InsturnctorDetails.class, theid);
		
		    System.out.println("sdkfjskf"+insturnctorDetails);
		    
		    System.out.println(insturnctorDetails.getInstructor());
			session.getTransaction().commit();
			System.out.println("done");
		}
		catch (Exception e) {
			  e.printStackTrace();
		}
		finally {
			session.close();
			factory.close();
		}
	}

}
