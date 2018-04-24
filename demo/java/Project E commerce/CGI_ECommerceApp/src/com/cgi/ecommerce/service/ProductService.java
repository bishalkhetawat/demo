package com.cgi.ecommerce.service;

import java.util.LinkedList;
import java.util.List;

import com.cgi.ecommerce.bean.Product;

public class ProductService {

	List<Product> prodList=new LinkedList<Product>();
	
	public boolean addProduct(Product p)
	{		
		return prodList.add(p);	
	}
	
	public Product removeProduct(int id)
	{
		return prodList.remove(id);				
	}
	
	public List<Product> getAllProducts()
	{	
		   return prodList;				
	}
	
	
	
	public Product getProductById(int id)
	{
		
	   for(Product p:prodList)
	   {
		   if(p.getId()==id)
		   {
			   return p;			   
		   }
		   
	   }
	   return null;
			
	}
	
	public Product updateProduct(Product p)
	{
		int id=p.getId();
		   for(Product pr:prodList)
		   {
			   if(pr.getId()==id)
			   {
				   pr.setName(p.getName());
				   pr.setPrice(p.getPrice());
				   pr.setDescription(p.getDescription());
				   			   
			   }			  
		   }		
		return p;
	}	
}
