package com.ravishworks.DAO;

import com.ravishworks.Entity.Product;

public interface ProductDAO {
	
	Integer save(Product product);
	Product selectProductById(Integer productId);
	Product updateProductById(Product product);
	Integer deleteProductById(Integer productId);
	
}
