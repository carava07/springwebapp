/**
 * 
 */
package com.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springframework.spring5webapp.domain.Author;
import com.springframework.spring5webapp.domain.Book;
import com.springframework.spring5webapp.domain.Publisher;
import com.springframework.spring5webapp.repositories.AuthorRepository;
import com.springframework.spring5webapp.repositories.BookRepository;
import com.springframework.spring5webapp.repositories.PublisherRepository;

/**
 * @author chaitanyaarava
 *
 */
@Component
public class BootStrapData implements CommandLineRunner{

	private final AuthorRepository authorRepository;
	
	private final BookRepository bookRepository;
	
	private final PublisherRepository publisherRepository;
	
	/**
	 * @param authorRepository
	 * @param bookRepository
	 */
	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}


	@Override
	public void run(String... args) throws Exception {

		Author author = new Author("James", "cameron");
		Book book = new Book("Spring Framework", "17865B89");
		Publisher publisher = new Publisher();
		publisher.setAddressLine1("90 Meadows");
		publisher.setCity("Park");
		publisher.setState("MI");
		publisher.setZip("9088");
		
		publisherRepository.save(publisher);
		
		book.getAuthors().add(author);
		author.getBooks().add(book);
		book.setPublisher(publisher);
		publisher.getBooks().add(book);
		
		authorRepository.save(author);
		bookRepository.save(book);
		publisherRepository.save(publisher);
		
		Author author1 = new Author("Rod", "Janson");
		Book book1 = new Book("Ejb J2EE", "8900877");
		
		author1.getBooks().add(book);
		book1.getAuthors().add(author);
		
		book1.setPublisher(publisher);
		publisher.getBooks().add(book1);
		
		authorRepository.save(author1);
		bookRepository.save(book1);
		publisherRepository.save(publisher);
		
		System.out.println("Started in bootStrap");
		System.out.println("Number of Books..."+bookRepository.count());
	}

}
