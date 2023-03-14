package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fine")
public class Fine {
	

	@Id
	@Column(name = "fine_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	
	@Column(name = "student_id")
	private Long studentid;
	
	@Column(name = "allocation_id")
	private Long allocationid;
	
	@Column(name = "fine_amount")
	private int amount;
	
	@Column(name = "fine_date")
	private String date;
	
	@Column(name = "reason")
	private String reason;
	
	@Column(name = "status")
	private String status;

	public Fine() {
		
	}

	public Fine(Long studentid, Long allocationid, int amount, String date, String reason, String status) {
		super();
		this.studentid = studentid;
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

	public Long getStudentid() {
		return studentid;
	}

	public void setStudentid(Long studentid) {
		this.studentid = studentid;
	}

	public Long getAllocationid() {
		return allocationid;
	}

	public void setAllocationid(Long allocationid) {
		this.allocationid = allocationid;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
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

	@Override
	public String toString() {
		return "Fine [id=" + id + ",studentid=" + studentid + ", allocationid=" + allocationid
				+ ", amount=" + amount + ", date=" + date + ", reason=" + reason + ", status=" + status + "]";
	}

}
