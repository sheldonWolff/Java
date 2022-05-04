package com.codingdojo.javaspring.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.javaspring.dojosandninjas.models.Dojo;
import com.codingdojo.javaspring.dojosandninjas.models.Ninja;
import com.codingdojo.javaspring.dojosandninjas.services.DojoServices;

@Controller
public class MainController {
	@Autowired
	private DojoServices service;
	
	@GetMapping("/")
	public String index() {
		return "redirect:/dojos";
	}
	@GetMapping("/dojos")
	public String dojos(@ModelAttribute("dojo") Dojo dojo, Model model, BindingResult result) {
		List<Dojo> dojos = service.allDojos();
		model.addAttribute("dojos", dojos);
		return "new_dojo.jsp";
	}
	@GetMapping("/ninjas")
	public String ninjas(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = service.allDojos();
		Long exampleId = (long) 3;
		Dojo exampleDojo = service.findDojos(exampleId);
		
		model.addAttribute("dojos", dojos);
		model.addAttribute("dojo", exampleDojo);
		return "new_ninja.jsp";
	}
	@GetMapping("/dojos/{id}")
	public String ninjas(Model model, @PathVariable(value="id") Long id) {
		Ninja ninjas = service.findNinjas(id);
		Dojo dojo = service.findDojos(id);
		model.addAttribute("ninjas", ninjas);
		model.addAttribute("dojo", dojo);
		return "show_dojo.jsp";
	}
	@PostMapping("/dojos")
	public String makeDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "new_dojo.jsp";
		}
		service.createDojo(dojo);
		return "redirect:/dojos";
	}
	@PostMapping("/ninjas")
	public String makeNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "new_dojo.jsp";
		}
		service.createNinja(ninja);
		return "redirect:/dojos";
	}
}
