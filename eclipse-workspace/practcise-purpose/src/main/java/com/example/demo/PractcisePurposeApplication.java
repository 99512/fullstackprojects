package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.impl.EmployeeJPa;

@SpringBootApplication
public class PractcisePurposeApplication implements CommandLineRunner {
 
	
	
	private static final Logger logger = LoggerFactory.getLogger(PractcisePurposeApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(PractcisePurposeApplication.class, args);
	}
	
	
	@Autowired
	EmployeeJPa employeeJPa;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		//logger.info("lokiis --{}",employeeJPa.getbyId(1001)); 
//	    loger.info("lokiis --{}",employeeDao.findAll());
////	    loger.info("lokiis --{}",employeeDao.getbyId(1001)); 
////	    loger.info("lokiis --{}",employeeDao.update("ramesh", "22lkok", "sorry", 1001));
////	    loger.info("lokiis --{}", employeeDao.delete(1002)); 
//	    loger.info("lokiis --{}", employeeDao.updateEmployee(new  Employee((long) 1001,"lokesh","naveen","lokesh@bsol"))); 
//	    loger.info("lokiis --{}", employeeDao.insert(new  Employee((long) 10012,"lokesh","naveen","lokesh@bsol")));
//	    loger.info("lokiis --{}",employeeDao.findAll());
	}


}
