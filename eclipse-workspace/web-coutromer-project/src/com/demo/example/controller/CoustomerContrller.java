package com.demo.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.example.controller.dao.CustomerDao;
import com.demo.example.controller.entity.Coustomer;





@Controller 

public class CoustomerContrller {
	
	
	@Autowired
	private CustomerDao customerDao;
	
	
	@GetMapping("/loki")
	public String listCoutomer(Model model) {
		List<Coustomer> theCustomers = customerDao.getCustomers();
		
		// add the customers to the model
		model.addAttribute("customers", theCustomers);
		return "List_coustomer";
	}
	@GetMapping("/loki1")
	public String loki() {
		
		return "List_coustomer";
	}
	

}
