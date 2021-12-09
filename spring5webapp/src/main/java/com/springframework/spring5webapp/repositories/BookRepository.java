/**
 * 
 */
package com.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.spring5webapp.domain.Book;

/**
 * @author chaitanyaarava
 *
 */
public interface BookRepository extends CrudRepository<Book, Long>{

}
