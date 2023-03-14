package com.example.demo.model;


public class RestaurantNameAndID {

	private Long Restaurant_id;

    
	private String Restaurant_Name;

	@Override
	public String toString() {
		return "RestaurantNameAndID [Restaurant_id=" + Restaurant_id + ", Restaurant_Name=" + Restaurant_Name + "]";
	}

	public RestaurantNameAndID(){}

	public RestaurantNameAndID(Long restaurant_id, String restaurant_Name) {
		Restaurant_id = restaurant_id;
		Restaurant_Name = restaurant_Name;
	}
	

	public Long getRestaurant_id() {
		return Restaurant_id;
	}


	public void setRestaurant_id(Long restaurant_id) {
		Restaurant_id = restaurant_id;
	}


	public String getRestaurant_Name() {
		return Restaurant_Name;
	}
	public void setRestaurant_Name(String restaurant_Name) {
		Restaurant_Name = restaurant_Name;
	}
	

	
}
