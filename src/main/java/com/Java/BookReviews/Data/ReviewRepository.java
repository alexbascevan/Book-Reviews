package com.Java.BookReviews.Data;

import com.Java.BookReviews.Models.Review;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path="reviews")
public interface ReviewRepository extends CrudRepository<Review, Integer> {
    
    List<Review> findByBookId(int bookId);
    
}//end of ReviewRepository
