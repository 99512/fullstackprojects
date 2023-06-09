package com.example.demo.model;

public class LoginModel {
	
	private Long id;
	private String email;
	private String password;
	
	public LoginModel() {
		
	}

	public LoginModel(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "LoginModel [id=" + id + ", email=" + email + ", password=" + password + "]";
	}

	
	
}
