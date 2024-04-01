package com.Java.BookReviews.Data;

import com.Java.BookReviews.Models.MyUserDetails;
import org.springframework.data.repository.CrudRepository;


public interface UserDetailsRepository extends CrudRepository<MyUserDetails,Integer> {
    
    public MyUserDetails findByUsername(String username);

}
