package com.productapp.controller;

import java.math.BigDecimal;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.productapp.config.AppConfig;
import com.productapp.dao.Product;
import com.productapp.service.ProductService;
import com.productapp.service.ProductServiceImpl;

public class Main {
	public static void main(String[] args) {

		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		ProductServiceImpl pro=(ProductServiceImpl) ctx.getBean("p");
		
		List<Product> productList=pro.getAll();
		productList.forEach(p-> System.out.println(p));
		
		System.out.println(pro.getById(1));
	}

}
