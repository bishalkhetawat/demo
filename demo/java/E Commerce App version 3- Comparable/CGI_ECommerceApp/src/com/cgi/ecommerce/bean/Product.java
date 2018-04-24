package com.cgi.ecommerce.bean;


public class Product implements Comparable {

	private int id;
	private String name;
	private double price;
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	protected void orderProduct()
	{
		Mobile m=new Mobile();
		m.mobileBrand="Samsung";
		System.out.println("Product is ordered");
	}
	
	@Override
	public int compareTo(Object obj) {
		
		Product p2=(Product)obj;
		if(this.price<p2.price)
			return 1;
		else if(this.price>p2.price)
			return -1;
		else
			return 0;
		
	}
	
	
	
	
	
	
}
