package com.codingdojo.javaspring.loginandregistration.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.javaspring.loginandregistration.models.LoginUser;
import com.codingdojo.javaspring.loginandregistration.models.User;
import com.codingdojo.javaspring.loginandregistration.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	// TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {
    	
    	Optional<User> foundUser = userRepo.findByEmail(newUser.getEmail());
    	String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
    	if(foundUser.isPresent()) {
    		return foundUser.get();
    	}
    	if(!newUser.getPassword().equals(newUser.getConfirm())) {
    	    result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
    	}
    	if(result.hasErrors()) return null;
    	newUser.setPassword(hashed);
    	this.userRepo.save(newUser);
    	
        return null;
    }
    public User login(LoginUser newLoginObject, BindingResult result) {
        // TO-DO: Additional validations!
    	Optional<User> existingUser = userRepo.findByEmail(newLoginObject.getEmail());
    	if(existingUser.isEmpty()) {
    		return null;
    	}
    	if(!BCrypt.checkpw(newLoginObject.getPassword(), existingUser.get().getPassword())) {
    	    result.rejectValue("password", "Matches", "Invalid Password!");
    	}

        return existingUser.get();
    }
    public User findUser(Long id) {
        Optional<User> optionalUser = userRepo.findById(id);
        if(optionalUser.isPresent()) {
            return optionalUser.get();
        } else {
            return null;
        }
    }
}
