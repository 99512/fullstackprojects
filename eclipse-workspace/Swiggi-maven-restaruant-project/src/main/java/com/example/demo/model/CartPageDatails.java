package com.example.demo.model;

public class CartPageDatails {

	private Long item_id;

	private Integer user_id;

	private String cart_price;

	private String dish_name;

	private String cart_dish_image;

	public CartPageDatails() {

	}

	public CartPageDatails(Long item_id, Integer user_id, String cart_price, String dish_name, String cart_dish_image) {
		super();
		this.item_id = item_id;
		this.user_id = user_id;
		this.cart_price = cart_price;
		this.dish_name = dish_name;
		this.cart_dish_image = cart_dish_image;
	}

	public Long getItem_id() {
		return item_id;
	}

	public void setItem_id(Long item_id) {
		this.item_id = item_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getCart_price() {
		return cart_price;
	}

	public void setCart_price(String cart_price) {
		this.cart_price = cart_price;
	}

	public String getDish_name() {
		return dish_name;
	}

	public void setDish_name(String dish_name) {
		this.dish_name = dish_name;
	}

	public String getCart_dish_image() {
		return cart_dish_image;
	}

	public void setCart_dish_image(String cart_dish_image) {
		this.cart_dish_image = cart_dish_image;
	}

}
