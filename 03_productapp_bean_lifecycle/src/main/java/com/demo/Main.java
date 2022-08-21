package com.demo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.config.AppConfig;
public class Main {
	public static void main(String[] args) {

		/*
		 * 
		 */
		AbstractApplicationContext applicationContext=
				new  AnnotationConfigApplicationContext(AppConfig.class);
		
		applicationContext.registerShutdownHook();
		Product product=(Product) applicationContext.getBean("p");
		System.out.println(product);
		
//		AbstractApplicationContext applicationContext=
//				new  ClassPathXmlApplicationContext("productapp.xml");
//		
//		applicationContext.registerShutdownHook();
//		Product product=applicationContext.getBean("p",Product.class);
//		System.out.println(product);
		
	}

}
