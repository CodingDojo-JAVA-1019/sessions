package com.codingdojo.books.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.books.models.Book;
import com.codingdojo.books.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepo;
	
	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	public List<Book> findAllBooks() {
		return bookRepo.findAll();
	}
	
	public Book createBook(String title, String publisher, String description) {
		Book book = new Book();
		
		book.setDescription(description);
		book.setTitle(title);
		book.setPublisher(publisher);
		
		return createBook(book);
	}
	
	public Book createBook(Book book) {
		return bookRepo.save(book);
	}
	
	public Book findById(Long id) {
		Optional<Book> book = bookRepo.findById(id);
		
		if (book.isPresent()) {
			return book.get();
		}
		
		
		return null;
	}
	
	public Book update(Book book) {
		return bookRepo.save(book);
	}
	
	
	public void removeBook(Book book) {
		bookRepo.delete(book);
	}
	public void removeBook(Long id) {
		bookRepo.deleteById(id);
	}
}
