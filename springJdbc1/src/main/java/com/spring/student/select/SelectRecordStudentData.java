package com.spring.student.select;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.student.dao.StudentDAOImpl;
import com.spring.student.enity.Student;

public class SelectRecordStudentData {
	
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Student stu;
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Config.xml");
		
		StudentDAOImpl dao=context.getBean("stuimpl",StudentDAOImpl.class);
		
		System.out.println(" All The Record From Student Data Base");
		
		List<Student> student = dao.getAllStudent();
		
		for(Student st:student)
		{
			System.out.println(st.toString());
		}

		
	}

}
