package com.cgi.ecommerce.service;

import java.util.List;

import com.cgi.ecommerce.bean.Product;

public interface ProductServiceInterface {
	public boolean addProduct(Product p);
	public Product removeProduct(int id);
	public List<Product> getAllProducts();
	public Product getProductById(int id);
	public Product updateProduct(Product p);
	public List<Product> sortProductsInAscending(List<Product> p);
	
}
