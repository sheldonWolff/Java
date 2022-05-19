package com.codingdojo.javaspring.productsandcatagories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.javaspring.productsandcatagories.models.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	List<Product> findAll();
}
