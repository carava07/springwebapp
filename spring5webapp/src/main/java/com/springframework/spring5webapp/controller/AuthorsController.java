/**
 * 
 */
package com.springframework.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springframework.spring5webapp.repositories.AuthorRepository;

/**
 * @author chaitanyaarava
 *
 */
@Controller
public class AuthorsController {
	
	private final AuthorRepository authorRepository;
	
	/**
	 * @param authorRepository
	 */
	public AuthorsController(AuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}

	@RequestMapping("/authors")
	private String getAuthors(Model model) {
		
		model.addAttribute("authors", authorRepository.findAll());
		return "author";
	}

}
