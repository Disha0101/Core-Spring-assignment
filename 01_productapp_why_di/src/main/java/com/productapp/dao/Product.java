package com.productapp.dao;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
public class Product {
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", isAvailable=" + isAvailable + "]";
	}
	private Integer id;
	private String name;
	private BigDecimal price;
	private boolean isAvailable;
	public Product(Integer id, String name, BigDecimal price, boolean isAvailable) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.isAvailable = isAvailable;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
	
	
}
