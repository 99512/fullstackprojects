package loki.love2code.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import loki.love2code.demo.entity.Instructor;
import loki.love2code.demo.entity.InsturnctorDetails;
import loki.love2code.demo.entity.Student;

public class deletetingInstructorDetails {
	
	public static void main(String args[]) {
		
		SessionFactory factory=new Configuration()
				               .configure("hibernate.cfg.xml")
				               .addAnnotatedClass(Instructor.class)
				               .addAnnotatedClass(InsturnctorDetails.class)
				               .buildSessionFactory();
		
		Session session=factory.getCurrentSession();
			
		try {
	
		      session.beginTransaction();
		      
		      int theid=4;
		      InsturnctorDetails insturnctorDetails=session.get(InsturnctorDetails.class, theid);
		
		    System.out.println("sdkfjskf"+insturnctorDetails);
		    
		    System.out.println(insturnctorDetails.getInstructor());
		    
		    insturnctorDetails.getInstructor().setInsturnctorDetails(null);
		    
		    session.delete(insturnctorDetails);
		    
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
