package loki.love2code.com;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import loki.love2code.demo.entity.Employee;
import loki.love2code.demo.entity.Instructor;
import loki.love2code.demo.entity.InsturnctorDetails;

public class EmployeeClient {
	
	private static SessionFactory sessionFactory;

	public static void main(String[] args) {

		sessionFactory = new  Configuration()
	               .configure("hibernate.cfg.xml")
	               .addAnnotatedClass(Employee.class)
	               .addAnnotatedClass(EmployeeClient.class)
	               .buildSessionFactory();
		Session session=sessionFactory.getCurrentSession();
		Employee employee = new Employee(20000959, "lokesh", "reddy");
		EmployeeClient client = new EmployeeClient();

		//Save
		System.out.println("Saving Employee: ");
		client.saveEmployee(employee);
	}
	
	
	private void saveEmployee(Employee employee) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			session.save(employee);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}

}
