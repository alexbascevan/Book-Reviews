package com.Java.BookReviews.Services;

import com.Java.BookReviews.Data.UserDetailsRepository;
import com.Java.BookReviews.Models.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {
    
    @Autowired
    private UserDetailsRepository userRepository;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        MyUserDetails mud = userRepository.findByUsername(username);
        
        if (mud == null) throw new UsernameNotFoundException("User not found");
        
        return mud;
            
    }
    
}//end of UserDetialsServiceImpl

