package com.springCore.SpringCoreBharatUdemyAssignment.assignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springCore/SpringCoreBharatUdemyAssignment/assignment3/Config.xml"); 

		MyDAO dao = applicationContext.getBean("myDAO", MyDAO.class);
		
		System.out.println(dao.toString());
	}

}
