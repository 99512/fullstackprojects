package com.example.demo.Controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.thymeleaf.util.ArrayUtils;

import com.example.demo.SwiggiMavenRestaruantProjectApplication;
import com.example.demo.Repository.DishRepository;
import com.example.demo.Repository.RestaurentRepository;
import com.example.demo.entity.Cart;
import com.example.demo.entity.Dish;
import com.example.demo.entity.Restaurantregistration;
import com.example.demo.entity.User;
import com.example.demo.model.CartPageDatails;
import com.example.demo.model.Dishtable;
import com.example.demo.model.Dishtype;
import com.example.demo.model.Login;
import com.example.demo.model.RestaurantIdInDishTable;
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

	@Autowired
	private SwiggiMavenRestaruantProjectApplication swiggiMavenRestaruantProjectApplication;

	@GetMapping("/LogOut")
	public String LogOut() {
		SwiggiMavenRestaruantProjectApplication.setGLOBAL_USER_NAME("wrong");
		SwiggiMavenRestaruantProjectApplication.setLogin("Login");
		SwiggiMavenRestaruantProjectApplication.setLoginPageValidation("");
		SwiggiMavenRestaruantProjectApplication
				.setLogin_Valadation("Your cart page is empty, please select some items?");
		return "redirect:/dashboard";
	}

	@RequestMapping("/isLongin")
	public String isLongin(Model model, @ModelAttribute("isLongin") User user) {

		List<Login> login;

		login = restaurantRegistrationImpl.Login();

		for (int i = 0; i < login.size(); i++) {
			if (swiggiMavenRestaruantProjectApplication.GLOBAL_USER_NAME.equals("some")) {
				return "redirect:/item";
			}
		}
		SwiggiMavenRestaruantProjectApplication.setLoginPageValidation("");
		model.addAttribute("login", SwiggiMavenRestaruantProjectApplication.getLoginPageValidation());
		return "login";
	}

	@GetMapping("/dashboard")
	public String dashboradpage(Model model, @ModelAttribute User user) {

		List<Login> login;

		login = restaurantRegistrationImpl.Login();
        model.addAttribute("all",SwiggiMavenRestaruantProjectApplication.getAllavailabelrestaurnts());
		System.out.println(swiggiMavenRestaruantProjectApplication.GLOBAL_USER_NAME);
		System.out.println(swiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME);
		model.addAttribute("loki", SwiggiMavenRestaruantProjectApplication.getLogin());
		System.out.println(swiggiMavenRestaruantProjectApplication.getLogin());
		for (int i = 0; i < login.size(); i++) {

			// System.out.println(SwiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME.equals(login.get(i).getFirst_Name())
			// );
			if (swiggiMavenRestaruantProjectApplication.GLOBAL_USER_NAME.equals("some")
					&& SwiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME
							.equalsIgnoreCase(login.get(i).getFirst_Name())) {
				System.out.println(login.get(i).getFirst_Name().toUpperCase());
				model.addAttribute("username", login.get(i).getFirst_Name().toUpperCase());

				model.addAttribute("images", userService.getAlldish());
				model.addAttribute("names", userService.getAllRestaurant());
				return "dashboard";
			}

		}
		System.out.println("you are in dashborrd");

		model.addAttribute("images", userService.getAlldish());
		model.addAttribute("names", userService.getAllRestaurant());
		return "dashboard";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/Login")
	public String loginpage(Model model, @ModelAttribute("Login") User user) {
		
		List<Login> login;

		System.out.println(user.getEmail());

		login = restaurantRegistrationImpl.Login();
		SwiggiMavenRestaruantProjectApplication.setGLOBAL_USER_PASSWORD(true);

		for (int i = 0; i < login.size(); i++) {

			System.out.println(login.get(i));
			if (login.get(i).getEmail().equals(user.getEmail()) && login.get(i).getPwd().equals(user.getPassword())) {
				SwiggiMavenRestaruantProjectApplication
						.setGLOBAL_USER_First_NAME(login.get(i).getFirst_Name().toUpperCase());
				// SwiggiMavenRestaruantProjectApplication.setLoginPageValidation("");
				SwiggiMavenRestaruantProjectApplication.setLogin("");
				SwiggiMavenRestaruantProjectApplication.setGLOBAL_USER_NAME("some");
				SwiggiMavenRestaruantProjectApplication.setUserID(login.get(i).getUser_id());
				System.out.println(login.get(i).getUser_id());
				System.out.println(login.get(i).getFirst_Name());
				System.out.println("inside password correct----------------------------");
				System.out.println("----------------------------inside emamil username");
				return "redirect:/dashboard";
			}
		}

		SwiggiMavenRestaruantProjectApplication.setLoginPageValidation("User Name or Password Is Incorrect");

		model.addAttribute("login", SwiggiMavenRestaruantProjectApplication.getLoginPageValidation());

		return "login";
	}

	@RequestMapping("/dash")
	public String Loginpage(User user) {

		return "redirect:/restaurants";
	}

	@GetMapping("/restaurants")
	public String restuarent(Model model, String Name) {

		List<Login> login;

		login = restaurantRegistrationImpl.Login();

		System.out.println(swiggiMavenRestaruantProjectApplication.GLOBAL_USER_NAME);
		System.out.println(swiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME);
		model.addAttribute("loki", SwiggiMavenRestaruantProjectApplication.getLogin());
		System.out.println(swiggiMavenRestaruantProjectApplication.getLogin());
		for (int i = 0; i < login.size(); i++) {

			if (swiggiMavenRestaruantProjectApplication.GLOBAL_USER_NAME.equals("some")
					&& SwiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME
							.equalsIgnoreCase(login.get(i).getFirst_Name())) {
				System.out.println(login.get(i).getFirst_Name().toUpperCase());
				model.addAttribute("username", login.get(i).getFirst_Name().toUpperCase());
				model.addAttribute("dishtype", restaurantRegistrationImpl.dishAndRestaurantDatails(Name));
				model.addAttribute("images", userService.getAlldish());
				model.addAttribute("names", userService.getAllRestaurant());
				model.addAttribute("cart", restaurantRegistrationImpl.dishAndRestaurantDatailsforcartpage());
				return "restaruant";
			}

		}
		model.addAttribute("cart", restaurantRegistrationImpl.dishAndRestaurantDatailsforcartpage());
		model.addAttribute("dishtype", restaurantRegistrationImpl.dishAndRestaurantDatails(Name));
		return "restaruant";
	}

	public static void tofile(byte[] data, File destination) {
		try (FileOutputStream fos = new FileOutputStream(destination)) {
			fos.write(data);
			fos.close();
		} catch (Exception e) {
			System.out.println("this is so importement");
		}
	}

	@GetMapping("/restaurantsByDishName/{dishName}")
	public String showfordishname(Model model, @RequestParam String dishname, MultipartFile file,
			HttpServletResponse response) throws IOException {

		List<Dishtable> dishtables = restaurantRegistrationImpl.dishAndRestaurantDatails(dishname);
		Dishtable dishtable = new Dishtable();
		String sometext = "" + dishtables;
		System.out.println(sometext);

		byte[] data = sometext.getBytes();
		File destination = new File("test.tex");
		tofile(data, destination);

		System.out.println(dishname);
		System.out.println(dishtable);
		model.addAttribute("cart", restaurantRegistrationImpl.dishAndRestaurantDatailsforcartpage());
		model.addAttribute("dishnames", restaurantRegistrationImpl.dishAndRestaurantDatails(dishname));

		return "restaruant";
	}

	@GetMapping("/DishImagesById/{id}")
	public String exp(Model model, @PathVariable Long id) {

		model.addAttribute("dishImages", userService.getdishbyid(id));

		return "Restaurants";
	}

	@GetMapping("/contactus")
	public String contactus(Model model) {

		List<Login> login;

		login = restaurantRegistrationImpl.Login();
		System.out.println(swiggiMavenRestaruantProjectApplication.getUserID());
		System.out.println(swiggiMavenRestaruantProjectApplication.GLOBAL_USER_NAME);
		System.out.println(swiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME);
		model.addAttribute("loki", SwiggiMavenRestaruantProjectApplication.getLogin());
		System.out.println(swiggiMavenRestaruantProjectApplication.getLogin());
		for (int i = 0; i < login.size(); i++) {

			if (swiggiMavenRestaruantProjectApplication.GLOBAL_USER_NAME.equals("some")
					&& SwiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME
							.equalsIgnoreCase(login.get(i).getFirst_Name())) {

				model.addAttribute("username", login.get(i).getFirst_Name().toUpperCase());

				model.addAttribute("images", userService.getAlldish());
				model.addAttribute("names", userService.getAllRestaurant());
				return "contactus";
			}
		}

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
	public String usersRegistration(Model model) {

		model.addAttribute("users", userService.getAllUser());
		return "UserRegistration";

	}

	@GetMapping("/showFormUserForUpdate/{id}")
	public String showUserForm(@PathVariable Long id, Model model) {
		model.addAttribute("users", userService.getUserByid(id));
		return "userUpdate";
	}

	@PostMapping("/user/{id}")
	public String userUpdate(@PathVariable Long id, @ModelAttribute("users") User user, Model model) {
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

		return "redirect:/dashboard";
	}

	@GetMapping("/DeleteUser/{id}")
	public String deleteruser(@PathVariable Long id) {
		userService.deleteUserbyId(id);
		return "redirect:/dashboard";
	}

	@GetMapping("/fooditems")
	public String fooditems(Model model, @PathVariable Long id) {

		model.addAttribute(userService.getdishbyid(id));

		return "fooditems";
	}

	@GetMapping("/items")
	public String items(Model model) {

		model.addAttribute("images", userService.getAllRestaurant());
		return "items";
	}

	@GetMapping("/AllRestaurant")
	public String index(Model model) {

		List<Login> login;

		login = restaurantRegistrationImpl.Login();

		System.out.println(swiggiMavenRestaruantProjectApplication.GLOBAL_USER_NAME);
		System.out.println(swiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME);
		model.addAttribute("loki", SwiggiMavenRestaruantProjectApplication.getLogin());
		System.out.println(swiggiMavenRestaruantProjectApplication.getLogin());
		for (int i = 0; i < login.size(); i++) {

			if (swiggiMavenRestaruantProjectApplication.GLOBAL_USER_NAME.equals("some")
					&& SwiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME
							.equalsIgnoreCase(login.get(i).getFirst_Name())) {
				System.out.println(login.get(i).getFirst_Name().toUpperCase());
				model.addAttribute("username", login.get(i).getFirst_Name().toUpperCase());

				model.addAttribute("restaurants", userService.getAllRestaurant());

				return "AllRestaurants";
			}

		}

		model.addAttribute("restaurants", userService.getAllRestaurant());
		return "AllRestaurants";
	}

	@GetMapping("/AddDish")
	public String addDish(Model model) {

		List<Login> login;

		login = restaurantRegistrationImpl.Login();

		System.out.println(swiggiMavenRestaruantProjectApplication.GLOBAL_USER_NAME);
		System.out.println(swiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME);
		model.addAttribute("loki", SwiggiMavenRestaruantProjectApplication.getLogin());
		System.out.println(swiggiMavenRestaruantProjectApplication.getLogin());
		for (int i = 0; i < login.size(); i++) {

			if (swiggiMavenRestaruantProjectApplication.GLOBAL_USER_NAME.equals("some")
					&& SwiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME
							.equalsIgnoreCase(login.get(i).getFirst_Name())) {
				System.out.println(login.get(i).getFirst_Name().toUpperCase());
				model.addAttribute("username", login.get(i).getFirst_Name().toUpperCase());

				model.addAttribute("restaurant", restaurantRegistrationImpl.nameID());
				model.addAttribute("dishtype", restaurantRegistrationImpl.dishtype());
				return "AddDish";
			}

		}

		model.addAttribute("restaurant", restaurantRegistrationImpl.nameID());
		model.addAttribute("dishtype", restaurantRegistrationImpl.dishtype());

		return "AddDish";
	}

	@GetMapping("/showFormForUpdate/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("restaurants", userService.getRestaurantById(id));

		return "UpdateRestaurant";
	}

	@GetMapping("/showFormForDish/{id}")
	public String showFormdishbyid(Model model, @PathVariable Long id) {

		List<Login> login;

		login = restaurantRegistrationImpl.Login();
		model.addAttribute("loki", SwiggiMavenRestaruantProjectApplication.getLogin());
		System.out.println(swiggiMavenRestaruantProjectApplication.getLogin());
		System.out.println(swiggiMavenRestaruantProjectApplication.getUserID());
		for (int i = 0; i < login.size(); i++) {

			if (swiggiMavenRestaruantProjectApplication.GLOBAL_USER_NAME.equals("some")
					&& SwiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME
							.equalsIgnoreCase(login.get(i).getFirst_Name())) {
				System.out.println(login.get(i).getFirst_Name().toUpperCase());

				model.addAttribute("username", login.get(i).getFirst_Name().toUpperCase());

				Cart cart = new Cart();
				cart.setUserid(login.get(i).getUser_id());

				model.addAttribute("dishdatails", userService.getdishbyid(id));

				return "fooditems";
			}

		}
		model.addAttribute(SwiggiMavenRestaruantProjectApplication.getUserID());
		model.addAttribute("dishdatails", userService.getdishbyid(id));

		return "login";
	}

	@PostMapping("/saveCart")
	public String saveCart(@ModelAttribute("carts") Cart cart, Model model) {

		List<Login> login;

		login = restaurantRegistrationImpl.Login();
		model.addAttribute("loki", SwiggiMavenRestaruantProjectApplication.getLogin());
		System.out.println(swiggiMavenRestaruantProjectApplication.getLogin());
		System.out.println(swiggiMavenRestaruantProjectApplication.getUserID());
		for (int i = 0; i < login.size(); i++) {
			cart.setUserid(login.get(i).getUser_id());
			if (swiggiMavenRestaruantProjectApplication.GLOBAL_USER_NAME.equals("some")
					&& SwiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME
							.equalsIgnoreCase(login.get(i).getFirst_Name())) {
				System.out.println(login.get(i).getFirst_Name().toUpperCase());
				SwiggiMavenRestaruantProjectApplication.setLogin_Valadation("");
				model.addAttribute("username", login.get(i).getFirst_Name().toUpperCase());

				cart.setUserid(login.get(i).getUser_id());

				userService.saveCartpageByusingDishDatails(cart);

				return "redirect:/item";
			}

		}

		userService.saveCartpageByusingDishDatails(cart);

		return "redirect:/item";
	}

	@GetMapping("/ForResaturant/{id}")
	public String showRestarentForm(@PathVariable Long id, Model model, String Name,Long Restaurantid) {

		SwiggiMavenRestaruantProjectApplication.setRestaurantid(id);
		List<Login> login;

		login = restaurantRegistrationImpl.Login();
		
		
		model.addAttribute("loki", SwiggiMavenRestaruantProjectApplication.getLogin());

		List<Dishtable> dishtype;

		dishtype = restaurantRegistrationImpl.dishAndRestaurantDatailsforcartpage();
		List<RestaurantIdInDishTable> restaurantid;
		
		restaurantid=restaurantRegistrationImpl.RestaurantIdInDishTablde();
		
		for (int i = 0; i < restaurantid.size(); i++) {
			System.out.println(restaurantid.get(i).getRestaurant_id());
			if (i == 0) {
				
				model.addAttribute("price", restaurantid.get(i).getPrice());
			}
			if (i == 1) {
				model.addAttribute("price1", restaurantid.get(i).getPrice());
			}
			if (i == 2) {
				model.addAttribute("price2", restaurantid.get(i).getPrice());
			}

		}

		
		
		
		for (int i = 0; i < login.size(); i++) {
         
			
			
			if (swiggiMavenRestaruantProjectApplication.GLOBAL_USER_NAME.equals("some")
					&& SwiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME
							.equalsIgnoreCase(login.get(i).getFirst_Name())) {
				System.out.println(login.get(i).getFirst_Name().toUpperCase());
				model.addAttribute("username", login.get(i).getFirst_Name().toUpperCase());
			//	model.addAttribute("cart", restaurantRegistrationImpl.dishAndRestaurantDatailsforcartpage());
				model.addAttribute("restaurants", userService.getRestaurantById(id));
				model.addAttribute("cart", restaurantRegistrationImpl.RestaurantIdInDishTablde());
				return "items";
			}

		}
	model.addAttribute("cart", restaurantRegistrationImpl.RestaurantIdInDishTablde());
		model.addAttribute(restaurantRegistrationImpl.dishAndRestaurantDatails(Name));
		model.addAttribute("restaurants", userService.getRestaurantById(id));

		return "items";
	}

	@PostMapping("/restaurant/{id}")
	public String UpdateStudent(@PathVariable Long id,
			@ModelAttribute("restaurants") Restaurantregistration registration, Model model,
			@RequestParam("file") MultipartFile file) throws IOException {
		Restaurantregistration existingrestaurant = userService.getRestaurantById(id);
      System.out.println(file);
      System.out.println("loki is gsdkfjskdfjskdfjsdfsdfsdfsdfssssssssssssssssssssssssssssssss");
      
      String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		existingrestaurant.setName(registration.getName());
		existingrestaurant.setAddress(registration.getAddress());
		existingrestaurant.setNumber(registration.getNumber());
		existingrestaurant.setLandmark(registration.getLandmark());
		existingrestaurant.setPincode(registration.getPincode());
		existingrestaurant.setRatings(registration.getRatings());
		existingrestaurant.setImages(registration.getImages());
		existingrestaurant.setImages(Base64.getEncoder().encodeToString(file.getBytes()));
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

		Restaurantregistration restaurantregistration = new Restaurantregistration();

		model.addAttribute("registration", restaurantregistration);

		return "registration";
	}

	@PostMapping("/saveRegistration")
	public String saveRegistration(@ModelAttribute("registration") Restaurantregistration registration,
			@RequestParam("file") MultipartFile file, RedirectAttributes attributes) {

		Restaurantregistration restaurantregistration = new Restaurantregistration();
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

		List<Login> login;

		login = restaurantRegistrationImpl.Login();

		System.out.println(swiggiMavenRestaruantProjectApplication.GLOBAL_USER_NAME);
		System.out.println(swiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME);
		model.addAttribute("loki", SwiggiMavenRestaruantProjectApplication.getLogin());
		System.out.println(swiggiMavenRestaruantProjectApplication.getLogin());
		for (int i = 0; i < login.size(); i++) {
			if (swiggiMavenRestaruantProjectApplication.GLOBAL_USER_NAME.equals("some")
					&& SwiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME
							.equalsIgnoreCase(login.get(i).getFirst_Name())) {
				System.out.println(login.get(i).getFirst_Name().toUpperCase());
				model.addAttribute("username", login.get(i).getFirst_Name().toUpperCase());

				model.addAttribute("dishs", userService.getAlldish());
				model.addAttribute("images", userService.getAlldish());
				model.addAttribute("names", userService.getAllRestaurant());
				return "Alldishes";
			}
		}

		model.addAttribute("dishs", userService.getAlldish());
		return "Alldishes";

	}

	@GetMapping("/showFormFordishUpdate/{id}")
	public String Updatedishitems(@PathVariable Long id, Model model) {
		model.addAttribute("dishs", userService.getdishbyid(id));
		model.addAttribute("restaurant", restaurantRegistrationImpl.nameID());
		model.addAttribute("dishtype", restaurantRegistrationImpl.dishtype());
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
	public String checkout(Model model) {

		List<Login> login;

		login = restaurantRegistrationImpl.Login();

		System.out.println(swiggiMavenRestaruantProjectApplication.GLOBAL_USER_NAME);
		System.out.println(swiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME);
		model.addAttribute("loki", SwiggiMavenRestaruantProjectApplication.getLogin());
		System.out.println(swiggiMavenRestaruantProjectApplication.getLogin());
		for (int i = 0; i < login.size(); i++) {

			// System.out.println(SwiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME.equals(login.get(i).getFirst_Name())
			// );
			if (swiggiMavenRestaruantProjectApplication.GLOBAL_USER_NAME.equals("some")
					&& SwiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME
							.equalsIgnoreCase(login.get(i).getFirst_Name())) {
				System.out.println(login.get(i).getFirst_Name().toUpperCase());
				model.addAttribute("username", login.get(i).getFirst_Name().toUpperCase());

				model.addAttribute("dishs", userService.getAlldish());
				model.addAttribute("images", userService.getAlldish());
				model.addAttribute("names", userService.getAllRestaurant());
				return "RestaurantRegistration";
			}
		}

		return "RestaurantRegistration";
	}

	@GetMapping("/item")
	public String foodite(Model model) {

		System.out.println("inside the item page");
		List<Login> login;

		login = restaurantRegistrationImpl.Login();
		List<CartPageDatails> cartpage;
		cartpage = restaurantRegistrationImpl.dishandcartDatails();
		System.out.println(cartpage.size());

		for (int i = 0; i < cartpage.size(); i++) {
			System.out.println(cartpage.get(i).getCart_price());
			if (i == 0) {
				System.out.println(cartpage.get(i).getCart_price() + "thsi is price of th e amoutty");
				SwiggiMavenRestaruantProjectApplication.setLogin_Valadation("");
				model.addAttribute("price", cartpage.get(i).getCart_price());
			}
			if (i == 1) {
				model.addAttribute("price1", cartpage.get(i).getCart_price());
			}
			if (i == 2) {
				model.addAttribute("price2", cartpage.get(i).getCart_price());
			}

		}

		model.addAttribute("validation", SwiggiMavenRestaruantProjectApplication.getLogin_Valadation());
		System.out.println(SwiggiMavenRestaruantProjectApplication.getLogin_Valadation());
		model.addAttribute("loki", SwiggiMavenRestaruantProjectApplication.getLogin());

		for (int i = 0; i < login.size(); i++) {
			if (swiggiMavenRestaruantProjectApplication.GLOBAL_USER_NAME.equals("some")
					&& SwiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME
							.equalsIgnoreCase(login.get(i).getFirst_Name())) {

				model.addAttribute("username", login.get(i).getFirst_Name().toUpperCase());
				model.addAttribute("cart", restaurantRegistrationImpl.dishandcartDatails());
				model.addAttribute("delete", userService.getAllCartPageDatails());
				return "fooditemss";
			}

		}

		model.addAttribute("cart", restaurantRegistrationImpl.dishandcartDatails());
		return "login";
	}

	@GetMapping("/deletecart/{id}")
	public String deleteCartbyid(@PathVariable Long id) {
		SwiggiMavenRestaruantProjectApplication
				.setLogin_Valadation("Your cart page is empty, please select some items?");
		System.out.println("inside the cart page ");
		userService.deletecartbyid(id);
		return "redirect:/item";

	}

	@PostMapping("/search")
	public String search(Model model,@RequestParam("search") String dish) {
		
		SwiggiMavenRestaruantProjectApplication.setSearchdishname(dish);
	    SwiggiMavenRestaruantProjectApplication.setSearchByrestaurantName(dish);
		System.out.println(dish);
		
		List<RestaurantIdInDishTable> dishtable;
		dishtable=restaurantRegistrationImpl.searchbydishname();
		for(int i=0;i<=dishtable.size();i++) {
			if(i==1) {
				System.out.println("working");
				model.addAttribute("message","Below are the dish details generated by this name : "+'"'+SwiggiMavenRestaruantProjectApplication.getSearchByrestaurantName()+'"');

					}
		}
		
		List<Dishtable> restaurant;
		restaurant=restaurantRegistrationImpl.searchbyrestaurantname();
		System.out.println(restaurant.size());
		for(int i=0;i<=restaurant.size();i++) {
			if(i==1) {
				model.addAttribute("messages", "By using this name, you can find all available restaurants : "+'"'+SwiggiMavenRestaruantProjectApplication.getSearchdishname()+'"');
				
			}
		}

		List<Login> login;

		login = restaurantRegistrationImpl.Login();
		for (int i = 0; i < login.size(); i++) {
			if (swiggiMavenRestaruantProjectApplication.GLOBAL_USER_NAME.equals("some")
					&& SwiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME
							.equalsIgnoreCase(login.get(i).getFirst_Name())) {

				model.addAttribute("username", login.get(i).getFirst_Name().toUpperCase());
				model.addAttribute("searchbydishname",restaurantRegistrationImpl.searchbydishname());
				model.addAttribute("searchbyrestaurnatname",restaurantRegistrationImpl.searchbyrestaurantname());
				return "dashboard";
			}

		}
		model.addAttribute("loki", SwiggiMavenRestaruantProjectApplication.getLogin());
		model.addAttribute("searchbydishname",restaurantRegistrationImpl.searchbydishname());
		model.addAttribute("searchbyrestaurnatname",restaurantRegistrationImpl.searchbyrestaurantname());
		return "dashboard";
	}
@GetMapping("/ForVegRestaurants")
public String vegAndNonveg(Model model) {
	
	SwiggiMavenRestaruantProjectApplication.setVegItems("1");
	
	model.addAttribute("vegRestaurants",restaurantRegistrationImpl.forVegrestaurant());
	model.addAttribute("loki", SwiggiMavenRestaruantProjectApplication.getLogin());
	
	List<Login> login;

	login = restaurantRegistrationImpl.Login();
	for (int i = 0; i < login.size(); i++) {
		if (swiggiMavenRestaruantProjectApplication.GLOBAL_USER_NAME.equals("some")
				&& SwiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME
						.equalsIgnoreCase(login.get(i).getFirst_Name())) {

			model.addAttribute("username", login.get(i).getFirst_Name().toUpperCase());
			model.addAttribute("searchbydishname",restaurantRegistrationImpl.searchbydishname());
			model.addAttribute("searchbyrestaurnatname",restaurantRegistrationImpl.searchbyrestaurantname());
			return "restaruant";
		}

	}
	
	
	return "restaruant";
}

@GetMapping("/ForNonVegrestaurants")
public String NonAndNonveg(Model model) {
	
	SwiggiMavenRestaruantProjectApplication.setVegItems("2");
	
	model.addAttribute("vegRestaurants",restaurantRegistrationImpl.forVegrestaurant());
	model.addAttribute("loki", SwiggiMavenRestaruantProjectApplication.getLogin());
	
	List<Login> login;

	login = restaurantRegistrationImpl.Login();
	for (int i = 0; i < login.size(); i++) {
		if (swiggiMavenRestaruantProjectApplication.GLOBAL_USER_NAME.equals("some")
				&& SwiggiMavenRestaruantProjectApplication.GLOBAL_USER_First_NAME
						.equalsIgnoreCase(login.get(i).getFirst_Name())) {

			model.addAttribute("username", login.get(i).getFirst_Name().toUpperCase());
			model.addAttribute("searchbydishname",restaurantRegistrationImpl.searchbydishname());
			model.addAttribute("searchbyrestaurnatname",restaurantRegistrationImpl.searchbyrestaurantname());
			return "restaruant";
		}

	}
	
	return "restaruant";
}
	@GetMapping("exp")
	public String exp1(Model model) {

		model.addAttribute("cart", restaurantRegistrationImpl.dishAndRestaurantDatailsforcartpage());

		return "Restaurants";
	}

	
}
