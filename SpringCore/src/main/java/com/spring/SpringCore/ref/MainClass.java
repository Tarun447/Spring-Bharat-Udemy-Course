package com.spring.SpringCore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		
	 ApplicationContext  context  = new ClassPathXmlApplicationContext("com/spring/SpringCore/ref/refConfig.xml");
	 
	 Student student = (Student) context.getBean("student");
	 
	 System.out.println(student.toString());
	 
	}

}
