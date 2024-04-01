package com.Java.BookReviews.Data;

import com.Java.BookReviews.Models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path="books")
public interface  BookRepository extends CrudRepository<Book, Integer> {
    
    
}//end of BookRepository
