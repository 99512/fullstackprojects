
package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "dish")
public class Dish {
	@Id
	@Column(name = "dish_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "dish_name" ,unique = true)
	
	private String dishname;

	@Column(name = "price")
	
	private String price;

	@Column(name = "dish_description")
	private String description;
	
	@Column(name="Restaurant_id")
	private String Restaurantid;

	@Column(name = "dish_type")
	private String type;
	@Column(name="Restaurant_name")
	
	private String restaurantname;
	
	 @Lob
	 @Column(name = "dish_images",columnDefinition = "mediumblob")
	 private  String images;
	 
     public Dish() {
	
       }
	public Dish(String dishname,String Restaurantid,String restaurantname, String price, String description, String type, String images) {
		super();
		this.Restaurantid=Restaurantid;
		this.restaurantname=restaurantname;
		this.dishname = dishname;
		this.price = price;
		this.description = description;
		this.type = type;
		this.images = images;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getRestaurantid() {
		return Restaurantid;
	}


	public void setRestaurantid(String restaurantid) {
		Restaurantid = restaurantid;
	}


	public String getRestaurantname() {
		return restaurantname;
	}


	public void setRestaurantname(String restaurantname) {
		this.restaurantname = restaurantname;
	}


	public String getDishname() {
		return dishname;
	}

	public void setDishname(String dishname) {
		this.dishname = dishname;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}


	@Override
	public String toString() {
		return "Dish [id=" + id + ", dishname=" + dishname + ", price=" + price + ", description=" + description
				+ ", Restaurantid=" + Restaurantid + ", type=" + type + ", restaurantname=" + restaurantname
				+ ",]";
	}

}
