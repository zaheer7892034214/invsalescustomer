package com.sales.customer;

import java.util.Optional;

public interface Customerservice {
	

	public void createCustomer(Customer customer);
	public Optional<Customer> getCustomerByCustomerId(String customerId);
	public Customer getCustomerByFirstName(String firstName);
	public Customer getCustomerByLastName(String lastName);
	public Customer getCustomerByMiddleName(String middleName);
	public void deleteCustomerById(String customerId);
	

}
