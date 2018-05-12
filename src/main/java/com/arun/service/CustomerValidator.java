/**
 * 
 */
package com.arun.service;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.arun.exception.DataNotFoundException;

/**
 * @author Adwiti
 *
 */
public class CustomerValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return String.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		String customerId = (String) target;
		if (customerId == null)
			throw new DataNotFoundException("CustomerId cannot be null");

	}

}
