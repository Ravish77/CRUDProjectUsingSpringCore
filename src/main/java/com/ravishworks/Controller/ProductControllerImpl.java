package com.ravishworks.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ravishworks.Entity.Product;
import com.ravishworks.Service.ProductServiceImpl;

@Controller("controller")
public class ProductControllerImpl implements ProductController {

	@Autowired
	ProductServiceImpl service;
	
	public Integer save(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product selectProductById(Integer productId) {
		Product product = service.selectProductById(productId);
		return product;
	}

	public Product updateProductById(Product product) {
		// TODO Auto-generated method stub
			return null;
	}

	public Integer deleteProductById(Integer productId) {
		// TODO Auto-generated method stub
		return null;
	}

}
