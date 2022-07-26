//package com.api.controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.api.controller.Exceptions.CustomException;
//import com.api.entities.Author;
//import com.api.entities.Book;
//import com.api.services.BookAPIService;
//
//@RestController
//public class BookController {
//	
//	
//	Logger logger = LogManager.getLogger(BookController.class);
//	
//	@Autowired
//	private BookAPIService bookAPIService;
//	
//		//GET ALL BOOKS HANDLER
//		@GetMapping("/books")
//		public List<Book> getBooks()
//		{
//			logger.info("************************************************************");
//			return this.bookAPIService.getAllBooks();
//		}
//		
//		@RequestMapping("/api")
//		public void getMessage() throws CustomException {
//			throw new CustomException();
//		}
//		
//		//GET ALL AUTHORS HANDLER
//		@GetMapping("/authors")
//		public List<Author> getAuthors()
//		{
//			
//			return this.bookAPIService.getAllAuthors();
//		}
//		
//		//GET SINGLE BOOK HANDLER
//		@GetMapping("/books/{id}")
//		public Optional<Book> getBook(@PathVariable("id") int id)
//		{
//			return bookAPIService.getBookById(id);
//		}
//		
//		// GET AUTHOR BY ID
//		@GetMapping("/authors/{id}")
//		public Optional<Author> getAuthor(@PathVariable("id") int id)
//		{
//			return bookAPIService.getAuthorById(id);
//		}
//		
//		//NEW BOOK HANDLER
//		@PostMapping("/books")
//		public Book addBook(@RequestBody Book book)
//		{
//			this.bookAPIService.addBook(book);
//			System.out.println(book);
//			System.out.println("Author Added");
//			return book;
//		}
//		
//		//NEW AUTHOR HANDLER
//		@PostMapping("/author")
//		public Author addAuthor(@RequestBody Author author)
//		{
//			this.bookAPIService.addAuthor(author);
//			System.out.println(author);
//			System.out.println("Author Added");
//			return author;
//		}
//		
//
//		//DELETE BOOK HANDLER
//		@DeleteMapping("/books/{bookId}")
//		public void deleteBook(@PathVariable("bookId") int bookId)
//		{
//			this.bookAPIService.deleteBook(bookId);
//			System.out.println("book deleted");
//		}
//		
//		//DELETE AUTHOR HANDLER
//		@DeleteMapping("/author/{authorId}")
//		public void deleteAuthor(@PathVariable("authorId") int authorId)
//		{
//			this.bookAPIService.deleteAuthor(authorId);
//			System.out.println("author deleted");
//		}
//}