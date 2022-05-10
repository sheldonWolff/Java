package com.codingdojo.javaspring.bookclub.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.javaspring.bookclub.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	Optional<User> findByEmail(String email);
}
