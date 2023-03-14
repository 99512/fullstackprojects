package com.example.demo.model;

public class BookModel {
	
	private Long bookid;
	private String isbnid;
	private String bookname;
	private String author;
	private String category;
	private String available;
	//private String allocated;
	
	public BookModel() {
		
	}

	public BookModel(Long bookid, String isbnid, String bookname, String author, String category, String available,
			String allocated) {
		
		this.bookid = bookid;
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

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

//	public String getAllocated() {
//		return allocated;
//	}
//
//	public void setAllocated(String allocated) {
//		this.allocated = allocated;
//	}
	
	
}
