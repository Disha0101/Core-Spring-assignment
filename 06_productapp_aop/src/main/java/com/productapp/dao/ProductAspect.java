package com.productapp.dao;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProductAspect {
	@Around("execution(public String hello())")
	public Object added(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("start");
		Object val=joinPoint.proceed();
		System.out.println("end");
		return val;
		
	}

}
