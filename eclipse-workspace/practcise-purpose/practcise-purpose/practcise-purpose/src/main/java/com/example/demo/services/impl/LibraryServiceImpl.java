package com.example.demo.services.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.libraryManagementApplication;
import com.example.demo.entity.Allocation;
import com.example.demo.entity.Book;
import com.example.demo.entity.Category;
import com.example.demo.entity.Department;
import com.example.demo.entity.Fine;
import com.example.demo.entity.Student;
import com.example.demo.model.AllocationModel;
import com.example.demo.model.BookModel;
import com.example.demo.model.LoginModel;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.StudentRepository;
import com.example.demo.services.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService {

	@Autowired
	private BookRepository bookRepository;
	private Session session;
	
	@Autowired
	private libraryManagementApplication librarymanagementApplication;
	
	
	@Autowired 
	
	private EntityManager entityManager;
	@Autowired
	private SessionFactory sf;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Student> saveStudent(Student student) {
		System.out.println(student);
		System.out.println(student.getId());
		System.out.println(student.getRollno());
		session = sf.openSession();
//		Query query = session.createQuery("FROM Student ORDER BY id DESC");
//		query.setMaxResults(1);
		
		Transaction t = session.beginTransaction();
		session.save(student);
		Query query = session.createQuery("FROM Student");
		List<Student> list=query.getResultList();
		Query last = session.createQuery("FROM Student ORDER BY id DESC");
		last.setMaxResults(1);
		long s =student.getId();
		String str=Long.toString(s);
		student.setRollno(student.getDepartment().concat(str));
		t.commit();
		session.close();
		return list;
	}


	@Override
	public void saveBook(Book book) {
		
		System.out.println(book);
		session = sf.openSession();
		Transaction t = session.beginTransaction();
		session.save(book);		
		System.out.println(book.getBookid());
		
		t.commit();
		session.close();
	}
	
	
	@Override
	public void getID() {
		
		session = sf.openSession();
		Transaction t = session.beginTransaction();
		libraryManagementApplication.setBookid(libraryManagementApplication.getBookid());
		t.commit();
		session.close();
		
	}

	@Override
	public Student login(LoginModel login) {
		System.out.println(login);
		session = sf.openSession();
		Transaction t = session.beginTransaction();
		Student student = (Student) session.createQuery("FROM Student s WHERE s.email=:email").setParameter("email", login.getEmail())
				.uniqueResult();
		System.out.println(student);
		System.out.println(student.getId());
		libraryManagementApplication.setId(student.getId());
		//System.out.println(libraryManagementApplication.getId());
		t.commit();
		session.close();
		return student;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getAllBooKs() {
		session = sf.openSession();
		Transaction t = session.beginTransaction();
		t.commit();
		
		return session.createQuery("FROM Book").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Department> getDepartment() {
		session = sf.openSession();
		Transaction t = session.beginTransaction();
		t.commit();
		
		return session.createQuery("FROM Department").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Category> getCategory() {
		session = sf.openSession();
		Transaction t = session.beginTransaction();
		t.commit();
		
		return session.createQuery("FROM Category").getResultList();
	}


	@SuppressWarnings("unchecked")
	@Override
	public void allocationBook(Allocation allocation) {
		
		session = sf.openSession();
		Transaction t = session.beginTransaction();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		Calendar cal = Calendar.getInstance();
		String issuedate = formatter.format(cal.getTime());
		System.out.println(issuedate);
		allocation.setIssuedate(cal.getTime());
		
		cal.add(Calendar.DAY_OF_MONTH, 5);
		String returndate = formatter.format(cal.getTime());
		System.out.println(returndate);
		libraryManagementApplication.setReturnDate(cal.getTime());
		allocation.setReturndate(cal.getTime());
		allocation.setStudentid(libraryManagementApplication.getId());
		System.out.println(libraryManagementApplication.getBookid());
		allocation.setBookid(libraryManagementApplication.getBookid());
		session.save(allocation);
		t.commit();
		session.close();		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<AllocationModel> allocationBooks() {
		session = sf.openSession();
		Transaction t = session.beginTransaction();
		List<AllocationModel> model = new ArrayList<AllocationModel>();
		Query query =  session.createQuery("SELECT new com.example.demo.model.AllocationModel(a.id,a.bookid,a.studentid,a.issuedate,a.returndate,b.bookname,s.name) FROM Allocation a INNER JOIN Book b ON a.bookid=b.bookid INNER JOIN Student s ON s.id=a.studentid");
		model = query.getResultList();
		System.out.println(model);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		Calendar cal = Calendar.getInstance();
		String returningDate = formatter.format(cal.getTime());
		for(int i=0;i<model.size();i++) {
			if(libraryManagementApplication.getAllocationid()==model.get(i).getAllocation_id()) {
				System.out.println(model.get(i).getReturn_date());
				System.out.println(cal.getTime());
				
				if(cal.getTime().after(model.get(i).getReturn_date())) {
					libraryManagementApplication.setAmount(10);
					for(int j=1;j<=365;j++) {
						if(j>1) {
							int a=10*j;
							System.out.println(a);
							libraryManagementApplication.setAmount(a);
							break;
						}
					}
				}
				else {
					libraryManagementApplication.setAmount(0);
				}
			}
		}
		t.commit();
		session.close();
		return model;
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Fine> fineDetails() {
		session = sf.openSession();
		Transaction t = session.beginTransaction();
		t.commit();
		return session.createQuery("FROM Fine").getResultList();
	}


	@Override
	public void getAllocationId() {
		
		session = sf.openSession();
		Transaction t = session.beginTransaction();
		libraryManagementApplication.getAllocationid();
		System.out.println(libraryManagementApplication.getAllocationid());
		t.commit();
		session.close();
	}


	@Override
	public void returnBook(Fine fine) {
		session = sf.openSession();
		Transaction t = session.beginTransaction();
		fine.setStudentid(libraryManagementApplication.getId());
		fine.setAllocationid(libraryManagementApplication.getAllocationid());
		fine.setReason("Late Submission");
		fine.setStatus("Not Paid");
		System.out.println("Student ID "+ libraryManagementApplication.getId());
		System.out.println("Allocated ID "+ libraryManagementApplication.getAllocationid());
		
		//session.save(fine);
		t.commit();
		session.close();
	}
}
