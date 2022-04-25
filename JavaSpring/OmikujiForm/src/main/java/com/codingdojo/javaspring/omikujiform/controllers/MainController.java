package com.codingdojo.javaspring.omikujiform.controllers;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(value="/submitForm", method=RequestMethod.POST)
	public String sendForm(
			@RequestParam(value="number") Integer number,
			@RequestParam(value="city") String city,
			@RequestParam(value="person") String person,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="animal") String animal,
			@RequestParam(value="compliment") String compliment,
			HttpSession session) {
				String theResults = String.format("In %s years you will live in %s with %s as your roommate, %s. The next time you see a %s, you will have good luck. Also, %s.", number, city, person, hobby, animal, compliment);
				session.setAttribute("theResults", theResults);
				return "redirect:/show";
			}
	@GetMapping("/show")
	public String showForm(HttpSession session, Model model) {
		String result = (String) session.getAttribute("theResults");
		model.addAttribute("result", result);
		return "show.jsp";
	}
			
}
