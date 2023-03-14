package com.example.demo.controller;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.libraryManagementApplication;
import com.example.demo.entity.Allocation;
import com.example.demo.entity.Book;
import com.example.demo.entity.Fine;
import com.example.demo.entity.Student;
import com.example.demo.model.AllocationModel;
import com.example.demo.model.LoginModel;
import com.example.demo.model.StudentModel;
import com.example.demo.services.LibraryService;
import com.example.demo.services.impl.LibraryServiceImpl;

@Controller
public class libraryController {
	
	@Autowired
	private LibraryService libraryService;
	
	@Autowired
	private libraryManagementApplication librarymanagementApplication;
	
	@PostMapping("/savestudent")
	public String studentRegistration(@ModelAttribute Student student) {
	
		libraryService.saveStudent(student);	
		System.out.println("working");
		return "redirect:/login";
	}
	
	@GetMapping("/studentRegister")
	public String getStudent(Model model) {
		model.addAttribute("department",libraryService.getDepartment());
		return "studentRegister";
	}
	
	@PostMapping("/Login")
	public String studentLogin(@ModelAttribute LoginModel login) {
		System.out.println(login.getEmail());
		System.out.println(login.getPassword());
		//System.out.println(login.getId());
		Student student=libraryService.login(login);
		if(student==null) {
			System.out.println("User does not exist");
			return "redirect:/login";
		}
		if(student!=null) {
			if(!student.getEmail().equals(login.getEmail()) || !student.getPassword().equals(login.getPassword())) {
				System.out.println("Email and Password invalid");
				
				return "redirect:/login";
			}
		}
		libraryManagementApplication.setIsTrue("hari");
		//System.out.println(libraryManagementApplication.getIsTrue());
		return "redirect:/";
	}
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@GetMapping("/logout")
	public String logout() {
		libraryManagementApplication.setIsTrue("");
		return "redirect:/";
	}
	
	@PostMapping("/savebook")
	public String bookRegistration(@ModelAttribute Book book) {
		libraryService.saveBook(book);
		System.out.println("working");
		return "redirect:/";
	}
	
	@GetMapping("/bookRegister")
	public String getBook(Model model) {
		model.addAttribute("category", libraryService.getCategory());
		return "bookRegister";
	}
	
	@GetMapping("/available")
	public String availableBooks(Model model,@ModelAttribute Book book) {
		model.addAttribute("books",libraryService.getAllBooKs());
		//libraryService.getID(book);
		return "available";
	}
	@GetMapping("/add/{id}")
	public String getID(@PathVariable Long id) {
		
		System.out.println(id);
		libraryManagementApplication.setBookid(id);
		System.out.println(libraryManagementApplication.getBookid());
		libraryService.getID();
		return "redirect:/available";
	}
	
	@GetMapping("/allocated")
	public String allocatedBooks(Model model,@ModelAttribute Allocation allocation) {
		//model.addAttribute("issue", libraryService.allocationBook(allocation));
		model.addAttribute("issue", libraryService.allocationBooks());
		return "allocated";
	}
	
	@GetMapping("/")
	public String dashboard() {
		return "dashboard";
	}
	
	@GetMapping("/finedetail")
	public String fineDetail(Model model,@ModelAttribute Fine fine) {
		
		//libraryService.saveFine(fine);
		model.addAttribute("fine", libraryService.fineDetails());
		return "finedetail";
	}
	
	@GetMapping("/fineadd/{id}")
	public String getAllocationId(@PathVariable Long id) {
		
		//System.out.println(id);
		//System.out.println(date);
		libraryManagementApplication.setAllocationid(id);
		libraryService.getAllocationId();
		return "redirect:/allocated";
	}
	
//	@PostMapping("/Fine")
//	public String fine(@ModelAttribute Fine fine) {
//		libraryService.saveFine(fine);
//		return "redirect:/";
//	}
	
	@PostMapping("/Issue")
	public String book(@ModelAttribute Allocation allocation) {
		//allocation.setParameter("bookid", allocation.getBookid());
		System.out.println("working");
		
		if(libraryManagementApplication.getIsTrue().equals("hari")) {
			System.out.println("True");
		//libraryManagementApplication.setIsTrue("");
			libraryService.allocationBook(allocation);
			return "redirect:/";		
		}
		return "redirect:/login";
			
	}
	
	@GetMapping("/issue")
	public String issue() {
		return "issue";
	}
	
	@PostMapping("/Returned")
	public String returnBook(@ModelAttribute Fine fine) {
		libraryService.returnBook(fine);
		return "returned";
	}
}
