package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.SwiggiMavenRestaruantProjectApplication;
import com.example.demo.entity.Dishtype;
import com.example.demo.model.Login;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.RestaurantRegistrationImpl;

@Controller
public class DishtypeController {

	@Autowired
	private UserService userService;

	@Autowired
	private RestaurantRegistrationImpl restaurantRegistrationImpl;

	@Autowired
	private SwiggiMavenRestaruantProjectApplication swiggiMavenRestaruantProjectApplication;

	@GetMapping("/dishtype")
	public String getdishtype(Model model) {

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

				model.addAttribute("dishtypes", userService.getAllDishtypes());
				return "dishtype";
			}

		}

		model.addAttribute("dishtypes", userService.getAllDishtypes());

		return "dishtype";
	}

	@GetMapping("/saveDishtype")
	public String savedishtype() {
		return "saveDishtype";
	}

	@PostMapping("/saveDishtype")
	public String saveDishtyep(@ModelAttribute("saveDishtype") Dishtype dishtype) {

		userService.savedishtype(dishtype);

		return "redirect:/dashboard";
	}

	@GetMapping("/showFormFordishtypeUpdate/{id}")
	public String updatedishtype(@PathVariable Long id, Model model) {

		model.addAttribute("dishtypes", userService.getdishtypeByid(id));
		return "updateDishtype";
	}

	@PostMapping("/updatedishfortypes/{id}")
	public String updatedishtype(@PathVariable Long id, @ModelAttribute("dishtypes") Dishtype dishtype) {

		Dishtype existingdishtype = userService.getdishtypeByid(id);
		existingdishtype.setDishtype(dishtype.getDishtype());
		existingdishtype.setStatus(dishtype.getStatus());

		userService.updatedishtype(existingdishtype);
		return "redirect:/restaurants";

	}

	@GetMapping("/Deletedishtype/{id}")
	public String deletedishbyid(@PathVariable Long id) {

		userService.deletedishtypebyId(id);

		return "redirect:/dashboard";
	}
}
