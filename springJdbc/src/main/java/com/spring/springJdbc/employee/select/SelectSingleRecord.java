package com.spring.springJdbc.employee.select;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springJdbc.employee.dao.EmployeeDAOImpl;
import com.spring.springJdbc.employee.entity.Employee;

public class SelectSingleRecord {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springJdbc/employee/select/Config.xml");
		
		EmployeeDAOImpl dao = context.getBean("empimpl",EmployeeDAOImpl.class);
		
		System.out.println("Enter Employee id for for Select ");
		int id = Integer.parseInt(s.nextLine());
		
		Employee employee = dao.singleEmplyeeData(id);
		
		System.out.println("Employee Record : "+employee);
          
		
		
	}

}
