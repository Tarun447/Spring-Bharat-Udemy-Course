package com.springCore.SpringCoreBharatUdemyAssignment.assignment5.insert;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.SpringCoreBharatUdemyAssignment.assignment5.dao.PassengerDAOImpl;
import com.springCore.SpringCoreBharatUdemyAssignment.assignment5.enitity.Passenger;

public class InsertData {

	
	PassengerDAOImpl dao;
	
	public static void main(String[] args) {
             Scanner s = new Scanner(System.in);
             
             Passenger pass = new Passenger() ;
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/SpringCoreBharatUdemyAssignment/assignment5/Config.xml");
		 
		PassengerDAOImpl dao = context.getBean("passengerDAOImpl",PassengerDAOImpl.class);
		
		System.out.println("Enter Passenger First Name");
		String fname = s.nextLine();
		
		System.out.println("Enter Passenger Last Name");
		String lname = s.nextLine();
		
		pass.setFirstname(fname);
		pass.setLastname(lname);
		int result = dao.create(pass);
		
		System.out.println("No of Record Inserted : "+result);
		
		
	}

}
