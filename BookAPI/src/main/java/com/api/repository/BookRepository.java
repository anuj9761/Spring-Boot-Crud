package com.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.entities.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

}
