package com.codingdojo.javaspring.productsandcatagories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.javaspring.productsandcatagories.models.Catagory;
import com.codingdojo.javaspring.productsandcatagories.models.Product;
import com.codingdojo.javaspring.productsandcatagories.repositories.CatagoryRepository;
import com.codingdojo.javaspring.productsandcatagories.repositories.ProductRepository;

@Service
public class CatagoryService {
	@Autowired
	CatagoryRepository catagoryRepo;
	@Autowired
	ProductRepository productRepo;
	public Catagory createCatagory(Catagory b) {
		return catagoryRepo.save(b);
	}
	public Catagory findCatagoryById(Long id) {
		Optional<Catagory> optionalCatagory = catagoryRepo.findById(id);
        if(optionalCatagory.isPresent()) {
            return optionalCatagory.get();
        } else {
            return null;
        }
	}
	public Catagory addProductToCatagory(Long catagoryId, Long productId) {
	    System.out.println(catagoryId);
	    System.out.println(productId);
	    // retrieve an instance of a category using another method in the service.
	    Catagory thisCatagory = findCatagoryById(catagoryId);
	    
	    // retrieve an instance of a product using another method in the service.
	    Product thisProduct = findProductById(productId);
	    
	    // add the product to this category's list of products
	    thisCatagory.getProducts().add(thisProduct);
	    
	    // Save thisCategory, since you made changes to its product list.
	    return catagoryRepo.save(thisCatagory);
	}
	public Product findProductById(Long id) {
		Optional<Product> optionalProduct = productRepo.findById(id);
        if(optionalProduct.isPresent()) {
            return optionalProduct.get();
        } else {
            return null;
        }
	}
	public List<Catagory> allCatagories() {
        return catagoryRepo.findAll();
    }
}
