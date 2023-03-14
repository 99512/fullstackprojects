package loki.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyMapping {
	
	@RequestMapping("/showform")
	public String loki() {
		
		return "helloworld";
	}

}
