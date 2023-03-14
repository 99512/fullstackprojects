package loki.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/coustomer")
public class CoustomerContoller {
	
	@RequestMapping("/showform")
	public String showForm(Model model) {
		
		model.addAttribute("coustomer", new Coustemer());
		
		return "coustomer";
	}

}
