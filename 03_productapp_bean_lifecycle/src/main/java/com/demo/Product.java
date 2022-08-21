package com.demo;

import java.math.BigDecimal;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="p")
public class Product /* implements BeanNameAware, ApplicationContextAware */ /*
																				 * implements InitializingBean,
																				 * DisposableBean
		
																				 *
																				 */
{
	@Autowired(required=true)
	@Value("201")
	private Integer id;
	@Autowired(required=true)
	@Value("Pen")
	private String name;
	@Autowired(required=true)
	@Value("15")
	private BigDecimal price;
	@Autowired(required=true)
	@Value("true")
	private boolean isAvailable;

	@PostConstruct
	public void myInitProductAnnotation() {
		System.out.println("myInitProduct Annotation is called");
	}
	
	@PreDestroy
	private void myPreDestroyProductAnnotation() {
		System.out.println("myPreDestroyProduct Annotation is called");
	}
	

	private void myInitProduct() {
		System.out.println("myInitProduct xml is called");
	}
	
	private void myPreDestroyProduct() {
		System.out.println("myPreDestroyProduct xml is called");
	}
	
	public Product() {
		System.out.println("default ctr is called");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		System.out.println(" public void setId(Integer id) is called");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println(" public void setName(String name) is called");
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		System.out.println(" public void setPrice(BigDecimal price) is called");
		this.price = price;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		System.out.println(" public void setAvailable(boolean isAvailable) is called");
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", isAvailable=" + isAvailable + "]";
	}
	
	public void destroy() throws Exception {
		System.out.println("public void destroy() throws Exception ");
	}
//
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("public void afterPropertiesSet() throws Exception ");
//	}
	public void setBeanName(String name) {
		System.out.println("public void setBeanName(String name) is called");
	}
//
//	@Override
//	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//		System.out.println("public void setApplicationContext(ApplicationContext applicationContext)");
//	}


	
}
