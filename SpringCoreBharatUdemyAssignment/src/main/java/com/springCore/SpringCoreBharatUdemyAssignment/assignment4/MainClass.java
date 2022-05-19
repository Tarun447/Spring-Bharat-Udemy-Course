package com.springCore.SpringCoreBharatUdemyAssignment.assignment4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/SpringCoreBharatUdemyAssignment/assignment4/Config.xml");
		
		Customer customer = context.getBean("customer",Customer.class);
		
		System.out.println(customer.toString());

	}

}
