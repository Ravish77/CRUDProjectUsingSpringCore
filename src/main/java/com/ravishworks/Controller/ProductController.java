package com.ravishworks.Controller;

import com.ravishworks.Entity.Product;

public interface ProductController {
	
	Integer save(Product product);
	Product selectProductById(Integer productId);
	Product updateProductById(Product product);
	Integer deleteProductById(Integer productId);
	
}
