package com.example.service.impl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.service.StudentService;
import com.example.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
		
	private StudentRepository StudentRepository;
	
	
	public StudentServiceImpl(com.example.repository.StudentRepository studentRepository) {
		super();
		StudentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {

		return StudentRepository.findAll();
	}
	
	
	

}
