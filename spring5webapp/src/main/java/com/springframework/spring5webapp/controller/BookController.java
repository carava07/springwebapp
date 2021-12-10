/**
 * 
 */
package com.springframework.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springframework.spring5webapp.repositories.BookRepository;

/**
 * @author chaitanyaarava
 *
 */
@Controller
public class BookController {
	
	
	private final BookRepository bookRepository;
	
	
	/**
	 * @param bookRepository
	 */
	public BookController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}


	@RequestMapping("/books")
	public String getBooks(Model model) {
		
		model.addAttribute("books", bookRepository.findAll());
		
		return "list";
	}

}
