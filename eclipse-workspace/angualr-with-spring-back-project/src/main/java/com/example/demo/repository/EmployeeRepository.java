package com.example.demo.repository;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
@Repository
@ComponentScan
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	
	List<Employee> findByFirstName(String firstName);

	@Query("SELECT u FROM Employee u")
	List<Employee> findUserByStatus();
	@Query(value="SELECT * FROM employee",nativeQuery = true)
	List<Employee> getall();
}
