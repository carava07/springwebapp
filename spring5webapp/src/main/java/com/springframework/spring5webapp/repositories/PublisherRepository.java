/**
 * 
 */
package com.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.spring5webapp.domain.Publisher;

/**
 * @author chaitanyaarava
 *
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
