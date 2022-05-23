package com.spring.student.select;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.student.dao.StudentDAOImpl;
import com.spring.student.enity.Student;

public class SelectByIdStudentData {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Student stu;
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Config.xml");
		
		StudentDAOImpl dao=context.getBean("stuimpl",StudentDAOImpl.class);
		
		System.out.println("Enter Student id for select");
		int id = Integer.parseInt(s.nextLine());
		
		// get record from student
		stu = dao.slectById(id);

		System.out.println("Record : "+stu);
	}

}
