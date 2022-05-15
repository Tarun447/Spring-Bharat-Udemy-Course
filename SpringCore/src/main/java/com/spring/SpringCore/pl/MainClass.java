package com.spring.SpringCore.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeePOJO emp = context.getBean("emp", EmployeePOJO.class);

		System.out.println("Employee Id : " + emp.getId());
		System.out.println("Employee Name : " + emp.getName());

		System.out.println("For Second Employee");
		EmployeePOJO emp1 = context.getBean("emp1", EmployeePOJO.class);

		System.out.println("Employee Id : " + emp1.getId());
		System.out.println("Employee Name : " + emp1.getName());
	}

}
