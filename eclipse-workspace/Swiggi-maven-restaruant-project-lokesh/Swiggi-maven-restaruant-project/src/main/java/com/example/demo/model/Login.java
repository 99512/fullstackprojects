package com.example.demo.model;

public class Login {

	private Integer user_id;

	private String email;

	private String first_Name;

	private String pwd;

	public Login() {

	}

	public Login(Integer user_id, String email, String password, String first_Name) {
		this.user_id = user_id;
		this.email = email;
		this.pwd = password;
		this.first_Name = first_Name;
	}

	@Override
	public String toString() {
		return "Login [user_id=" + user_id + ", email=" + email + ", first_Name=" + first_Name + ", pwd=" + pwd + "]";
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

}
