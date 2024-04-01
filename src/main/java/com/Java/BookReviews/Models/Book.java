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
public class Book  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "book_sequence")
    @SequenceGenerator(name = "book_sequence", initialValue = 6, allocationSize = 1)
    private int id;
    private String name;
    private String author;
    
}//end of Book
