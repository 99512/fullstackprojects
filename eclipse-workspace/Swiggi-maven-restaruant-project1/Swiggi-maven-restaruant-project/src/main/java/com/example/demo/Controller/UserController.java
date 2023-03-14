package com.example.demo.Controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.thymeleaf.util.ArrayUtils;

import com.example.demo.Repository.DishRepository;
import com.example.demo.Repository.RestaurentRepository;
import com.example.demo.entity.Dish;
import com.example.demo.entity.Restaurantregistration;
import com.example.demo.entity.User;
import com.example.demo.model.Dishtable;
import com.example.demo.model.RestaurantNameAndID;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.RestaurantRegistrationImpl;


@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@Autowired
	private RestaurantRegistrationImpl restaurantRegistrationImpl;
	
     @Autowired 
     private DishRepository dishRepository;
     
	

	@GetMapping("/dashboard")
	public String dashboradpage(Model model) {
		System.out.println("you are in dashborrd");
		model.addAttribute("images", userService.getAlldish());
		model.addAttribute("names", userService.getAllRestaurant()); 
		return "dashboard";
	}

	@RequestMapping("/login")
	
	public String loginpage(User user) {
		
		return "login";
	}
	

	



	@RequestMapping("/dash")
	public String Loginpage(User user) {
		return "redirect:/restaurants";
	}

	@GetMapping("/restaurants")
	public String restuarent(Model model) {
		
		return "restaruant";
	}
	
	
		
		public static void tofile(byte[]data,File destination) {
			try(FileOutputStream fos=new FileOutputStream(destination)){
				fos.write(data);
				fos.close();
			}
			catch (Exception e) {
			     System.out.println("this is so importement");
			}
	}

	
	
	
	@GetMapping("/restaurantsByDishName/{dishName}")
	public String showfordishname(Model model, @RequestParam String  dishname,MultipartFile file,HttpServletResponse response) throws IOException {

		Collection<Dishtable> dishtables = restaurantRegistrationImpl.dishAndRestaurantDatails(dishname);
		Dishtable dishtable=new Dishtable();
		 String sometext=""+dishtables;
		 System.out.println(sometext);
		 
		 	byte[]  data=sometext.getBytes(); File destination=new File("test.tex");
		 tofile(data,destination);
		 
		// dishtable.getImages(Base64.getEncoder().encodeToString(file.getBytes()));
	
		 
		 
		System.out.println(dishname);
		System.out.println(	dishtable);
	  	
		model.addAttribute("dishnames",restaurantRegistrationImpl.dishAndRestaurantDatails(dishname));

		return "restaruant";
	}

	@GetMapping("/DishImagesById/{id}")
	public String exp(Model model,@PathVariable Long id) {
	
		
		model.addAttribute("dishImages", userService.getdishbyid(id));
		
		
		return "Restaurants";
	}
	
	
	@GetMapping("/contactus")
	public String contactus() {

		return "contactus";
	}

	@GetMapping("/user")
	public String user(Model model) {
		User user = new User();
		
		model.addAttribute("user", user);
		
		return "user";
	}

	@PostMapping("/saveuser")
	public String saveUser(@ModelAttribute("users") User user) {
	
		userService.saveUsers(user);
	
		return "redirect:/restaurants";

	}

	@GetMapping("/UserRegistration")
	public String index3(Model model) {

		model.addAttribute("users", userService.getAllUser());
	return "UserRegistration";

	}
	
	

	@GetMapping("/showFormUserForUpdate/{id}")
	public String showUserForm(@PathVariable Long id, Model model) {
		model.addAttribute("users", userService.getUserByid(id));
		return "userUpdate";
	}

	@PostMapping("/user/{id}")
	public String userUpdate(@PathVariable Long id, @ModelAttribute("users") User user, Model model) throws Exception {
		System.out.println("this is update version");
		User exitinguser = userService.getUserByid(id);
		exitinguser.setFirstname(user.getFirstname());
		exitinguser.setLastname(user.getLastname());
		exitinguser.setEmail(user.getEmail());
		exitinguser.setLandmark(user.getLandmark());
		exitinguser.setPassword(user.getPassword());
		exitinguser.setAdress(user.getAdress());
		exitinguser.setPhoneNumber(user.getPhoneNumber());

		userService.updateuser(exitinguser);

		return "redirect:/restaurants";
	}

	@GetMapping("/DeleteUser/{id}")
	public String deleteruser(@PathVariable Long id) {
		userService.deleteUserbyId(id);
		return "redirect:/restaurants";
	}

	@GetMapping("/fooditems")
	public String fooditems() {
		System.out.println("_________________________________________inside fooditems");
		return "fooditems";
	}

	@GetMapping("/items")
	public String items(Model model) {
		System.out.println("_________________________________________inside items");
		model.addAttribute("images", userService.getAllRestaurant());
		return "items";
	}

	@GetMapping("/AllRestaurant")
	public String index(Model model) {

		model.addAttribute("restaurants", userService.getAllRestaurant());
		return "AllRestaurants";
	}
	@GetMapping("/AddDish")
	public String addDish(Model model) {
		model.addAttribute("restaurant",restaurantRegistrationImpl.nameID());
		model.addAttribute("dishtype",restaurantRegistrationImpl.dishtype());
		return "AddDish";
	}

	@GetMapping("/showFormForUpdate/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("restaurants", userService.getRestaurantById(id));

		return "UpdateRestaurant";
	}
	@GetMapping("/ForResaturant/{id}")
	public String showRestarentForm(@PathVariable Long id ,Model model) {
		model.addAttribute("restaurants",userService.getRestaurantById(id));
		
		return "items";
	}
	
	@PostMapping("/restaurant/{id}")
	public String UpdateStudent(@PathVariable Long id, @ModelAttribute("restaurants") Restaurantregistration registration,
			Model model,@RequestParam("file")MultipartFile file) throws IOException {
		Restaurantregistration existingrestaurant = userService.getRestaurantById(id);

		existingrestaurant.setName(registration.getName());
		existingrestaurant.setAddress(registration.getAddress());
		existingrestaurant.setNumber(registration.getNumber());
		existingrestaurant.setLandmark(registration.getLandmark());
		existingrestaurant.setPincode(registration.getPincode());
		existingrestaurant.setRatings(registration.getRatings());
		
		File saveFile=new ClassPathResource("static/img").getFile();
		
		Path path=Paths.get(saveFile.getAbsolutePath()+File.separator+file.getOriginalFilename());
		
		Files.copy(file.getInputStream(),path,StandardCopyOption.REPLACE_EXISTING);
		
		existingrestaurant.setImages(file.getOriginalFilename());
		
     // existingrestaurant.setImages(registration.setImages(file.getOriginalFilename()));
        
		userService.UpdateRestaurant(existingrestaurant);

		return "redirect:/restaurants";
	}

	@GetMapping("/DeleteEmployee/{id}")
	public String deleteStudent(@PathVariable Long id) {

		userService.deleteRestaurantById(id);

		return "redirect:/restaurants";
	}

	@GetMapping("/registration")
	public String registration(Model model) {
		
		
		Restaurantregistration restaurantregistration=new Restaurantregistration();
		
		model.addAttribute("registration",restaurantregistration);
		

		return "registration";
	}

	@PostMapping("/saveRegistration")
	public String saveRegistration(@ModelAttribute("registration") Restaurantregistration registration,
			@RequestParam("file") MultipartFile file, RedirectAttributes attributes) {

		Restaurantregistration restaurantregistration=new Restaurantregistration();
        System.out.println("inside controller-----");
     if (file.isEmpty()) {
         attributes.addFlashAttribute("message", "Please select a file to upload.");
     
     }  
     String fileName = StringUtils.cleanPath(file.getOriginalFilename());
     try {
			restaurantregistration.setImages(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		userService.saverestaurant(restaurantregistration);
		
		
		
		userService.saverestaurant(registration);
		
		return "redirect:/restaurants";

	}

	@GetMapping("/dishAddition")
	public String dishAddition(Model model) {

		Dish dish = new Dish();
		model.addAttribute("dish", dish);

		return "dishAddition";

	}

	@PostMapping("/saveDish")

	public String saveDish(@ModelAttribute("dish") Dish dish) {

		
		userService.saveDish(dish);
		return "redirect:/restaurants";

	}

	@GetMapping("/Alldishes")
	public String index2(Model model) {

		model.addAttribute("dishs", userService.getAlldish());
		return "Alldishes";

	}

	@GetMapping("/showFormFordishUpdate/{id}")
	public String Updatedishitems(@PathVariable Long id, Model model) {
		model.addAttribute("dishs", userService.getdishbyid(id));

		return "updatedith";
	}

	@PostMapping("/dish/{id}")
	public String updatedish(@PathVariable Long id, @ModelAttribute("dishs") Dish dish, Model model) {

		Dish existinDish = userService.getdishbyid(id);
		existinDish.setDishname(dish.getDishname());
		existinDish.setDescription(dish.getDescription());
		existinDish.setPrice(dish.getPrice());
		existinDish.setType(dish.getType());
		userService.updatedish(existinDish);
		return "redirect:/restaurants";

	}

	@GetMapping("/Deletedish/{id}")
	public String deleteDish(@PathVariable Long id) {

		userService.deletedishbyid(id);

		return "redirect:/restaurants";
	}

	
	@GetMapping("/RestaurantRegistration")
	public String checkout() {
		
		return "RestaurantRegistration";
	}

	@GetMapping("/item")
	public String foodite() {
		
		return "fooditemss";
	}

}
