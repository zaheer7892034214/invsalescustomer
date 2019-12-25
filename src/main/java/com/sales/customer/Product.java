package com.sales.customer;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9040343073763363440L;
	
	@Id
	private String productId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="product_type_code")
	private ProductType productType;
	
	private String name;
	private String description;
	private Double price;
	
	public Product() {
		
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
