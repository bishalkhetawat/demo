package com.cgi.ecommerce.pl;
import java.io.*;
import java.util.Scanner;

import com.cgi.ecommerce.bean.Product;
import com.cgi.ecommerce.service.ProductStorageImplementation;
import com.cgi.ecommerce.service.ProductStorageInterface;
public class ECommerceUI2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	Product p=new Product();
	// input logic (presentation logic)
	System.out.println("Enter product id:");
	p.setId(sc.nextInt());
	System.out.println("Enter product name:");
	p.setName(sc.next());
	System.out.println("Enter product price:");
	p.setPrice(sc.nextDouble());
	System.out.println("Enter description:");
	p.setDescription(sc.next());
	// p is a product object ready with values from user
	
	ProductStorageInterface service=
			new ProductStorageImplementation();
	
	service.storeProduct(p);
	System.out.println(" Product stored ");
	
}
}
