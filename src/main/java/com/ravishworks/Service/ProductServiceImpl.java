package com.ravishworks.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravishworks.DAO.ProductDAOImpl;
import com.ravishworks.Entity.Product;

@Service("service")
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAOImpl dao;
	
	public Integer save(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product selectProductById(Integer productId) {
		Product product = dao.selectProductById(productId);
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
