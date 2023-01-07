package com.map.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Exception_Handler {
	
	@ExceptionHandler(User_Already_Present.class)
	public ResponseEntity<?> getException(User_Already_Present present){
		
		return new ResponseEntity<>("User already present...", HttpStatus.BAD_REQUEST);
	}
	

	@ExceptionHandler(User_Not_Found.class)
	public ResponseEntity<?> getException(User_Not_Found notFound){
		return new ResponseEntity<>("No User found for entered user ID", HttpStatus.NOT_FOUND);
	}

}
