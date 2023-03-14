package com.example.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class libraryManagementApplication {

	
	public static Long id;
	public static String isTrue="";
	public static Long bookid;
	public static Long allocationid;
	public static Date date;
	public static Date returnDate;
	public static int amount;
	
	public static Long getId() {
		return id;
	}


	public static void setId(Long id) {
		libraryManagementApplication.id = id;
	}


	public static String getIsTrue() {
		return isTrue;
	}


	public static void setIsTrue(String isTrue) {
		libraryManagementApplication.isTrue = isTrue;
	}


	public static Long getBookid() {
		return bookid;
	}


	public static void setBookid(Long bookid) {
		libraryManagementApplication.bookid = bookid;
	}


	public static Long getAllocationid() {
		return allocationid;
	}


	public static void setAllocationid(Long allocationid) {
		libraryManagementApplication.allocationid = allocationid;
	}

	public static Date getDate() {
		return date;
	}


	public static void setDate(Date date) {
		libraryManagementApplication.date = date;
	}


	public static Date getReturnDate() {
		return returnDate;
	}


	public static void setReturnDate(Date returnDate) {
		libraryManagementApplication.returnDate = returnDate;
	}


	public static int getAmount() {
		return amount;
	}


	public static void setAmount(int amount) {
		libraryManagementApplication.amount = amount;
	}


	public static void main(String[] args) {
		SpringApplication.run(libraryManagementApplication.class, args);
	}

}
