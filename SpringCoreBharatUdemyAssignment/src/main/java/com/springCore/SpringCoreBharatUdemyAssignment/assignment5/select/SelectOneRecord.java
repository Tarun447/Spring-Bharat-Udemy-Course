package com.springCore.SpringCoreBharatUdemyAssignment.assignment5.select;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.SpringCoreBharatUdemyAssignment.assignment5.dao.PassengerDAOImpl;
import com.springCore.SpringCoreBharatUdemyAssignment.assignment5.enitity.Passenger;

public class SelectOneRecord {

	
	PassengerDAOImpl dao;
	
	public static void main(String[] args) {
             Scanner s = new Scanner(System.in);
             
             
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/SpringCoreBharatUdemyAssignment/assignment5/Config.xml");
		 
		PassengerDAOImpl dao = context.getBean("passengerDAOImpl",PassengerDAOImpl.class);
		
		System.out.println("Enter Passenger Id for select");
		int id = s.nextInt();
		Passenger pass = dao.selectById(id);
		
		System.out.println("No of Record Inserted : "+pass);
		
		
	}

}
