package com.sales.order;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="order_detail")
public class Orderdetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1513488555791623082L;
	
	@Id
	
	private int orderDetailId;
	private int quantity;
	private String productId;
	




	@JsonBackReference("orders-orderdetails")
	@JoinColumn(name="order_id")
	@ManyToOne(fetch=FetchType.LAZY)
	private Orders orders;
	
	
	
	
	public int getOrderDetailId() {
		return orderDetailId;
	}




	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}




	public int getQuantity() {
		return quantity;
	}




	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




	




	public String getProductId() {
		return productId;
	}




	public void setProductId(String productId) {
		this.productId = productId;
	}




	public Orders getOrders() {
		return orders;
	}




	public void setOrders(Orders orders) {
		this.orders = orders;
	}




	public Orderdetail() {
		
	}
	

}
