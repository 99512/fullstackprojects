package com.example.demo.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.SwiggiMavenRestaruantProjectApplication;
import com.example.demo.model.CartPageDatails;
import com.example.demo.model.Dishtable;
import com.example.demo.model.Dishtype;
import com.example.demo.model.RestaurantIdInDishTable;
import com.example.demo.model.RestaurantNameAndID;

@Service
public class RestaurantRegistrationImpl {

	@Autowired
	private EntityManager entityManager;

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<RestaurantNameAndID> nameID() {

		Query nameid = entityManager.createNativeQuery("select Restaurant_id , Restaurant_Name from restaurant")
				.unwrap(NativeQuery.class).setResultTransformer(Transformers.aliasToBean(RestaurantNameAndID.class));

		return (List<RestaurantNameAndID>) nameid.getResultList();
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Dishtype> dishtype() {

		Query nameid = entityManager.createNativeQuery("select dishtype,type_id from dishtype")
				.unwrap(NativeQuery.class).setResultTransformer(Transformers.aliasToBean(Dishtype.class));

		return (List<Dishtype>) nameid.getResultList();
	}

	public List<Dishtable> dishAndRestaurantDatails(String dishName) {
		Query query = entityManager.createQuery(
				"SELECT new com.example.demo.model.Dishtable(d.id,d.price,d.dishname,d.images,r.images,r.name,r.id) FROM Dish d INNER JOIN Restaurantregistration r ON d.Restaurantid=CONCAT(r.id, '') WHERE d.dishname LIKE concat('%',:dishName,'%')");
		query.setParameter("dishName", dishName);
		List<Dishtable> resultList = query.getResultList();

		return resultList;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<com.example.demo.model.Login> Login() {

		Query nameid = entityManager.createNativeQuery("select email,user_id,pwd ,first_Name from user")
				.unwrap(NativeQuery.class)
				.setResultTransformer(Transformers.aliasToBean(com.example.demo.model.Login.class));

		return (List<com.example.demo.model.Login>) nameid.getResultList();
	}

	public List<CartPageDatails> dishandcartDatails() {
		Query query = entityManager.createQuery(
				"SELECT new com.example.demo.model.CartPageDatails(d.id,d.userid,d.price,d.dishname,d.Images) FROM Cart d  WHERE d.userid LIKE concat('%',:dishName,'%')");
		Integer dishName = SwiggiMavenRestaruantProjectApplication.getUserID();
		System.out.println(SwiggiMavenRestaruantProjectApplication.getUserID());
		query.setParameter("dishName", dishName);
		List<CartPageDatails> resultList = query.getResultList();

		return resultList;
	}
	
	public List<CartPageDatails> allDatailsOfCart() {
		Query query = entityManager.createQuery(
				"SELECT new com.example.demo.model.CartPageDatails(d.id,d.userid,d.price,d.dishname,d.Images) FROM Cart d");
		
		
		List<CartPageDatails> resultList = query.getResultList();

		return resultList;
	}

	public List<Dishtable> dishAndRestaurantDatailsforcartpage() {
		
		Query query = entityManager.createQuery(
				"SELECT new com.example.demo.model.Dishtable(d.id,d.price,d.dishname,d.images,r.images,r.name,r.id) FROM Dish d INNER JOIN Restaurantregistration r ON d.Restaurantid=CONCAT(r.id, '')");

		List<Dishtable> resultList = query.getResultList();

		return resultList;
	}

	public List<RestaurantIdInDishTable> RestaurantIdInDishTablde() {
		Query query = entityManager.createQuery(
				"SELECT new com.example.demo.model.RestaurantIdInDishTable(d.id,d.dishname,d.price,d.Restaurantid,d.images) FROM Dish d  WHERE d.Restaurantid LIKE concat('%',:dishName,'%')");
		Long dishName = SwiggiMavenRestaruantProjectApplication.getRestaurantid();
		System.out.println(SwiggiMavenRestaruantProjectApplication.getRestaurantid()+"this is so imp");
		query.setParameter("dishName", dishName);
		List<RestaurantIdInDishTable> resultList = query.getResultList();

		return resultList;
	}
	
	public List<RestaurantIdInDishTable> searchbydishname() {
		Query query = entityManager.createQuery(
				"SELECT new com.example.demo.model.RestaurantIdInDishTable(d.id,d.dishname,d.price,d.Restaurantid,d.images) FROM Dish d  WHERE d.dishname LIKE concat('%',:dishName,'%')");
		String dishName = SwiggiMavenRestaruantProjectApplication.getSearchdishname();
		System.out.println(SwiggiMavenRestaruantProjectApplication.getSearchdishname()+"this is so imp");
		query.setParameter("dishName", dishName);
		List<RestaurantIdInDishTable> resultList = query.getResultList();

		return resultList;
	}
	
	public List<Dishtable> searchbyrestaurantname() {
		
		Query query = entityManager.createQuery(
				"SELECT new com.example.demo.model.Dishtable(d.id,d.price,d.dishname,d.images,r.images,r.name,r.id) FROM Dish d INNER JOIN Restaurantregistration r ON d.Restaurantid=CONCAT(r.id, '') WHERE r.name LIKE concat('%',:dishName,'%')");
		String dishName = SwiggiMavenRestaruantProjectApplication.getSearchByrestaurantName();
		query.setParameter("dishName", dishName);
		List<Dishtable> resultList = query.getResultList();

		return resultList;
	}
	public List<Dishtable> forVegrestaurant() {
		
		
		Query query = entityManager.createQuery(
				"SELECT new com.example.demo.model.Dishtable(d.price,d.dishname,d.images,d.type,r.images,r.name,r.id) FROM Dish d INNER JOIN Restaurantregistration r ON d.Restaurantid=CONCAT(r.id, '') WHERE d.type LIKE concat('%',:dishName,'%')");
		String dishName = SwiggiMavenRestaruantProjectApplication.getVegItems();
		query.setParameter("dishName", dishName);
		List<Dishtable> resultList = query.getResultList();

		return resultList;
	}
	
}
