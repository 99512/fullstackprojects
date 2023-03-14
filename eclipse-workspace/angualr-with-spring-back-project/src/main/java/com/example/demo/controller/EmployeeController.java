package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
@CrossOrigin(origins = "http://localhost:4300")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository  employeeRepository;

	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/employees")
	public List<Employee> getAllEmoployees(){
	System.out.println(employeeRepository.getall());
		return employeeRepository.findAll();
		
	}
	//crate employee restapi
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		System.out.println("this is lokesh");
		System.out.println(employee.getEmail());
	
		return employeeRepository.save(employee);
	}
	
	//Get employeee by id
	@GetMapping("employees/{id}")
	public ResponseEntity<Employee> getEmployeeByID(@PathVariable long id) {
		
		
		Employee employee=employeeRepository.findById(id).get();
		return ResponseEntity.ok(employee);
	}
	//update employee rest api
	@PutMapping("employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,@RequestBody Employee employeeDatails){
		Employee employee=employeeRepository.findById(id).get();
		
		employee.setFirstName(employeeDatails.getFirstName());
		employee.setLastName(employeeDatails.getLastName());
		employee.setEmail(employeeDatails.getEmail());
		employee.setPassword(employeeDatails.getPassword());
		Employee updateEmployee =employeeRepository.save(employee);
		return ResponseEntity.ok(updateEmployee);
	}
	//delete by id in angular
	@DeleteMapping("employees/{id}")
	public ResponseEntity<Map<String,Boolean>>deleterEmployee(@PathVariable Long id){
		Employee employee=employeeRepository.findById(id).get();
		employeeRepository.delete(employee);
		Map<String,Boolean> reponse=new HashMap<>();
		reponse.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(reponse);
	}
	@GetMapping("employeesbyname/{name}")
	public ResponseEntity<Employee> deleterEmployeeBYname(@PathVariable String name){
		Employee employee=null;
		System.out.println(employeeRepository.findUserByStatus());
//		for(int i=0;i<employeeRepository.findByFirstName(name).size();i++) {
//			 employee=employeeRepository.findByFirstName(name).get(i);
//			System.out.println(employee);
//			employeeRepository.delete(employee);
//		}
		
		Map<String,Boolean> reponse=new HashMap<>();
		reponse.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(employee);
	}
	
	@GetMapping("employees/loki")
	public String Lokesh() {
		System.out.println("lsjdfskjdf loki is testing some thing");
		return "some imopsdjfsdfj htienwsdfsd";
	}
	@GetMapping("deleteemployees/{name}")
	public String deletebyname(@PathVariable String  name) {
		System.out.println(name);
	this.employeeService.deletebyName(name);
		return "some imopsdjfsdfj htienwsdfsd";
	}
}
