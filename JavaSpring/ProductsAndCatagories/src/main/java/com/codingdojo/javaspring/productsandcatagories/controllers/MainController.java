package com.codingdojo.javaspring.productsandcatagories.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.javaspring.productsandcatagories.models.Catagory;
import com.codingdojo.javaspring.productsandcatagories.models.Product;
import com.codingdojo.javaspring.productsandcatagories.services.CatagoryService;
import com.codingdojo.javaspring.productsandcatagories.services.ProductService;

@Controller
public class MainController {
	@Autowired
	private CatagoryService catagoryServ;
	@Autowired
	private ProductService productServ;
	
	@GetMapping("/")
	public String index(Model model) {
		List<Product> products = productServ.allProducts();
		List<Catagory> catagories = catagoryServ.allCatagories();
		model.addAttribute("products", products);
		model.addAttribute("catagories", catagories);
		return "index.jsp";
	}
	@GetMapping("/show/product/{id}")
	public String showProduct(Model model, @PathVariable("id") Long id, HttpSession session) {
		Product product = productServ.findProductById(id);
		List<Catagory> catagories = catagoryServ.allCatagories();
		model.addAttribute("catagories", catagories);
		model.addAttribute("product", product);
		session.setAttribute("productId", product.getId());
		return "ProductShow.jsp";
	}
	@GetMapping("/show/category/{id}")
	public String showCategory(Model model, @PathVariable("id") Long id, HttpSession session) {
		List<Product> products = productServ.allProducts();
		Catagory catagory = catagoryServ.findCatagoryById(id);
		model.addAttribute("catagory", catagory);
		model.addAttribute("products", products);
		session.setAttribute("catagoryId", catagory.getId());
		return "CategoryShow.jsp";
	}
}
