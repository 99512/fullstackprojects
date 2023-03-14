package com.example.demo.model;

public class Dishtype {
	
	
	private String dishtype;
	private String dishtype_status;
	private Integer type_id;

	public Dishtype() {
		
	}
	
		public Dishtype(String dishtype, String dishtype_status, Integer type_id) {
		super();
		this.dishtype = dishtype;
		this.dishtype_status = dishtype_status;
		this.type_id = type_id;
	}







	public Integer getType_id() {
		return type_id;
	}



	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}



	public String getDishtype_status() {
		return dishtype_status;
	}



	public void setDishtype_status(String dishtype_status) {
		this.dishtype_status = dishtype_status;
	}



	public String getDishtype() {
		return dishtype;
	}

	public void setDishtype(String dishtype) {
		this.dishtype = dishtype;
	}
	
	
	

}
