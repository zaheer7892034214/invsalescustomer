package com.sales.order;

import java.util.Date;

public interface OrderService {

	public void createOrder(Orders order);

	public Orders getOrderByCustomerId(String customerId);

	public Orders getOrderByOrderDate(Date orderDate);

	public Orders getOrderByTotalProducts(int totalProducts);

	public Orders getOrderByTotalPrice(Double totalPrice);
	
	public void deleteOrderByOrderId(int orderId);

}
