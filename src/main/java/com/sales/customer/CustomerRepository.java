package com.sales.customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String>{
	
	public Customer getCustomerByFirstName(String firstName);
	public Customer getCustomerByLastName(String lastName);
	public Customer getCustomerByMiddleName(String middleName);
	
	

}
