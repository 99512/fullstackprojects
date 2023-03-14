package com.example.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.StudentService;

@RestController 
public class StudentController {
	
	private StudentService StudentService;

	public StudentController(StudentService studentService) {
		super();
		this.StudentService= studentService;   
	}
	
	// handler method to handle list students and return mode and view
	@GetMapping("/stu")
	public String listStudent(Model model) {
    	model.addAttribute("students",StudentService.getAllStudents());
     	return "students";
		
		
	}
	
	

} 
