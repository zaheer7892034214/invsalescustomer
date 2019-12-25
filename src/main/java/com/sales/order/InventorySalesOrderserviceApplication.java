package com.sales.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class InventorySalesOrderserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventorySalesOrderserviceApplication.class, args);
	}

}
