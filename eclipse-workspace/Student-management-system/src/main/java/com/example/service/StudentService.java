package com.example.service;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.example.entity.Student;

@Repository
public interface StudentService {
	
	List<Student> getAllStudents();

}
