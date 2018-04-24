package com.cgi.ecommerce.pl;

import java.util.List;

import com.cgi.ecommerce.bean.Product;
import com.cgi.ecommerce.dao.ProductDaoImplementation;
import com.cgi.ecommerce.dao.ProductDaoInterface;

public class DatabaseMain {
public static void main(String[] args) {
	
	Product p=new Product();
	p.setId(177);
	p.setName("Maggi");
	p.setPrice(222);
	p.setDescription(" Eat...Eat ..");
	
	ProductDaoInterface dao=
			new ProductDaoImplementation();

	//System.out.println(dao.addProduct(p));
	
	
	// Code to get all products
	
	List<Product> prodList=dao.getAllProducts();
	
	for(Product pr:prodList)
	{
		System.out.println(pr.getId()+" "+pr.getName()+" "+pr.getPrice()+"  "+pr.getDescription());
	}
	
	
	
}
}
