package com.codingdojo.javaspring.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.javaspring.dojosandninjas.models.Dojo;
import com.codingdojo.javaspring.dojosandninjas.models.Ninja;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {
    List<Dojo> findAll();

	Ninja save(Ninja b);
}