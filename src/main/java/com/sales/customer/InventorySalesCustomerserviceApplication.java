package com.sales.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class InventorySalesCustomerserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventorySalesCustomerserviceApplication.class, args);
	}

}
