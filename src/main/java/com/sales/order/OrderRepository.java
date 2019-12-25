package com.sales.order;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders,Integer>{
	
	public Orders getOrderByCustomerId(String customerId);
	
	public Orders getOrderByOrderDate(Date orderDate);
	
	public Orders getOrderByTotalProducts(int totalProducts);
	
	public Orders getOrderByTotalPrice(Double totalPrice);
	

}
