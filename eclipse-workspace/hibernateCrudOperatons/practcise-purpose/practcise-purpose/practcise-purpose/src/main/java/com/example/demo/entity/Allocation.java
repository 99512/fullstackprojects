package com.example.demo.entity;


import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "allocated_books")
public class Allocation {


	@Id
	@Column(name = "allocation_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	
	@Column(name = "bookid")
	private Long bookid;
	
	@Column(name = "student_id")
	private Long studentid;
	
	@Column(name = "issue_date")
//	@Temporal(TemporalType.TIMESTAMP)
	private Date issuedate;
		
	@Column(name = "return_date")
//	@Temporal(TemporalType.TIMESTAMP)
	private Date returndate;


	public Allocation() {
		
	}

	public Allocation( Long bookid, Long studentid, Date issuedate, Date returndate) {
		
		
		this.bookid = bookid;
		this.studentid = studentid;
		this.issuedate = issuedate;
		this.returndate = returndate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getIssuedate() {
		return issuedate;
	}

	public void setIssuedate(Date issuedate) {
		this.issuedate = issuedate;
	}

	public Date getReturndate() {
		return returndate;
	}

	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}

	public Long getBookid() {
		return bookid;
	}


	public void setBookid(Long bookid) {
		this.bookid = bookid;
	}

	public Long getStudentid() {
		return studentid;
	}

	public void setStudentid(Long studentid) {
		this.studentid = studentid;
	}

	@Override
	public String toString() {
		return "Allocation [id=" + id + ", issuedate=" + issuedate + ", returndate=" + returndate + ", bookid=" + bookid
				+ ", studentid=" + studentid + "]";
	}


	
}
