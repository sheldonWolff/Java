package com.codingdojo.javaspring.productsandcatagories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.javaspring.productsandcatagories.models.Catagory;
import com.codingdojo.javaspring.productsandcatagories.models.Product;
@Repository
public interface CatagoryRepository extends CrudRepository<Catagory, Long>{
	List<Catagory> findAll();
	List<Catagory> findAllByProducts(Product product);
	List<Catagory> findByProductsNotContains(Product product);
}
