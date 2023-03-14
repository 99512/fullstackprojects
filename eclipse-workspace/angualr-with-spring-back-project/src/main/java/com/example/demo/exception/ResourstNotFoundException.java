package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourstNotFoundException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;

	public ResourstNotFoundException(String message) {
		super(message);
	}
	
}
