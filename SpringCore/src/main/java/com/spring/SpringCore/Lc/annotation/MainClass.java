package com.spring.SpringCore.Lc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		
	 ApplicationContext  context  = new ClassPathXmlApplicationContext("com/spring/SpringCore/lc/annotation/Config.xml");
	 
	 Patient pat = (Patient) context.getBean("pat");
	 
	 System.out.println(pat.toString());
	 
	
	
	}

}
