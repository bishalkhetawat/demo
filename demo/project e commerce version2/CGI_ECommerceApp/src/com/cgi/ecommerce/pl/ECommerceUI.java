package com.cgi.ecommerce.pl;
import com.cgi.ecommerce.bean.*;
import com.cgi.ecommerce.service.ProductService;
import com.cgi.ecommerce.service.ProductServiceInterface;

import java.util.*;
public class ECommerceUI {

	public static void main(String[] args) {
	
		ProductServiceInterface pService=
				new ProductService();
				
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			Product p=new Product();
		System.out.println("Enter product id:");
		p.setId(sc.nextInt());
		System.out.println("Enter product name:");
		p.setName(sc.next());
		System.out.println("Enter product price:");
		p.setPrice(sc.nextDouble());
		System.out.println("Enter description:");
		p.setDescription(sc.next());
		
		pService.addProduct(p);
		
		}
		
		// code to retrieve all procucts		
		List<Product> pList=pService.getAllProducts();
		
		Iterator it=pList.iterator();
		while(it.hasNext())
		{
			Product pr=(Product)it.next();
			System.out.println(pr.getId());
			System.out.println(pr.getName());
			System.out.println(pr.getPrice());
			System.out.println(pr.getDescription());
			System.out.println("-----------------------");
		}
		
		
		System.out.println(" Enter product id to search:");
		int searchProductId=sc.nextInt();
		
		Product findProduct=
				pService.getProductById(searchProductId);
		if(findProduct!=null)
		{
			System.out.println(" Product found with details");
			System.out.println(findProduct.getName());
			System.out.println(findProduct.getPrice());
			System.out.println(findProduct.getDescription());
		}
		else
		{
			System.out.println(" Product not found");
		}
		
		
		
		
		
	    
	
	}
}
