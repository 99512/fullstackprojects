package loki.spring.demo;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstname;
	private String lastname;
	
	private String country;
	
	private String radio;
	
	private String[] checkbox; 
	private LinkedHashMap<String, String> Countryoption;
	
	public Student() {
		Countryoption=new LinkedHashMap<>();
		Countryoption.put("br", "Brigil");
		Countryoption.put("ind", "india");
		Countryoption.put("blg", "Bangladesh");
		Countryoption.put("us", "usa");
		
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public LinkedHashMap<String, String> getCountryoption() {
		return Countryoption;
	}

	public String getRadio() {
		return radio;
	}

	public void setRadio(String radio) {
		this.radio = radio;
	}

	public String[] getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(String[] checkbox) {
		this.checkbox = checkbox;
	}
	

}
