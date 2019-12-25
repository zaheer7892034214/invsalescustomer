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
@Table(name = "contact")
public class Contact implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -195961456852024022L;

	public Contact() {

	}
  
	@Id
	private int contactId;
	private String type;
	private String contactText;
	
	@JsonBackReference("customer-contact")
	@JoinColumn(name="customer_id")
	@ManyToOne(fetch=FetchType.LAZY)
	private Customer customer;

	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContactText() {
		return contactText;
	}
	public void setContactText(String contactText) {
		this.contactText = contactText;
	}
	public Contact(int contactId, String type, String contactText) {
		super();
		this.contactId = contactId;
		this.type = type;
		this.contactText = contactText;
	}

}
