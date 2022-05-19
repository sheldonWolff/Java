package com.codingdojo.javaspring.productsandcatagories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codingdojo.javaspring.productsandcatagories.models.Product;
import com.codingdojo.javaspring.productsandcatagories.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepo;
	public Product createProduct(Product b) {
		return productRepo.save(b);
	}
	public Product findProductById(Long id) {
		Optional<Product> optionalProduct = productRepo.findById(id);
        if(optionalProduct.isPresent()) {
            return optionalProduct.get();
        } else {
            return null;
        }
	}
	public List<Product> allProducts() {
        return productRepo.findAll();
    }
}
