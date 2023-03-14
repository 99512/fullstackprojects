package com.example.demo.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Restaurantregistration;


@Repository
public interface RestaurentRepository extends JpaRepository<Restaurantregistration, Long> {
		
	//@Query(value="select com.example.demo.entity.RestaurantNamiId( a.id,a.name) from Restaurantregistration a", nativeQuery = true) 
	//@Query(value="select Restaurant_id as restaurant_id, Restaurant_Name as restaurant_Name from restaurant  ",nativeQuery =false)
	//@Query(value="select Restaurant_id , Restaurant_Name from restaurant  ",nativeQuery = false)
	//@Query(value="select a.Restaurant_id, a.Restaurant_Name from restaurant a ",nativeQuery = false)
	
	//@Query(value="select a.id, a.name from Restaurantregistration a",nativeQuery = false)
	//List<RestaurantNamiId> findIdAndName();
	

	


}
