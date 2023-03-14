package com.example.demo.Controller;

import java.io.IOException;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.Cart;
import com.example.demo.entity.Dish;
import com.example.demo.entity.Restaurantregistration;

import com.example.demo.model.RestaurantNameAndID;
import com.example.demo.service.UserService;

@Controller
public class UploadController {

	private final String UPLOAD_DIR = "./uploads/";

	@Autowired
	private UserService userService;

	@PostMapping("/upload")
	public String uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("name") String name,
			@RequestParam("number") String number, @RequestParam("ratings") String ratings,
			@RequestParam("Address") String Address, @RequestParam("pincode") String pincode,
			@RequestParam("landmark") String landmark, RedirectAttributes attributes) {
		Restaurantregistration restaurantregistration = new Restaurantregistration();
		System.out.println("inside controller-----");
		if (file.isEmpty()) {
			attributes.addFlashAttribute("message", "Please select a file to upload.");
		}
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		restaurantregistration.setAddress(Address);
		restaurantregistration.setName(name);
		restaurantregistration.setNumber(number);
		restaurantregistration.setRatings(ratings);
		restaurantregistration.setPincode(pincode);
		restaurantregistration.setLandmark(landmark);
		try {
			restaurantregistration.setImages(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e1) {

			e1.printStackTrace();
		}
		userService.saverestaurant(restaurantregistration);

		return "redirect:/restaurants";
	}

	@PostMapping("/dishphotos")
	public String uploile(@RequestParam("file") MultipartFile file, @RequestParam("dishname") String dishname,
			@RequestParam("price") String pirce, @RequestParam("description") String description,
			@RequestParam("type") String type,
		
			@RequestParam("Restaurantid") String Restaurantid,

			RedirectAttributes attributes) {
		Dish dish = new Dish();
		System.out.println("inside controller-----");
		if (file.isEmpty()) {
			attributes.addFlashAttribute("message", "Please select a file to upload.");

		}
		RestaurantNameAndID nameAndID = new RestaurantNameAndID();
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());

		dish.setDishname(dishname);
		dish.setPrice(pirce);
		dish.setDescription(description.trim());
		dish.setType(type);
		// System.out.println(restaurantname);
		// dish.setRestaurantname(restaurantname);

		dish.setRestaurantid(Restaurantid);
		try {
			dish.setImages(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e1) {

			e1.printStackTrace();
		}
		userService.saveDish(dish);

		return "redirect:/restaurants";
	}

}
