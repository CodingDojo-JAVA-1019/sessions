package com.codingdojo.books.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.books.models.Author;
import com.codingdojo.books.repositories.AuthorRepository;

@Service
public class AuthorService {
	private final AuthorRepository authorRepo;
	
	public AuthorService(AuthorRepository authorRepo) {
		this.authorRepo = authorRepo;
	}
	
	public List<Author> findAll() {
		return authorRepo.findAll();
	}
	
	public Author findById(Long id) {
		return authorRepo.findById(id).orElse(null);
	}
	
	public Author createAuthor(Author author) {
		return authorRepo.save(author);
	}
}
