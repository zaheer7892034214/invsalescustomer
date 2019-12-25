package com.sales.product;

import org.springframework.stereotype.Service;

@Service
public interface ProductTypeService {
	
	public void createProductType(ProductType productType);
	
	public ProductType getProductTypeByProductTypeCode(int productTypeCode);
	
	public ProductType getProductTypeByDescription(String description);

}
