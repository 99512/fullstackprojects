package com.example.demo.model;

public class RestaurantNameAndID {

	private Integer Restaurant_id;

	private String Restaurant_Name;

	@Override
	public String toString() {
		return "RestaurantNameAndID [Restaurant_id=" + Restaurant_id + ", Restaurant_Name=" + Restaurant_Name + "]";
	}

	public RestaurantNameAndID() {

	}

	public RestaurantNameAndID(Integer restaurant_id, String restaurant_Name) {
		super();
		Restaurant_id = restaurant_id;
		Restaurant_Name = restaurant_Name;
	}

	public Integer getRestaurant_id() {
		return Restaurant_id;
	}

	public void setRestaurant_id(Integer restaurant_id) {
		Restaurant_id = restaurant_id;
	}

	public String getRestaurant_Name() {
		return Restaurant_Name;
	}

	public void setRestaurant_Name(String restaurant_Name) {
		Restaurant_Name = restaurant_Name;
	}

}
