package com.cgi.ecommerce.pl;
import com.cgi.ecommerce.bean.*;
import com.cgi.ecommerce.service.ProductService;
import java.util.*;
public class ECommerceUI {

	public static void main(String[] args) {
	
		ProductService pService=
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
		
		
		
		
		
		
	    
	
	}
}
