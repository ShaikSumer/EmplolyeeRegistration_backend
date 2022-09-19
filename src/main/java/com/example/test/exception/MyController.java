package com.example.test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice


public class MyController {
	
	@ExceptionHandler 
	public ResponseEntity<ErrorObject> handleResourceNotFoundException(ResourceNotFoundException ex){
		ErrorObject eobj = new ErrorObject();
		eobj.setStatusCode(HttpStatus.NOT_FOUND.value());
		eobj.setMessage(ex.getMessage());
		eobj.setTimestamp(System.currentTimeMillis());
		return new ResponseEntity<ErrorObject>(eobj,HttpStatus.NOT_FOUND);
	}

}
