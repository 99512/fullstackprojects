package com.example.demo.model;

public class Dishtable {

	private Long dish_id;

	private Long Restaurant_id;

	private String dish_name;

	private String price;

	private String Restaurant_name;

	private String dish_images;

	private String restaurnat_images;

	private String dish_type;

	public Dishtable() {

	}
	
	
	

	public Dishtable(String price, String dish_name,   String dish_images,String dish_type,
			String restaurnat_images,String restaurant_name, Long restaurant_id) {
		super();
		Restaurant_id = restaurant_id;
		this.dish_name = dish_name;
		this.price = price;
		Restaurant_name = restaurant_name;
		this.dish_images = dish_images;
		this.restaurnat_images = restaurnat_images;
		this.dish_type = dish_type;
	}




	public Dishtable(Long dish_id, Long restaurant_id, String dish_name, String price, String restaurant_name) {

		this.dish_id = dish_id;
		Restaurant_id = restaurant_id;
		this.dish_name = dish_name;
		this.price = price;
		Restaurant_name = restaurant_name;

	}

	public Dishtable(Long dish_id, String price, String dish_name, String dish_images, String restaurnat_images,
			String restaurant_name, Long restaurant_id) {

		this.dish_id = dish_id;
		this.Restaurant_id = restaurant_id;
		this.dish_name = dish_name;
		this.price = price;
		this.Restaurant_name = restaurant_name;
		this.dish_images = dish_images;
		this.restaurnat_images = restaurnat_images;

	}

	public Dishtable(Long dish_id, Long restaurant_id, String dish_name, String price, String restaurant_name,
			String dish_images, String restaurnat_images, String images) {
		this.dish_id = dish_id;
		Restaurant_id = restaurant_id;
		this.dish_name = dish_name;
		this.price = price;
		Restaurant_name = restaurant_name;

	}

	public String getDish_type() {
		return dish_type;
	}

	public void setDish_type(String dish_type) {
		this.dish_type = dish_type;
	}

	public Long getDish_id() {
		return dish_id;
	}

	public void setDish_id(Long dish_id) {
		this.dish_id = dish_id;
	}

	public Long getRestaurant_id() {
		return Restaurant_id;
	}

	public void setRestaurant_id(Long restaurant_id) {
		Restaurant_id = restaurant_id;
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

	public String getRestaurant_name() {
		return Restaurant_name;
	}

	public void setRestaurant_name(String restaurant_name) {
		Restaurant_name = restaurant_name;
	}

	public String getDish_images() {
		return dish_images;
	}

	public void setDish_images(String dish_images) {
		this.dish_images = dish_images;
	}

	public String getRestaurnat_images() {
		return restaurnat_images;
	}

	public void setRestaurnat_images(String restaurnat_images) {
		this.restaurnat_images = restaurnat_images;
	}

	@Override
	public String toString() {
		return "Dishtable{" + "dish_id=" + dish_id + ", Restaurant_id=" + Restaurant_id + ", dish_name='" + dish_name
				+ '\'' + ", price='" + price + '\'' + ", Restaurant_name='" + Restaurant_name + '\'' + ", dish_images='"
				+ dish_images + '\'' + ", restaurnat_images='" + restaurnat_images + '\'' + '}';
	}
}
