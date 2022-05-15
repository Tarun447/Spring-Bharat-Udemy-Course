package com.spring.SpringCore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		
	 ApplicationContext  context  = new ClassPathXmlApplicationContext("com/spring/SpringCore/list/listConfig.xml");
	 
	 HospitalPojo hospital = (HospitalPojo) context.getBean("hospital");
	 
	 System.out.println(hospital.getName());
	 System.out.println(hospital.getDepartments());
	 // TO Know which type of list 
	 System.out.println(hospital.getDepartments().getClass());
	}

}
