package com.spring.student.delete;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.student.dao.StudentDAOImpl;
import com.spring.student.enity.Student;

public class DeleteStudentData {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Student stu = new Student();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Config.xml");
		
		StudentDAOImpl dao=context.getBean("stuimpl",StudentDAOImpl.class);
		
		System.out.println("Enter Student id for delete");
		int id = Integer.parseInt(s.nextLine());
		
		int result = dao.delete(id);
		
		System.out.println("No of Record Deleted : "+result);
		
		

	}

}
