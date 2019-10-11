package com.codingdojo.books.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.books.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{
	List<Author> findAll();
	List<Author> findByNameContaining(String name);
}
