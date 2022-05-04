package com.codingdojo.javaspring.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.javaspring.dojosandninjas.models.Dojo;
import com.codingdojo.javaspring.dojosandninjas.models.Ninja;
import com.codingdojo.javaspring.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoServices {
	@Autowired
	private DojoRepository dojoRepository;

	
    public List<Dojo> allDojos() {
        return dojoRepository.findAll();
    }
    public Dojo createDojo(Dojo b) {
        return dojoRepository.save(b);
    }
    public Ninja createNinja(Ninja b) {
        return dojoRepository.save(b);
    }
    public Dojo findDojos(Long id) {
        Optional<Dojo> optionalDojo = dojoRepository.findById(id);
        if(optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
    }
    public Dojo updateDojo(Dojo b) {
    	return dojoRepository.save(b);
    }
	public void deleteDojo(Long id) {
		dojoRepository.deleteById(id);
	}
	 public Ninja findNinjas(Long id) {
	        Optional<Ninja> optionalNinja = Optional.empty();
	        if(optionalNinja.isPresent()) {
	            return optionalNinja.get();
	        } else {
	            return null;
	        }
	 }
}
