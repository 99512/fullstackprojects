package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Dish;




public interface DishRepository extends JpaRepository<Dish, Long>{
	
	@Query("select u from Dish u")
	public List<Dish> getAllDishimages();
	
}


