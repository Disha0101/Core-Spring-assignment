package com.productapp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.productapp.config.ProductConfig;
import com.productapp.dao.Product;
import com.productapp.service.ProductService;

import java.math.BigDecimal;
import java.util.*;

public class Main {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ProductConfig.class);

		ProductService productService = applicationContext.getBean("productService", ProductService.class);

		List<Product> productList = productService.getAll();

		productList.forEach(p -> System.out.println(p));

		System.out.println("===================================================");

		System.out.println(productService.getById(1));

		System.out.println("===================================================");

		Product product1 = new Product(4, "cd", new BigDecimal(40), true);
		productService.addProduct(product1);

		List<Product> productListNew = productService.getAll();
		productListNew.forEach(p -> System.out.println(p));

		System.out.println("===================================================");

		System.out.println(productService.deleteProduct(4));

		System.out.println("===================================================");

		List<Product> productListNew1 = productService.getAll();
		productListNew1.forEach(p -> System.out.println(p));

		System.out.println("===================================================");

		System.out.println(productService.getById(4));

	}

}
