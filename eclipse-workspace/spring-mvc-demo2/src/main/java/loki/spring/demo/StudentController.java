package loki.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	
	@RequestMapping("/showform")
	public String showform(Model model) {
		
		Student theStudent=new Student();
		model.addAttribute("student",theStudent);
		return "student-form";
	}
	
	@RequestMapping("/processform")
	public String processform(@ModelAttribute("student") Student student) {
		
		System.out.println("the student :"+ student.getFirstname() + "   "+student.getLastname());
		
		return "studentConfomation";
		
	}
}
