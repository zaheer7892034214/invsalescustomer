package com.sales.customer;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_type")
public class ProductType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 571113272730177962L;
	
	@Id
	private int productTypeCode;
	private String description;

	public ProductType() {
		
	}



	public ProductType(int productTypeCode, String description) {
		super();
		this.productTypeCode=productTypeCode;
		this.description = description;
	}



	



	public int getProductTypeCode() {
		return productTypeCode;
	}



	public void setProductTypeCode(int productTypeCode) {
		this.productTypeCode = productTypeCode;
	}



	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
