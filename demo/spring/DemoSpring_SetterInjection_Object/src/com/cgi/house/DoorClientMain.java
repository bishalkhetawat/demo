package com.cgi.house;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

public class DoorClientMain {

	public static void main(String args[])
	{
		Resource res = 
			new ClassPathResource("doorproject.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Door door1=(Door)factory.getBean("doorbean");

		System.out.println(" Hello Door");
		door1.pressDoorBell();
		
		
	}
	
	
	
	
	
}
