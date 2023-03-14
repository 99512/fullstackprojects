package com.example.demo.model;

import java.sql.Date;

public class FineModel {
	
	private Long id;
	private int bookid;
	private String rollno;
	private int allocationid;
	private int amount;
	private Date date;
	private String reason;
	private String status;
	
	public FineModel() {
		
	}

	public FineModel(int bookid, String rollno, int allocationid, int amount, Date date, String reason,
			String status) {
	
		this.bookid = bookid;
		this.rollno = rollno;
		this.allocationid = allocationid;
		this.amount = amount;
		this.date = date;
		this.reason = reason;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public int getBookid() {
		return bookid;
	}


	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public int getAllocationid() {
		return allocationid;
	}


	public void setAllocationid(int allocationid) {
		this.allocationid = allocationid;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getReason() {
		return reason;
	}


	public void setReason(String reason) {
		this.reason = reason;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
