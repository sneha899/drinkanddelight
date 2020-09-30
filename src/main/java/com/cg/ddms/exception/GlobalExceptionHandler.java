package com.cg.ddms.exception;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

public class GlobalExceptionHandler {
	@ExceptionHandler(ProductOrderException.class)
	public @ResponseBody ResponseEntity<ErrorInfo>  handleException(ProductOrderException ex,HttpServletRequest req)
	{
		
		 String message=ex.getMessage();
		 String uri= req.getRequestURI();
		 
		 ErrorInfo  obj = new ErrorInfo(LocalDateTime.now(),message,uri);
		 ResponseEntity<ErrorInfo>  re = new ResponseEntity<ErrorInfo>(obj,HttpStatus.NOT_FOUND);
		 return re;
	}


}
