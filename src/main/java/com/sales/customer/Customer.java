package com.sales.customer;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="customer")
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5904101474914750409L;
	
	@Id
	private String customerId;
	
	public Customer() {
		
	}
	
	
	public Customer(String customerId, String firstName, String middleName, String lastName) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	private String firstName;
	private String middleName;
	private String lastName;
	
	@JsonManagedReference("customer-address")
	@OneToMany(mappedBy="customer",cascade=CascadeType.ALL,orphanRemoval=true)
	private List<Address> addressList;
	
	
	@JsonManagedReference("customer-contact")
	@OneToMany(mappedBy = "customer",cascade=CascadeType.ALL,orphanRemoval=true)
	private List<Contact> contactList;
	
	
	public List<Address> getAddressList() {
		return addressList;
	}


	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}


	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
