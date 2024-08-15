package com.ravishworks.Service;

import com.ravishworks.Entity.Product;

public interface ProductService {
	
	Integer save(Product product);
	Product selectProductById(Integer productId);
	Product updateProductById(Product product);
	Integer deleteProductById(Integer productId);
	
}
