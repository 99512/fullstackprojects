package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_id")
	private Long id;

	@Column(name = "user_id")
	private Integer userid;

	@Column(name = "cart_price")
	private String price;

	@Column(name = "dish_name")
	private String dishname;

	@Column(name = "cart_dish_image")
	private String Images;

	public Cart() {

	}

	public Cart(Long id, Integer userid, String price, String dishname, String images) {
		super();
		this.id = id;
		this.userid = userid;
		this.price = price;
		this.dishname = dishname;
		Images = images;
	}

	public Cart(Integer userid, String price, String images, String dishname) {
		super();
		this.userid = userid;
		this.price = price;
		Images = images;
		this.dishname = dishname;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", userid=" + userid + ", price=" + price + ", Images=" + Images + ", dishname="
				+ dishname + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getUserid() {
		return userid;
	}

	
	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getImages() {
		return Images;
	}

	public void setImages(String images) {
		Images = images;
	}

	public String getDishname() {
		return dishname;
	}

	public void setDishname(String dishname) {
		this.dishname = dishname;
	}

}
