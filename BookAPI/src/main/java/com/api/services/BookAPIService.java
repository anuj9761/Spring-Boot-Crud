package com.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entities.Author;
import com.api.entities.Book;
import com.api.repository.AuthorRepository;
import com.api.repository.BookRepository;

@Service
public class BookAPIService {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private AuthorRepository authorRepository;
	
		 
			//get all books
		public List<Book> getAllBooks()
		{
		 List<Book> list =(List<Book>)this.bookRepository.findAll();
			return list;
		}
		
		//get all authors
		public List<Author> getAllAuthors()
		{
			List<Author> list = (List<Author>)this.authorRepository.findAll();
			return list;
		}
		
		//get single book by id
		public Optional<Book> getBookById(int id)
		{
			Optional<Book> book = null;
			book=this.bookRepository.findById(id);
			return book;
		}
		
		//get single author by id
		public Optional<Author> getAuthorById(int id)
		{
			//Author author = null;
			Optional<Author> author = this.authorRepository.findById(id);
			return author;
		}
		
		//ADDING THE BOOK
		public void addBook(Book b)
		{
			 bookRepository.save(b);
		}
		
		//Adding the author
		public void addAuthor(Author a)
		{
			authorRepository.save(a);
		}
		
		//Deleting book
		public void deleteBook(int bid)
		{		
			bookRepository.deleteById(bid);
		}
		
		//Deleting Author
		public void deleteAuthor(int aid)
		{
			authorRepository.deleteById(aid);
		}
	}