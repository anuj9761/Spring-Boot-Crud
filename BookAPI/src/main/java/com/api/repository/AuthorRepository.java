package com.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.entities.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {
	
}
