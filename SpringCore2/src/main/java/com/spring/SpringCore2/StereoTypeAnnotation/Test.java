package com.spring.SpringCore2.StereoTypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/SpringCore2/StereoTypeAnnotation/Config.xml");
		
		Instructor ins = context.getBean("instructor", Instructor.class);
		
		System.out.println(ins.toString());
	}

}
