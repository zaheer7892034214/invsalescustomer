package com.sales.customer;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="address")
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2250036396564384803L;
	
	public Address() {
		
	}
	
	
	public Address(int addressId, String street1, String street2, String city, String state, String zipCode) {
		super();
		this.addressId = addressId;
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}


	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Id
	private int addressId;
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String zipCode;
	
	@JsonBackReference("customer-address")
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="customer_id")
	public Customer customer;
	
	
	

}
