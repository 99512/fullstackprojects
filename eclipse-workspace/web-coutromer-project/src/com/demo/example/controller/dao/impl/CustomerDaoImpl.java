package com.demo.example.controller.dao.impl;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.example.controller.dao.CustomerDao;
import com.demo.example.controller.entity.Coustomer;

public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Coustomer> getCustomers() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Query<Coustomer> theQuery = 
				currentSession.createQuery("from Customer", Coustomer.class);
		
		// execute query and get result list
		List<Coustomer> customers = theQuery.getResultList();
				
		
		return customers;
	}

}
