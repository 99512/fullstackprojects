package com.example.demo.model;

public class RestaurantIdInDishTable {
	
	private Long dish_id;
	
	private String dish_name;
	
	private String price;
	
	private String Restaurant_id;
	
    private String dish_images;

	

	public RestaurantIdInDishTable(Long dish_id, String dish_name, String price, String restaurant_id,
			String dish_images) {
		super();
		this.dish_id = dish_id;
		this.dish_name = dish_name;
		this.price = price;
		Restaurant_id = restaurant_id;
		this.dish_images = dish_images;
	}

	public String getDish_images() {
		return dish_images;
	}

	public void setDish_images(String dish_images) {
		this.dish_images = dish_images;
	}

	public Long getDish_id() {
		return dish_id;
	}

	public void setDish_id(Long dish_id) {
		this.dish_id = dish_id;
	}

	public String getDish_name() {
		return dish_name;
	}

	public void setDish_name(String dish_name) {
		this.dish_name = dish_name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getRestaurant_id() {
		return Restaurant_id;
	}

	public void setRestaurant_id(String restaurant_id) {
		Restaurant_id = restaurant_id;
	}

	@Override
	public String toString() {
		return "RestaurantIdInDishTable [dish_id=" + dish_id + ", dish_name=" + dish_name + ", price=" + price
				+ ", Restaurant_id=" + Restaurant_id + "]";
	}


	
}
