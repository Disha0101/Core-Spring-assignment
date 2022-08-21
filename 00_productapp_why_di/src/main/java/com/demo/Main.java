package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
public class Main {
	public static void main(String[] args) {

		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("demo.xml");
		Passanger passanger= (Passanger) ctx.getBean("passanger");
		passanger.travel();
		
	}

}
