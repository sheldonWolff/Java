package com.codingdojo.javaspring.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.javaspring.bookclub.models.Book;
import com.codingdojo.javaspring.bookclub.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository bookRepo;
	public Book createBook(Book b) {
        return bookRepo.save(b);
    }
	public Book findById(Long id) {
		Optional<Book> optionalBook = bookRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
	}
	public List<Book> allBooks() {
        return bookRepo.findAll();
    }
}
