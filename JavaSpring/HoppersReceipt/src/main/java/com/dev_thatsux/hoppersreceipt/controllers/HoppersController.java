package com.dev_thatsux.hoppersreceipt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HoppersController {
	@RequestMapping("/")
	public String index(Model model) {
		String name = "Grace Hopper";
		String itemName = "Copper Wire";
		double price = 5.25;
		String description = "Metal strips, also an illustration of nanoseconds.";
		String vendor = "Little Things Corner Store";
		
		model.addAttribute("fullName", name);
		model.addAttribute("item", itemName);
		model.addAttribute("price", price);
		model.addAttribute("description", description);
		model.addAttribute("vendor", vendor);
		
		
		return "index.jsp";
	}
}
