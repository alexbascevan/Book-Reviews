package com.Java.BookReviews.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "review_sequence")
//    @SequenceGenerator(name = "review_sequence", initialValue = 11, allocationSize = 1)
    private int id;
    private int bookId;
    private String review;
    
}//end of Review
