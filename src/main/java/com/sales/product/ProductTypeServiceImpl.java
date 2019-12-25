package com.sales.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductTypeServiceImpl implements ProductTypeService{

	@Autowired
	public ProductTypeRepository productTypeRepository;
	
	
	@Override
	public void createProductType(ProductType productType) {
		productTypeRepository.save(productType);
		
	}

	@Override
	public ProductType getProductTypeByProductTypeCode(int productTypeCode) {
		
		return productTypeRepository.getOne(productTypeCode);
	}

	@Override
	public ProductType getProductTypeByDescription(String description) {
		
		return productTypeRepository.getProductTypeByDescription();
	}

}
