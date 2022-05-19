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
import com.codingdojo.javaspring.productsandcatagories.models.Product;
import com.codingdojo.javaspring.productsandcatagories.services.CatagoryService;
import com.codingdojo.javaspring.productsandcatagories.services.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productServ;
	@Autowired
	private CatagoryService catagoryServ;
	
	@GetMapping("/new/product")
	public String newProduct(Product product) {
		
		return "NewProduct.jsp";
	}
	@PostMapping("/create/product")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result, Model model) {
		if (result.hasErrors()) {
			   
			return "new.jsp";
	   }
		productServ.createProduct(product);
		return "redirect:/";
	}
	@PostMapping("add/category/to/product")
	public String linkCategory(@RequestParam("categories")Long catagoryId, Model model, HttpSession session) {
		Long productId = (Long)session.getAttribute("productId");
		catagoryServ.addProductToCatagory(catagoryId, productId);
		return "redirect:/show/product/" + productId;
	}
}
