package com.tcs.irctc.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<?> handleArithmeticException(ArithmeticException e) {
		System.out.println("CAME");
		return ResponseEntity.internalServerError().body("Arithmetic Exception Happened " + e.getLocalizedMessage());
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleException(Exception e) {
		return ResponseEntity.internalServerError().body("Exception Happened " + e.getLocalizedMessage());
	}
	
}
