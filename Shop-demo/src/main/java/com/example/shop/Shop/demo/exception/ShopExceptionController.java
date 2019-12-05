package com.example.shop.Shop.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ShopExceptionController {
	
	@ExceptionHandler(value = ShopNotFoundException.class)
	public ResponseEntity<Object> exception(ShopNotFoundException exception) {
	      return new ResponseEntity<>("Shop not found", HttpStatus.NOT_FOUND);
	   }
}
