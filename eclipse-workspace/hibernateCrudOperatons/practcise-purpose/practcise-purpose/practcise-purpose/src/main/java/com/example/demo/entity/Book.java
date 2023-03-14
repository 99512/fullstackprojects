package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	
	@Id
	@Column(name = "bookid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long bookid;
	
	@Column(name = "isbn_id")
	private String isbnid;
	
	@Column(name = "bookname")
	private String bookname;
	
	@Column(name = "author")
	private String author;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "available")
	private int available;
	
//	@Column(name = "allocated")
//	private int allocated;

	public Book() {
		
	}

	public Book(String isbnid, String bookname, String author, String category, int available, int allocated) {
		
		this.isbnid = isbnid;
		this.bookname = bookname;
		this.author = author;
		this.category = category;
		this.available = available;
		//this.allocated = allocated;
	}

	public Long getBookid() {
		return bookid;
	}

	public void setBookid(Long bookid) {
		this.bookid = bookid;
	}

	public String getIsbnid() {
		return isbnid;
	}

	public void setIsbnid(String isbnid) {
		this.isbnid = isbnid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

//	public int getAllocated() {
//		return allocated;
//	}
//
//	public void setAllocated(int allocated) {
//		this.allocated = allocated;
//	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", isbnid=" + isbnid + ", bookname=" + bookname + ", author=" + author
				+ ", category=" + category + ", available=" + available + "]";
	}
	
}
