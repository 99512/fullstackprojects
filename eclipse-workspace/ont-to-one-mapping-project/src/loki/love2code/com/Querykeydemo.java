package loki.love2code.com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import loki.love2code.demo.entity.Student;

public class Querykeydemo {
	
	public static void main(String args[]) {
		
		SessionFactory factory=new Configuration()
				               .configure("hibernate.cfg.xml")
				               .addAnnotatedClass(Student.class)
				               .buildSessionFactory();
		//crate session factory
		Session session=factory.getCurrentSession();
		
		try {
			System.out.println("creating new student object");
			Student student1=new Student("pavan","kumar","pavan@gmail.com");
		
			session.beginTransaction();
			session.save(student1);
		System.out.println("delete                     ");
			session.createQuery("delete from Student where id=1").executeUpdate();
			List<Student> theStudent=session.createQuery("from Student").list();	
			for(Student tempStudent:theStudent)
			{
				System.out.println(tempStudent);
			}
			theStudent=session.createQuery("from Student s where s.email like'%loki%'").list();
			
			for(Student tempStudent:theStudent)
			{
				System.out.println(tempStudent);
			}
			session.getTransaction().commit();
			System.out.println("done");
		}
		finally {
			factory.close();
		}
	}

}
