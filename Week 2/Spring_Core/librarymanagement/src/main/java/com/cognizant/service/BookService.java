package com.cognizant.service;

import com.cognizant.repository.BookRepository;


public class BookService {

    //create a reference of BookRepository class
    private BookRepository bookRepository;

    // create a setter method for BookRepository class
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void display() {

        /*Exercise 1 */
        System.out.println("Book Service");

        /* Exercise 2 */
        //Now we will update the service
        bookRepository.display();

    }
}
