package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Practise;
import com.example.demo.service.PaccitiseService;

@Controller
public class PractiseController {
	
	@Autowired
	private PaccitiseService paccitiseService;
	
	@GetMapping("/demo")
	public String demo(Model model) {
		model.addAttribute("demos",paccitiseService.getAllPracises());
		return "demo";
	}
	@GetMapping("/update")
	public String demo(Model model,Practise practise) {
		model.addAttribute("practise",practise);
		return "saveDemo";
	}
	@PostMapping("/savedemo")
	public String saveDemo(@ModelAttribute("practise" )Practise practise) {
		
		paccitiseService.saveAllparctise(practise);
		return "redirect:/demo";
	}
	
	@GetMapping("/showFormFordishUpdate/{id}")
	public String updatePractise(Model model,@PathVariable Long id) {
		model.addAttribute("practise",paccitiseService.getAllPraciisebyid(id));
		return "update";
	}

	@PostMapping("/students/{id}")
	public String updatepracitse(Model model,@PathVariable Long id,@ModelAttribute("demo")Practise practise) {
	Practise exsitingpractise=	paccitiseService.getAllPraciisebyid(id);
	exsitingpractise.setEmail(practise.getEmail());
	exsitingpractise.setName(practise.getName());
	exsitingpractise.getId();
   paccitiseService.updateParctise(exsitingpractise);
   return "redirect:/demo";
	
	}
	
	@GetMapping("/Deletedish/{id}")
	public String Practise(@PathVariable Long id) {
		paccitiseService.deletePractsebyid(id);
		  return "redirect:/demo";
	}
}
