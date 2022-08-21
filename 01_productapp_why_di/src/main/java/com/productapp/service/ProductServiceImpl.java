package com.productapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.productapp.dao.Product;
import com.productapp.dao.ProductDao;
import com.productapp.dao.ProductDaoMapImpl;
@Component(value = "p")
public class ProductServiceImpl implements ProductService {

	//Tight coupling: what if i have to use ProductDaoJdbcImpl.. :(
	//private ProductDao productDao=new ProductDaoMapImpl();
	@Autowired
	private ProductDao productDao;
	
	public ProductServiceImpl(ProductDao productDao) {
		this.productDao = productDao;
	}
	@Override
	public List<Product> getAll() {
		return productDao.getAll().stream().filter(p->p.isAvailable()).collect(Collectors.toList());
	}

	@Override
	public Product getById(Integer id) {
		return productDao.getById(id);
	}

	@Override
	public Product addProduct(Product product) {
		return productDao.addProduct(product);
	}

	@Override
	public Product deleteProduct(Integer id) {
		return productDao.deleteProduct(id);
	}

	@Override
	public Product updateProduct(Integer id, Product product) {
		return productDao.updateProduct(id, product);
	}

}