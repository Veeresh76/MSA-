package com.Mindtree.Student.ExceptionHandler;

import java.util.NoSuchElementException;



import org.hibernate.TypeMismatchException;
import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MainExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<Object> checkInput(EmptyInputException emptyInputException) {
		return new ResponseEntity<Object>(emptyInputException.getM(),HttpStatus.BAD_GATEWAY );
	}
	
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleEmptyInput(NoSuchElementException noSuchElementException) {
		return new ResponseEntity<String>("No Elements found",HttpStatus.BAD_GATEWAY );
	}
	
	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		return new ResponseEntity<Object>("Check Input method type ",HttpStatus.BAD_GATEWAY );
	}
	
	@ExceptionHandler(TypeMismatchException.class)
	public ResponseEntity<String> handleInputMismatch(TypeMismatchException typeMismatchException) {
		return new ResponseEntity<String>(" Input type not supported ",HttpStatus.BAD_GATEWAY );
	}
	
/*	@ExceptionHandler(ConversionNotSupportedException.class)
	public ResponseEntity<String> handelConversionException(ConversionNotSupportedException conversionNotSupportedException) {
		return new ResponseEntity<String>("couldn't convert data to required type",HttpStatus.BAD_GATEWAY );
	}  */     
	
}
