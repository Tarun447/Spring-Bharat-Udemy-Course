package com.spring.SpringCore1.autowired.annotation.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		
	 ApplicationContext  context  = new ClassPathXmlApplicationContext("com/spring/SpringCore1/autowired/annotation/qualifier/Config.xml");
	 
	 Employee employee = context.getBean("employee",Employee.class);
	 
	 System.out.println(employee.toString());
	
	}

}
