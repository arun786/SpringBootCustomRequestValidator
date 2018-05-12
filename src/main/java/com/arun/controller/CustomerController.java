/**
 * 
 */
package com.arun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arun.service.CustomerValidator;

/**
 * @author Adwiti
 *
 */
@RestController
public class CustomerController {
	
	@GetMapping("/customer/customers")
	public String getCustomerDetails(@RequestParam(value="customerId", required= false) String customerId){
		new CustomerValidator().validate(customerId, null);
			return null;
	}

}
