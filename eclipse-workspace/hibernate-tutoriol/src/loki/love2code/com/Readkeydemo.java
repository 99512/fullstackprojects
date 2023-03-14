package loki.love2code.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import loki.love2code.demo.entity.Instructor;
import loki.love2code.demo.entity.InsturnctorDetails;
import loki.love2code.demo.entity.Student;

public class Readkeydemo {
	
	public static void main(String args[]) {
		
		SessionFactory factory=new Configuration()
				               .configure("hibernate.cfg.xml")
				               .addAnnotatedClass(Instructor.class)
				               .addAnnotatedClass(InsturnctorDetails.class)
				               .buildSessionFactory();
		
		Session session=factory.getCurrentSession();
			
		try {
		  //    Instructor theinsturntor=new Instructor("loki","reddy","loki@gmail.com");
		      
		   //   InsturnctorDetails insturnctorDetails=new InsturnctorDetails("http//loki.com", "champion");
  Instructor theinsturntor=new Instructor("pavan","reddy","pavan@gmail.com");
		      
		      InsturnctorDetails insturnctorDetails=new InsturnctorDetails("http//pavan.com", "looser");
		            
		      theinsturntor.setInsturnctorDetails(insturnctorDetails);
		      session.beginTransaction();
		      System.out.println("test"+theinsturntor);
		      session.save(theinsturntor);
			
			session.getTransaction().commit();
			System.out.println("done");
		}
		finally {
			factory.close();
		}
	}

}
