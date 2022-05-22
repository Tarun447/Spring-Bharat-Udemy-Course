package com.spring.SpringCore1.autowired.javaConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		
	 AnnotationConfigApplicationContext  context  = new AnnotationConfigApplicationContext(SpringJavaConfigClass.class);
	 
	 Employee employee = context.getBean("getEmployee",Employee.class);
	 
	 System.out.println(employee.toString());
	
	}

}
