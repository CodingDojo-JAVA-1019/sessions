package com.codingdojo.books.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.books.models.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
    // this method retrieves all the books from the database
    List<Book> findAll();
    // this method find a book by their description
    List<Book> findByDescriptionContaining(String search);
    // this method counts how many titles contain a certain string
    Long countByTitleContaining(String search);
    // this method deletes a book that starts with a specific title
    Long deleteByTitleStartingWith(String search);
}
//. References to generic type CrudRepository<T,ID> should be parameterized