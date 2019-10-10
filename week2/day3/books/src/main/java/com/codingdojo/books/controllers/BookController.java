package com.codingdojo.books.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.books.models.Book;
import com.codingdojo.books.services.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	
	private final BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	// index gets all of a resource (book)
	@RequestMapping("") // /books
	public String index(Model model) {
		List<Book> books = bookService.findAllBooks();
		
		model.addAttribute("books", books);
		
		
		System.out.println("Books");
		System.out.println(books);
		
		
		return "books/index.jsp";
	}
	
	// displays form to create new resource (book)
	@RequestMapping("/new") // books/new
	public String newBook(@ModelAttribute("book") Book book) {
		return "books/new.jsp";
	}
	
	// creates a new resource (book)
	@RequestMapping(value="", method=RequestMethod.POST) // /books
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		System.out.println("creating new book");
		
		if (result.hasErrors()) {
			return "books/new.jsp";
		}
		
		bookService.createBook(book);
		
		
		return "redirect:/books";
	}
	
	// show displays a single resource
	@RequestMapping("/{id}") // /books/2 (book id)
	public String show(@PathVariable("id") Long id, Model model, RedirectAttributes redirectAttrs) {
		Book book = bookService.findById(id);
		
		
		if (book == null) {
			redirectAttrs.addFlashAttribute("error", "Could not find book using id " + id);
			return "redirect:/books";
		}
		
		model.addAttribute("book", book);
		
		return "books/show.jsp";
	}
}
