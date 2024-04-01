package com.Java.BookReviews.Data;

import com.Java.BookReviews.Models.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path="reviews")
public interface ReviewRepository extends CrudRepository<Review, Integer> {
    
    
}//end of ReviewRepository
