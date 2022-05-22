package com.spring.springJdbc.employee.delete;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springJdbc.employee.dao.EmployeeDAOImpl;
import com.spring.springJdbc.employee.entity.Employee;

public class Delete {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springJdbc/employee/delete/Config.xml");
		
		EmployeeDAOImpl dao = context.getBean("empimpl",EmployeeDAOImpl.class);
		Employee emp = new Employee();
		
		System.out.println("Enter Employee id for delete ");
		int id = Integer.parseInt(s.nextLine());
		
		
		int result = dao.delete(id);
		
		System.out.println("no of deleted Records  : "+result);
          
		
		
	}

}
