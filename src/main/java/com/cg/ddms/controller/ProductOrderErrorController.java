package com.cg.ddms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.ddms.exception.ProductOrderException;

public class ProductOrderErrorController {
	
	@ExceptionHandler(value= ProductOrderException.class)
	public ResponseEntity<String> handleNotFoundException(ProductOrderException e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}


}
