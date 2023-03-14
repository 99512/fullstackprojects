package loki.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Myself {

	@RequestMapping("/loki")
	public String letsdosomething() {
		
		return "myjsp";
		
		
	}
	@RequestMapping("/myself")
	public String processsomedata() {
		
		return "myjsp2";
		
	}
}
