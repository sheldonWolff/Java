package com.codingdojo.javaspring.bookclub.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.javaspring.bookclub.models.Book;
import com.codingdojo.javaspring.bookclub.models.LoginUser;
import com.codingdojo.javaspring.bookclub.models.User;
import com.codingdojo.javaspring.bookclub.services.BookService;
import com.codingdojo.javaspring.bookclub.services.UserService;

@Controller
public class MainController {
	@Autowired
    private UserService userServ;
	@Autowired
	private BookService bookServ;
   
   @GetMapping("/")
   public String index(Model model) {
       // Bind empty User and LoginUser objects to the JSP
       // to capture the form input
       model.addAttribute("newUser", new User());
       model.addAttribute("newLogin", new LoginUser());
       return "index.jsp";
   }
   
   @PostMapping("/register")
   public String register(@Valid @ModelAttribute("newUser") User newUser, 
           BindingResult result, Model model, HttpSession session) {
       userServ.register(newUser, result);
       // TO-DO Later -- call a register method in the service 
       // to do some extra validations and create a new user!
       
       if(result.hasErrors()) {
           // Be sure to send in the empty LoginUser before 
           // re-rendering the page.
           model.addAttribute("newLogin", new LoginUser());
           return "index.jsp";
       }
       
       // No errors! 
       // TO-DO Later: Store their ID from the DB in session, 
       // in other words, log them in.
       session.setAttribute("newUser", newUser.getId());
       return "redirect:/home";
   }
   
   @PostMapping("/login")
   public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
           BindingResult result, Model model, HttpSession session) {
       
       // Add once service is implemented:
        User user = userServ.login(newLogin, result);
   
       if(result.hasErrors()) {
           model.addAttribute("newUser", new User());
           return "index.jsp";
       }
   
       // No errors! 
       // TO-DO Later: Store their ID from the DB in session, 
       // in other words, log them in.
       session.setAttribute("newUser", user.getId());
       return "redirect:/home";
   }
   
   @GetMapping("/home")
   public String home(Model model, HttpSession session) {
   	User newUser = userServ.findUser((Long)session.getAttribute("newUser"));
   	List<Book> books = bookServ.allBooks();
   	model.addAttribute("newUser", newUser);
   	model.addAttribute("books", books);
   	return "home.jsp";
   }
   @PostMapping("/new")
	public String newBook(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model, HttpSession session) {
	   if (result.hasErrors()) {
		   
			return "new.jsp";
	   }
	   User newUser = userServ.findUser((Long)session.getAttribute("newUser"));
	   model.addAttribute("newUser", new User());
	   // pull the id from session
	   // get the user from database
	   book.setUser(newUser);
	   // create book
		
		bookServ.createBook(book);
		return "redirect:/home";
	}
   @GetMapping("/books/new")
   public String addBook(Book book, BindingResult result, Model model, HttpSession session) {
	   User newUser = userServ.findUser((Long)session.getAttribute("newUser"));
	   model.addAttribute("newUser", newUser);
	   return "new.jsp";
   }
   
   
   @GetMapping("/books/{id}/edit")
   public String editPage(Model model, @PathVariable("id") Long id, HttpSession session) {
   	
   	Book book = bookServ.findById(id);
   	model.addAttribute("book", book);
   	
   	return "edit.jsp";
   }
   
   
	@PutMapping("/book")
	public String update(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model, HttpSession session) {
		
		if (result.hasErrors()) {
			return "/edit.jsp";
		}
		else {
			User user = userServ.findUser((Long)session.getAttribute("newUser"));
			   model.addAttribute("user", user);
			   book.setUser(user);
			bookServ.createBook(book);
			return "redirect:/home";
		}
	}
	
	
	 @GetMapping("/logout")
	    public String logout(HttpSession session) {
	    	session.invalidate();
	    	return "redirect:/";
	    }
	 @DeleteMapping("/book/{id}/delete")
		public String destroy(@PathVariable("id") Long id) {
			bookServ.deleteBook(id);
			return "redirect:/home";
		}

}
