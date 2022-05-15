package com.springCore.SpringCoreBharatUdemyAssignment.assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		
	 ApplicationContext  context  = new ClassPathXmlApplicationContext("com/springCore/SpringCoreBharatUdemyAssignment/assignment2/Config.xml");
	 
	 TrainTicket pat = (TrainTicket) context.getBean("pat");
	 

	 
	
	
	}

}
