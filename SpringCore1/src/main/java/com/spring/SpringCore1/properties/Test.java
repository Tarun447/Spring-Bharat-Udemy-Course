package com.spring.SpringCore1.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/SpringCore/properties/Config.xml");
		
		MyDAO dao = context.getBean("myDAO", MyDAO.class);
		
		System.out.println(dao.toString());
	}

}
