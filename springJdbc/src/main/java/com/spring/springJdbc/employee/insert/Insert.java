package com.spring.springJdbc.employee.insert;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springJdbc.employee.dao.EmployeeDAOImpl;
import com.spring.springJdbc.employee.entity.Employee;

public class Insert {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springJdbc/employee/insert/Config.xml");
		
		EmployeeDAOImpl dao = context.getBean("empimpl",EmployeeDAOImpl.class);
		Employee emp = new Employee();
		
		System.out.println("Enter  employee id : ");
		int id = Integer.parseInt(s.nextLine());
		emp.setId(id);
		
		System.out.println("Enter  employee's First Name : ");
		String fname = s.nextLine();
		emp.setFirstname(fname);
		
		System.out.println("Enter  employee's Last Name : ");
		String lname = s.nextLine();
		emp.setLastname(lname);
		
		int result = dao.create(emp);
		
		System.out.println("Total number of record have been saved : "+result );
          
		
		
	}

}
