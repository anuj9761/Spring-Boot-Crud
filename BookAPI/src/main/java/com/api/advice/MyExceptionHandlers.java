//package com.api.advice;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//import com.api.controller.BookController;
//import com.api.controller.Exceptions.CustomException;
//
//@ControllerAdvice
//public class MyExceptionHandlers {
//	
////	@Autowired
////	private BookController bookController;
//	
//	@ExceptionHandler(CustomException.class)
//	public ResponseEntity<Object> getMessage(CustomException c){
//		return new ResponseEntity<>(c.); 
//	}
//}
