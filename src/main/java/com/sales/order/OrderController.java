package com.sales.order;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderServiceImpl orderServiceImpl;
	
	
	@PostMapping("/createOrder")
	public void createOrder(@RequestBody Orders order) {
		orderServiceImpl.createOrder(order);
		
	}

	@GetMapping("/getOrderByCustomerId/{customerId}")
	public Orders getOrderByCustomerId(@PathVariable String customerId) {
		// TODO Auto-generated method stub
		return orderServiceImpl.getOrderByCustomerId(customerId);
	}

	@GetMapping("/getOrderByOrderDate/{orderDate}")
	public Orders getOrderByOrderDate(@PathVariable Date orderDate) {
		// TODO Auto-generated method stub
		return orderServiceImpl.getOrderByOrderDate(orderDate);
	}

	@GetMapping("/getOrderByTotalProducts/{totalProducts}")
	public Orders getOrderByTotalProducts(@PathVariable int totalProducts) {
		// TODO Auto-generated method stub
		return orderServiceImpl.getOrderByTotalProducts(totalProducts);
	}

	@GetMapping("/getOrderByTotalPrice/{totalPrice}")
	public Orders getOrderByTotalPrice(@PathVariable Double totalPrice) {
		// TODO Auto-generated method stub
		return orderServiceImpl.getOrderByTotalPrice(totalPrice);
	}

	@DeleteMapping("/deleteOrderByOrderId/{orderId}")
	public void deleteOrderByOrderId(@PathVariable int orderId) {
		orderServiceImpl.deleteById(orderId);
		
	}
}
