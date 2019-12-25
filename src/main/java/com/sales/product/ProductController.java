package com.sales.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductTypeServiceImpl productServiceImpl;
	
	@PostMapping("/createProductType")
	public void createProductType(@RequestBody ProductType productType) {
		productServiceImpl.createProductType(productType);
	}
	
	@GetMapping("/getProductTypeByProductTypeId/{productTypeId}")
	public ProductType getProductTypeByProductTypeId(@PathVariable int productTypeId) {
		return productServiceImpl.getProductTypeByProductTypeCode(productTypeId);
		
	}
	
	@GetMapping("/getProductTypeByDescription/{description}")
	public ProductType getProductTypeByDescription(@PathVariable String description) {
		return productServiceImpl.getProductTypeByDescription(description);
	}
	

}
