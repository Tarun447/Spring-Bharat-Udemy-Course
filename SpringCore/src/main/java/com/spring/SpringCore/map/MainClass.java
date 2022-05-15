package com.spring.SpringCore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		
	 ApplicationContext  context  = new ClassPathXmlApplicationContext("com/spring/SpringCore/map/mapConfig.xml");
	 
	 Customer customer = (Customer) context.getBean("customer");
	 
	 System.out.println(customer.getId());
	 System.out.println(customer.toString());
	 // TO Know which type of set 
	 System.out.println(customer.getProducts().getClass());
	}

}
