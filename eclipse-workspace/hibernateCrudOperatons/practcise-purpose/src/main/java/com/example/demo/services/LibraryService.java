package com.example.demo.services;



import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Allocation;
import com.example.demo.entity.Book;
import com.example.demo.entity.Category;
import com.example.demo.entity.Department;
import com.example.demo.entity.Fine;
import com.example.demo.entity.Student;
import com.example.demo.model.AllocationModel;
import com.example.demo.model.BookModel;
import com.example.demo.model.LoginModel;



@Service
public interface LibraryService {
	
	List<Student> saveStudent(Student student);
	Student login(LoginModel login);
	void saveBook(Book book);
	List<Book> getAllBooKs();

	void allocationBook(Allocation allocation);
	List<AllocationModel> allocationBooks();
	List<Fine> fineDetails();
	List<Department> getDepartment();
	List<Category> getCategory();
	void getID();
	void getAllocationId();
	void returnBook(Fine fine);
}
