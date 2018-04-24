package com.cgi.ecommerce.service;
import java.io.*;
import com.cgi.ecommerce.bean.Product;

public class ProductStorageImplementation implements ProductStorageInterface 
{
	
	public void storeProduct(Product p)
	{
		try
		{
		String fileName="D:/temp/products.txt";
		
		FileWriter fw=new FileWriter(fileName);
		fw.write(p.getId());		
		fw.write("    ");
		fw.write(p.getName());
		fw.write("     ");
		fw.write(" "+p.getPrice());
		fw.write("     ");
		fw.write(p.getDescription());
		fw.flush();
		}
		catch(IOException e)
		{
		
		}
		// logic to store product details into file
	}
}
