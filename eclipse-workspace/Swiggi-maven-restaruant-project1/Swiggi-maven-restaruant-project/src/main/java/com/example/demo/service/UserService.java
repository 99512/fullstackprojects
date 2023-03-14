package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Dish;


import com.example.demo.entity.Restaurantregistration;
import com.example.demo.entity.User;
import com.example.demo.model.Dishtable;
import com.example.demo.model.RestaurantNameAndID;



@Service
public interface UserService {
	
	
	
	List<User> getAllUser();	
	User saveUsers(User user);
	
	User getUserByid(Long id);
	User updateuser(User user);

	void deleteUserbyId(Long id);
	
	List<Dish> getAlldish();
	Dish saveDish(Dish dish);
	
    List<Dish> findBydishname(String dishname);
	
	Dish getdishbyid(Long id);
	Dish updatedish(Dish dish);
	
	void deletedishbyid(Long id);
	
	List<Restaurantregistration> getAllRestaurant();
    Restaurantregistration saverestaurant(Restaurantregistration registration);
    
    
	Restaurantregistration getRestaurantById(Long id);
	Restaurantregistration UpdateRestaurant(Restaurantregistration registration);
	
	 void saveAllFilesList(List<Restaurantregistration> fileList);
		
	void deleteRestaurantById(Long id);
	

	
	//List<RestaurantNameAndID> findIdName();
      
	
	
}
