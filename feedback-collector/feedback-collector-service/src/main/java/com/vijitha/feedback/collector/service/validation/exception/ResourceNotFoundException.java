package com.vijitha.feedback.collector.service.validation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "resource not found")
public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException(String message){
		super(message);
	}

}
