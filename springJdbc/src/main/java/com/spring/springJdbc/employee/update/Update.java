package com.spring.springJdbc.employee.update;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springJdbc.employee.dao.EmployeeDAOImpl;
import com.spring.springJdbc.employee.entity.Employee;

public class Update {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springJdbc/employee/update/Config.xml");
		
		EmployeeDAOImpl dao = context.getBean("empimpl",EmployeeDAOImpl.class);
		Employee emp = new Employee();
		
		System.out.println("Enter Employee id for update ");
		int id = Integer.parseInt(s.nextLine());
		emp.setId(id);
		
		System.out.println("Enter Updated First name : ");
		String fname = s.nextLine();
		emp.setFirstname(fname);
		
		System.out.println("Enter Updated Last Name");
		String lname = s.nextLine();
		emp.setLastname(lname);
		
		
		
		int result = dao.update(emp);
		
		System.out.println("total record has been update : "+result);
          
		
		
	}

}
