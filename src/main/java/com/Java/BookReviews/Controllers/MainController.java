package com.Java.BookReviews.Controllers;

import com.Java.BookReviews.Data.BookRepository;
import com.Java.BookReviews.Data.ReviewRepository;
import com.Java.BookReviews.Models.Book;
import com.Java.BookReviews.Models.Review;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class MainController {
    
    @Autowired
    BookRepository bookRepo; // Autowires the BookRepository for accessing book data
    
    @Autowired
    ReviewRepository reviewRepo; // Autowires the ReviewRepository for accessing review data
    
    @RequestMapping("/") // Maps the root URL to this method
    public String index(Model model){
        model.addAttribute("books", bookRepo.findAll()); // Adds all books to the model for display
        return "index"; // Returns the name of the view template to be rendered
    }
    
    @RequestMapping("/addBook") // Maps the "/addBook" URL to this method
    public String addBook(Model model){
        model.addAttribute("book", new Book()); // Adds a new Book object to the model
        return "addBook"; // Returns the name of the view template for adding a book
    }
    
    @RequestMapping("/saveBook") // Maps the "/saveBook" URL to this method
    public String saveBook(@ModelAttribute Book book){
        bookRepo.save(book); // Saves the book data to the repository
        return "redirect:/"; // Redirects the user back to the root URL
    }
    
    @RequestMapping("/addReview/{id}") // Maps the "/addReview/{id}" URL to this method
    public String addReview(@PathVariable int id, Model model){
        Review review = new Review();
        review.setBookId(id);
        model.addAttribute("book",bookRepo.findById(id)); // Adds the book to the model for display
        model.addAttribute("revw", review ); // Adds a new Review object to the model
        return "addReview"; // Returns the name of the view template for adding a review
    }
    
    @RequestMapping("/saveReview") // Maps the "/saveReview" URL to this method
    public String saveReview(@ModelAttribute Review revw){
        System.out.println("**** Saving "+revw);
        reviewRepo.save(revw); // Saves the review data to the repository
        return "redirect:/"; // Redirects the user back to the root URL
    }

}//end of MainController
