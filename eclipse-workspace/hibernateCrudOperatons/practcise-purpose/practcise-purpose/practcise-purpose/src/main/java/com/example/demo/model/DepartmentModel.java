package com.example.demo.model;

public class DepartmentModel {

	private Long id;
	private String departmentname;
	
	public DepartmentModel() {
		
	}

	public DepartmentModel(Long id, String departmentname) {
		
		this.id = id;
		this.departmentname = departmentname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	@Override
	public String toString() {
		return "DepartmentModel [id=" + id + ", departmentname=" + departmentname + "]";
	}
	
	
}
