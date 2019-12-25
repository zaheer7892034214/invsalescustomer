package com.sales.customer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	
	@PostMapping("/createCustomer")
	public void createCustomer(@RequestBody Customer customer) {
		customerServiceImpl.createCustomer(customer);
		
	}

	@GetMapping("/getCustomerByCustomerId/{customerId}")
	public Optional<Customer> getCustomerByCustomerId(@PathVariable String customerId) {
		// TODO Auto-generated method stub
		return customerServiceImpl.getCustomerByCustomerId(customerId);
	}

	@GetMapping("/getCustomerByFirstName/{firstName}")
	public Customer getCustomerByFirstName(@PathVariable String firstName) {
		// TODO Auto-generated method stub
		return customerServiceImpl.getCustomerByFirstName(firstName);
	}

	@GetMapping("/getCustomerByLastName/{lastName}")
	public Customer getCustomerByLastName(@PathVariable String lastName) {
		// TODO Auto-generated method stub
		return customerServiceImpl.getCustomerByLastName(lastName);
	}

	@GetMapping("/getCustomerByMiddleName/{middleName}")
	public Customer getCustomerByMiddleName(@PathVariable  String middleName) {
		// TODO Auto-generated method stub
		return customerServiceImpl.getCustomerByMiddleName(middleName);
	}

	@DeleteMapping("/deleteCustomerById/{customerId}")
	public void deleteCustomerById(@PathVariable String customerId) {
		// TODO Auto-generated method stub
		customerServiceImpl.deleteCustomerById(customerId);
		
	}

}
