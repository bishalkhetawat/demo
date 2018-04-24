package com.cgi.ecommerce.bean;


public class Mobile  extends Product
{
	
	public String mobileBrand;
	private String configuration;
	
	public String getMobileBrand() {
		return mobileBrand;
	}
	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}
	public String getConfiguration() {
		return configuration;
	}
	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}
	
	
	 void repairMobile()
	{
		 orderProduct();
		System.out.println("Mobile repairing");
	}
	

}
