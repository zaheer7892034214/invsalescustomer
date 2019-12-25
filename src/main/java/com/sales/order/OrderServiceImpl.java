package com.sales.order;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService{
	
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void createOrder(Orders order) {
		orderRepository.save(order);
		
	}

	@Override
	public Orders getOrderByCustomerId(String customerId) {
		// TODO Auto-generated method stub
		return orderRepository.getOrderByCustomerId(customerId);
	}

	@Override
	public Orders getOrderByOrderDate(Date orderDate) {
		// TODO Auto-generated method stub
		return orderRepository.getOrderByOrderDate(orderDate);
	}

	@Override
	public Orders getOrderByTotalProducts(int totalProducts) {
		// TODO Auto-generated method stub
		return orderRepository.getOrderByTotalProducts(totalProducts);
	}

	@Override
	public Orders getOrderByTotalPrice(Double totalPrice) {
		// TODO Auto-generated method stub
		return orderRepository.getOrderByTotalPrice(totalPrice);
	}

	@Override
	public void deleteOrderByOrderId(int orderId) {
		orderRepository.deleteById(orderId);
		
	}

	public void deleteById(int orderId) {
		orderRepository.deleteById(orderId);
		
	}
	
	

}
