package com.sales.customer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements Customerservice{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public void createCustomer(Customer customer) {
		customerRepository.save(customer);
		
	}

	@Override
	public Optional<Customer> getCustomerByCustomerId(String customerId) {
		// TODO Auto-generated method stub
		return customerRepository.findById(customerId);
	}

	@Override
	public Customer getCustomerByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return customerRepository.getCustomerByFirstName(firstName);
	}

	@Override
	public Customer getCustomerByLastName(String lastName) {
		// TODO Auto-generated method stub
		return customerRepository.getCustomerByLastName(lastName);
	}

	@Override
	public Customer getCustomerByMiddleName(String middleName) {
		// TODO Auto-generated method stub
		return customerRepository.getCustomerByMiddleName(middleName);
	}

	@Override
	public void deleteCustomerById(String customerId) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(customerId);
		
	}

}
