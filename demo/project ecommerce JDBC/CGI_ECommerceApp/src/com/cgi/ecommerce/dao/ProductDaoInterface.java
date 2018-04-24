package com.cgi.ecommerce.dao;

import java.util.List;

import com.cgi.ecommerce.bean.Product;

public interface ProductDaoInterface {

	public boolean addProduct(Product p);
	public List<Product> getAllProducts();
	
	
}
