package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@Column(name = "student_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	
	@Column(name = "student_name")
	private String name;
	
	@Column(name = "department")
	private String department;
	
	@Column(name = "year")
	private String year;
	
	@Column(name = "session")
	private String session;
	
	@Column(name = "major_subject")
	private String major;
	
	@Column(name = "minor_subject")
	private String minor;
	
	@Column(name = "rollno")
	private String rollno;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "email")
	private String email;
	
	public Student() {
		
	}

	public Student(String name, String department, String year, String session, String major, String minor,
			String rollno, String password, String email) {
		
		this.name = name;
		this.department = department;
		this.year = year;
		this.session = session;
		this.major = major;
		this.minor = minor;
		this.rollno = rollno;
		this.password = password;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getMinor() {
		return minor;
	}

	public void setMinor(String minor) {
		this.minor = minor;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", year=" + year + ", session="
				+ session + ", major=" + major + ", minor=" + minor + ", rollno=" + rollno + ", password=" + password
				+ ", email=" + email + "]";
	}
		
}
