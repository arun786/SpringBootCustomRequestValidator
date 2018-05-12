/**
 * 
 */
package com.arun.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.arun.constants.RConstants;

/**
 * @author Adwiti
 *
 */
@ControllerAdvice
@RestController
public class GenericExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<ExceptionResponse> handleDataNotFoundException(DataNotFoundException e, WebRequest request) {
		ExceptionResponse response = new ExceptionResponse(RConstants.DATA_NOT_FOUND, e.getMessage());
		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);

	}

}
