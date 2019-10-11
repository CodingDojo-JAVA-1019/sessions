package com.codingdojo.books.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.books.models.Author;
import com.codingdojo.books.services.AuthorService;

@Controller
@RequestMapping("/authors") // /authors
public class AuthorController {
	private final AuthorService authorService;
	
	public AuthorController(AuthorService authorService) {
		this.authorService = authorService;
	}
	
//	@RequestMapping("")
	@GetMapping("")
	public String index(Model model) {
		List<Author> authors = authorService.findAll();
		
		model.addAttribute("authors", authors);
		
		return "authors/index.jsp";
	}
	
	@GetMapping("/new")
	public String newAuthor(@ModelAttribute("author") Author author) {
		return "authors/new.jsp";
	}
	
	
//	@RequestMapping(value="", method=RequestMethod.POST)
	@PostMapping("")
	public String create(@Valid @ModelAttribute("author") Author author, BindingResult result) {
//		                     (expression)      ? (if true) : (if false)
		final String page = result.hasErrors() ? "authors/new.jsp" : "redirect:/authors";
		
		if (!result.hasErrors()) {
			authorService.createAuthor(author);
		}
		
		return page;
	}
	
}
