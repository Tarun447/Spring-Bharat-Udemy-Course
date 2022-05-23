package com.spring.student.update;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.student.dao.StudentDAOImpl;
import com.spring.student.enity.Student;

public class UpdateStudentData {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Student stu = new Student();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Config.xml");
		
		StudentDAOImpl dao=context.getBean("stuimpl",StudentDAOImpl.class);
		
		System.out.println("Enter Student id for update");
		int id = Integer.parseInt(s.nextLine());
		
		// get record from user
		System.out.println("Enter Student Name");
		String name = s.nextLine();
		stu.setName(name);
		
		System.out.println("Enter Student Email");
		String email = s.nextLine();
		stu.setEmail(email);
		
		System.out.println("Enter Student state name");
		String state = s.nextLine();
		stu.setState(state);
		
		int result = dao.update(stu,id);
		
		System.out.println("No of Record Updated : "+result);
		
		

	}

}
