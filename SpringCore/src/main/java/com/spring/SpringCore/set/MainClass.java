package com.spring.SpringCore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		
	 ApplicationContext  context  = new ClassPathXmlApplicationContext("com/spring/SpringCore/set/setConfig.xml");
	 
	 CarPojo car = (CarPojo) context.getBean("car");
	 
	 System.out.println(car.getName());
	 System.out.println(car.getModels());
	 // TO Know which type of set 
	 System.out.println(car.getModels().getClass());
	}

}
