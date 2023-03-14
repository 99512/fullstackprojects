package loki.love2code.demo.hybernate.com;

import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import loki.love2code.demo.entity.Student;




public class Hybernanate {

	public static void main(String args[]) {
		//create session factor
		SessionFactory factory=new Configuration()
				               .configure("hibernate.cfg.xml")
				               .addAnnotatedClass(Student.class)
				               .buildSessionFactory();
		//crate session factory
		Session session=factory.getCurrentSession();
		
		try {
			System.out.println("creating new student object");
			Student student=new Student("loki2312","lokewsh","loki@gmail.com");
			Student stu=new Student("pavan","naveen","pavan@gami.com");
			session.beginTransaction();
			session.save(student);
			session.save(stu);
			session.getTransaction().commit();
			System.out.println("done");
		}
		finally {
			factory.close();
		}
	}
	
	
}
