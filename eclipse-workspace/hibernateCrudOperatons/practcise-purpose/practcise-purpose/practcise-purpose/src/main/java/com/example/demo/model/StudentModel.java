package com.example.demo.model;

public class StudentModel {
	
	private Long id;
	private String name;
	private String department;
	private String year;
	private String session;
	private String major;
	private String minor;
	private String rollno;
	private String password;
	
	public StudentModel() {
		
	}

	public StudentModel(String name, String department, String year, String session, String major,
			String minor, String rollno, String password) {
		
	
		this.name = name;
		this.department = department;
		this.year = year;
		this.session = session;
		this.major = major;
		this.minor = minor;
		this.rollno = rollno;
		this.password = password;
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
	
	
	
}
