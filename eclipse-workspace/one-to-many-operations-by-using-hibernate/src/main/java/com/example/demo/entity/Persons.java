package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="persons")
public class Persons {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="first_Name")
	private String firstName;
	@Column(name="last_name")
	private String last_name ;
	
	@Column(name="Email")
	private String email ;
	
	@Column(name="age")
	private String age ;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="pc_fid",referencedColumnName = "id")
	List<PhoneNumber> phoneNumbers=new ArrayList<PhoneNumber>();
	
	public Persons() {
			
	}


	public Persons(String firstName, String last_name, String email, String age) {
		super();
		this.firstName = firstName;
		this.last_name = last_name;
		this.email = email;
		this.age = age;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}


	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}


	public List<PhoneNumber> getComments() {
		return phoneNumbers;
	}


	public void setComments(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
	
	
}
