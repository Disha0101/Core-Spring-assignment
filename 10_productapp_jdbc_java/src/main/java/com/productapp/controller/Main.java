package com.productapp.controller;
import java.math.BigDecimal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.productapp.config.AppConfig;
import com.productapp.dao.Product;
import com.productapp.service.ProductService;
public class Main {
	public static void main(String[] args) {

	
		
		AnnotationConfigApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(AppConfig.class);
		

		ProductService productService = applicationContext.getBean("productService", ProductService.class);
		
		/*
		 * List<Product> productList=productService.getAll();
		 * 
		 * productList.forEach(p-> System.out.println(p));
		 */
		Product product=new Product(5,"eraser", new BigDecimal(33), "Y");
		
		productService.addProduct(product);
		
//		Product product=productService.getById(2);
//		product.setIsAvailable("N");
//		productService.updateProduct(2, product);
	}

}
