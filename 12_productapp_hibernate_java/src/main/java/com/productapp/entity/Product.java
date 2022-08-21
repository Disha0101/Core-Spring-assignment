package com.productapp.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "product_table")
public class Product {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private BigDecimal price;
	private String isAvailable;
	
	public Product(String name, BigDecimal price, String isAvailable) {
		super();
		this.name = name;
		this.price = price;
		this.isAvailable = isAvailable;
	}
	
	
	
}
