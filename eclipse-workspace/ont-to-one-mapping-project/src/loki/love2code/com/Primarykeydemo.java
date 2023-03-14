package loki.love2code.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import loki.love2code.demo.entity.Student;

public class Primarykeydemo {
	
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
			Student student2=new Student("ramesh","naiydy","ramesh@gmail.com");
			Student student3=new Student("nani","chekka","nani@gmail.com");
			session.beginTransaction();
			session.save(student1);
			session.save(student2);
			session.save(student3);
			session.getTransaction().commit();
			System.out.println("done");
		}
		finally {
			factory.close();
		}
	}

}
