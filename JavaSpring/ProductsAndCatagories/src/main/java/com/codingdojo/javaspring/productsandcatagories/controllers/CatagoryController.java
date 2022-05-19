package com.codingdojo.javaspring.productsandcatagories.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.javaspring.productsandcatagories.models.Catagory;
import com.codingdojo.javaspring.productsandcatagories.services.CatagoryService;

@Controller
public class CatagoryController {
	@Autowired
	private CatagoryService catagoryServ;
	
	@GetMapping("/new/category")
	public String newCategory(Catagory catagory) {
		return "NewCategory.jsp";
	}
	@PostMapping("/create/category")
	public String createCategory(@Valid @ModelAttribute("catagory") Catagory catagory, BindingResult result, Model model) {
		if (result.hasErrors()) {
			   
			return "new.jsp";
	   }
		catagoryServ.createCatagory(catagory);
		return "redirect:/";
	}
	@PostMapping("add/product/to/category")
	public String linkProduct(@RequestParam("products")Long productId, Model model, HttpSession session) {
		Long categoryId = (Long)session.getAttribute("catagoryId");
		catagoryServ.addProductToCatagory(categoryId, productId);
		return "redirect:/show/category/" + categoryId;
	}
}
