package com.demo;

import org.springframework.stereotype.Component;

@Component(value="v1")  
public class Bike implements Vehical{

	@Override
	public void move() {
		System.out.println("moving on a bike");	
	}

}
