package loki.love2code.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import loki.love2code.demo.entity.Student;

public class Readkeydemo {
	
	public static void main(String args[]) {
		
		SessionFactory factory=new Configuration()
				               .configure("hibernate.cfg.xml")
				               .addAnnotatedClass(Student.class)
				               .buildSessionFactory();
		//crate session factory
		Session session=factory.getCurrentSession();
			
		try {
			System.out.println("creating new student object");
			Student student1=new Student("hari","hari","pavan@gmail.com");
			
			session.beginTransaction();
			session.save(student1);
		  System.out.println("get id "+ student1.getId());
			session.getTransaction().commit();
		   
		  System.out.println();
		  
		  
		  session=factory.getCurrentSession();
		  session.beginTransaction();
				System.out.println("\n this is student with id: "+student1.getId());
				Student mystudent=session.get(Student.class, student1.getId());
				System.out.println("the compleeeetee"+ mystudent);
		  
		  
		  
		  
		  
		  
			session.getTransaction().commit();
			System.out.println("done");
		}
		finally {
			factory.close();
		}
	}

}
