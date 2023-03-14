package com.example.demo.model;

import java.util.Date;

public class AllocationModel {
	
	private Long allocation_id;
	private Long bookid;
	private Long student_id;
	private Date issue_date;
	private Date return_date;
	private String bookname;
	private String student_name;
	
	public AllocationModel() {
		
	}

	public AllocationModel(Long allocation_id, Long bookid, Long student_id, Date issue_date, Date return_date,
			String bookname, String student_name) {
		
		this.allocation_id = allocation_id;
		this.bookid = bookid;
		this.student_id = student_id;
		this.issue_date = issue_date;
		this.return_date = return_date;
		this.bookname = bookname;
		this.student_name = student_name;
	}

	public Long getAllocation_id() {
		return allocation_id;
	}

	public void setAllocation_id(Long allocation_id) {
		this.allocation_id = allocation_id;
	}

	public Long getBookid() {
		return bookid;
	}

	public void setBookid(Long bookid) {
		this.bookid = bookid;
	}

	public Long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}

	public Date getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}

	public Date getReturn_date() {
		return return_date;
	}

	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	@Override
	public String toString() {
		return "AllocationModel [allocation_id=" + allocation_id + ", bookid=" + bookid + ", student_id=" + student_id
				+ ", issue_date=" + issue_date + ", return_date=" + return_date + ", bookname=" + bookname
				+ ", student_name=" + student_name + "]";
	}

	

}