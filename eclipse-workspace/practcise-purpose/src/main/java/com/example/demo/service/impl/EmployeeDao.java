package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Employee> findAll() {

		return jdbcTemplate.query("select * from employee", new BeanPropertyRowMapper(Employee.class));
	}

	@SuppressWarnings("deprecation")
	public Employee getbyId(int id) {
		return jdbcTemplate.queryForObject("select * from employee where id=?", new Object[] { id },
				new BeanPropertyRowMapper<>(Employee.class));
	}

	public int delete(int id) {

		return jdbcTemplate.update("delete from employee where id=?", id);
	}

	public int update(String firstName, String LastName, String Email, int id) {

		return jdbcTemplate.update("update employee set firstName=?, lastName=? ,email=? where id=?", firstName,
				LastName, Email, id);
	}

	public int insert(Employee emloyee) {

		return jdbcTemplate.update("insert into employee (firstName, lastName,email ,id) values(?,?,?,?) ",
				new Object[] { emloyee.getFirstName(), emloyee.getLastName(), emloyee.getEmail(), emloyee.getId() });
	}

	public int updateEmployee(Employee emloyee) {

		return jdbcTemplate.update("update employee set firstName=?, lastName=? ,email=? where id=?",
				new Object[] { emloyee.getFirstName(), emloyee.getLastName(), emloyee.getEmail(), emloyee.getId() });
	}
}
