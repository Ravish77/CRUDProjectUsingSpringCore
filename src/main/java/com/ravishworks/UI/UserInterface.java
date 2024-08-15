package com.ravishworks.UI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ravishworks.Controller.ProductController;
import com.ravishworks.Entity.Product;

public class UserInterface {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductController controller = applicationContext.getBean("controller", ProductController.class);
		Product product = controller.selectProductById(3);
		System.out.println("ProductId\tProductName\tProductPrice\tProductCompany");
		System.out.println(product.getProductId()+"\t"+product.getProductName()+"\t"+product.getProductPrice()+"\t"+product.getProductCompany());
		
		applicationContext.close();
		
	}

}
