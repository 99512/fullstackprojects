package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Cart;
import com.example.demo.entity.Dish;
import com.example.demo.entity.Dishtype;
import com.example.demo.entity.Restaurantregistration;
import com.example.demo.entity.User;

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

	List<Dishtype> getAllDishtypes();

	Dishtype savedishtype(Dishtype dishtype);

	Dishtype getdishtypeByid(Long id);

	Dishtype updatedishtype(Dishtype dishtype);

	void deletedishtypebyId(Long id);

	Cart saveCartpageByusingDishDatails(Cart cart);

	List<Cart> getAllCartPageDatails();

	void deletecartbyid(Long id);
}
