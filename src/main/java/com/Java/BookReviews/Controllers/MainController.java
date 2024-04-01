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
    BookRepository bookRepo;
    
    @Autowired
    ReviewRepository reviewRepo;
    
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("books", bookRepo.findAll());
        return "index";
    }
    
    @RequestMapping("/addBook")
    public String addBook(Model model){
        model.addAttribute("book", new Book());
        return "addBook";
    }
    
    @RequestMapping("/saveBook")
    public String saveBook(@ModelAttribute Book book){
        bookRepo.save(book);
        return "redirect:/";
    }
    
    @RequestMapping("/addReview/{id}")
    public String addReview(@PathVariable int id, Model model){
        Optional<Book> book = bookRepo.findById(id);
        model.addAttribute("book",book);
        model.addAttribute("review", new Review());
        return "addReview";
    }
    
    @RequestMapping("/saveReview")
    public String saveReview(@ModelAttribute Review review){
        reviewRepo.save(review);
        return "redirect:/";
    }

}
