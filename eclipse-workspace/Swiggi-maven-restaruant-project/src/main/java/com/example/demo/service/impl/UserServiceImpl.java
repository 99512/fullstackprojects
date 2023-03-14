package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CartRepository;
import com.example.demo.Repository.DishRepository;
import com.example.demo.Repository.DishTypeRepository;
import com.example.demo.Repository.RestaurentRepository;
import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.Cart;
import com.example.demo.entity.Dish;
import com.example.demo.entity.Dishtype;
import com.example.demo.entity.Restaurantregistration;

import com.example.demo.entity.User;
import com.example.demo.model.Dishtable;
import com.example.demo.model.RestaurantNameAndID;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestaurentRepository restaurentRepository;

	@Autowired
	private DishRepository dishRepository;

	@Autowired
	private DishTypeRepository dishTypeRepository;

	@Autowired
	private CartRepository cartRepository;

	@Override
	public List<User> getAllUser() {

		return userRepository.findAll();
	}

	@Override
	public User saveUsers(User user) {

		return userRepository.save(user);
	}

	@Override
	public List<Dish> getAlldish() {

		return dishRepository.findAll();
	}

	@Override
	public Dish saveDish(Dish dish) {

		return dishRepository.save(dish);
	}

	@Override
	public List<Restaurantregistration> getAllRestaurant() {

		return restaurentRepository.findAll();
	}

	@Override
	public Restaurantregistration saverestaurant(Restaurantregistration registration) {

		return restaurentRepository.save(registration);
	}

	@Override
	public Restaurantregistration getRestaurantById(Long id) {

		return restaurentRepository.findById(id).get();

	}

	@Override
	public Restaurantregistration UpdateRestaurant(Restaurantregistration registration) {

		return restaurentRepository.save(registration);
	}

	@Override
	public void deleteRestaurantById(Long id) {

		restaurentRepository.deleteById(id);

	}

	@Override
	public Dish getdishbyid(Long id) {

		return dishRepository.findById(id).get();

	}

	@Override
	public Dish updatedish(Dish dish) {

		return dishRepository.save(dish);
	}

	@Override
	public void deletedishbyid(Long id) {
		dishRepository.deleteById(id);

	}

	@Override
	public User getUserByid(Long id) {

		return userRepository.findById(id).get();
	}

	@Override
	public User updateuser(User user) {

		return userRepository.save(user);
	}

	@Override
	public void deleteUserbyId(Long id) {
		userRepository.deleteById(id);
		;

	}

	@Override
	public void saveAllFilesList(List<Restaurantregistration> fileList) {

		for (Restaurantregistration registration : fileList)
			restaurentRepository.save(registration);

	}

	@Override
	public List<Dish> findBydishname(String dishname) {

		return dishRepository.findAll();
	}

	@Override
	public List<Dishtype> getAllDishtypes() {

		return dishTypeRepository.findAll();
	}

	@Override
	public Dishtype savedishtype(Dishtype dishtype) {

		return dishTypeRepository.save(dishtype);
	}

	@Override
	public Dishtype getdishtypeByid(Long id) {

		return dishTypeRepository.findById(id).get();
	}

	@Override
	public Dishtype updatedishtype(Dishtype dishtype) {

		return dishTypeRepository.save(dishtype);
	}

	@Override
	public void deletedishtypebyId(Long id) {
		dishTypeRepository.deleteById(id);

	}

	@Override
	public Cart saveCartpageByusingDishDatails(Cart cart) {

		return cartRepository.save(cart);
	}

	@Override
	public List<Cart> getAllCartPageDatails() {

		return cartRepository.findAll();
	}

	@Override
	public void deletecartbyid(Long id) {
		cartRepository.deleteById(id);

	}

}
