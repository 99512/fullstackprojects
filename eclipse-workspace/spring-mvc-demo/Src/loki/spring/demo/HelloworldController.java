package loki.spring.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloworldController {

	@RequestMapping("/showform")
	public String getsomedata() {
		return "hello";
	}
	
	@RequestMapping("/processform")
	public String processsomedata() {
		
		return "helloworld";
		
	}
	@RequestMapping("/processformMappin")
	public String Letsdosomething(HttpServletRequest request,Model model) {
		//read the request form html form
		String thename=request.getParameter("studentname");
		// converte the data into all caps
		thename=thename.toUpperCase();
		
		//create a message
		String restult="Yo  "+thename;
		//add message to the model
		model.addAttribute("message",restult);
		return "helloworld";
	}
	
	@RequestMapping("/processformMappinthree")
	public String Letsdosomethingthree(@RequestParam("studentname") String thename,Model model) {
//		//read the request form html form
//		String thename=request.getParameter("studentname");
		// converte the data into all caps
		thename=thename.toUpperCase();
		
		//create a message
		String restult="hay my friend  "+thename;
		//add message to the model
		model.addAttribute("message",restult);
		return "helloworld";
	}
}
