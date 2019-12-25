package com.sales.customer;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name="orders")
public class Orders implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2081611548373966683L;

	@Id
	@Column(name="order_id")
	private int orderId;
	private String customerId;
	
	private Date orderDate;
	private int totalProducts;
	private Double totalPrice;
	
	@JsonManagedReference("orders-orderdetails")
	@OneToMany(mappedBy = "orders",cascade=CascadeType.ALL)
	private List<Orderdetail> orderDetailList;
	
	public List<Orderdetail> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(List<Orderdetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}

	public Orders() {
	
	}

	

	

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getTotalProducts() {
		return totalProducts;
	}

	public void setTotalProducts(int totalProducts) {
		this.totalProducts = totalProducts;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
