package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "restaurant")
public class Restaurantregistration {
	@Id
	@Column(name = "Restaurant_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "Restaurant_Name")
	private String name;

	@Column(name = "Restaurant_number")
	private String number;
	private String ratings;
	private String pincode;
	private String address;
	private String landmark;
	private String filetype;
	private String Restaurant_status;
	private String dishtype;
	@Lob
	@Column(name = "restaurnat_images", columnDefinition = "mediumblob")
	private String images;

	public Restaurantregistration(String name, String number, String ratings, String pincode, String address,
			String landmark, String filetype, String restaurant_status, String images) {
		super();

		this.name = name;
		this.number = number;
		this.ratings = ratings;
		this.pincode = pincode;
		this.address = address;
		this.landmark = landmark;
		this.filetype = filetype;
		Restaurant_status = restaurant_status;
		this.images = images;
	}

	public Restaurantregistration(String name, String number, String ratings, String pincode, String address,
			String landmark, String filetype, String images) {
		super();
		this.name = name;
		this.number = number;
		this.ratings = ratings;
		this.pincode = pincode;
		this.address = address;
		this.landmark = landmark;
		this.filetype = filetype;
		this.images = images;
	}

	public Restaurantregistration() {

	}

	public String getFiletype() {
		return filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getRatings() {
		return ratings;
	}

	public void setRatings(String ratings) {
		this.ratings = ratings;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getRestaurant_status() {
		return Restaurant_status;
	}

	public void setRestaurant_status(String restaurant_status) {
		Restaurant_status = restaurant_status;
	}

}
