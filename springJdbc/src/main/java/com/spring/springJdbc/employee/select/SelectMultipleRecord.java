package com.spring.springJdbc.employee.select;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springJdbc.employee.dao.EmployeeDAOImpl;
import com.spring.springJdbc.employee.entity.Employee;

public class SelectMultipleRecord {
	
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springJdbc/employee/select/Config.xml");
		
		EmployeeDAOImpl dao = context.getBean("empimpl",EmployeeDAOImpl.class);
		
		System.out.println("All The Records Are : ");
		
		List<Employee> employee = dao.EmployeeRecord();
	
		
		for (Employee emp : employee) {
			System.out.println(emp);
			
		}
          
		
		
	}

}
