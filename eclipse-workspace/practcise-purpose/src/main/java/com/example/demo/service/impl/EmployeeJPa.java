package com.example.demo.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository

public class EmployeeJPa {
	
	
	@Autowired
	EntityManager entityManager;
	
	public Employee getbyId(int id) {
		return entityManager.find(Employee.class, id);
	}
      public Employee insert(Employee employee) {
    	  return entityManager.merge(employee);
      }

}
