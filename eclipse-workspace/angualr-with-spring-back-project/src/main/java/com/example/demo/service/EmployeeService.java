package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository  employeeRepository;

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public void deletebyName(String name) {
		
		jdbcTemplate.update("delete from employee where first_name=?",new Object[] {name});
	}
	
	
	
}
