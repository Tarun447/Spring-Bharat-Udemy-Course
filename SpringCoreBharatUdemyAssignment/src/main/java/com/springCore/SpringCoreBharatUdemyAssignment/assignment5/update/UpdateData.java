package com.springCore.SpringCoreBharatUdemyAssignment.assignment5.update;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.SpringCoreBharatUdemyAssignment.assignment5.dao.PassengerDAOImpl;
import com.springCore.SpringCoreBharatUdemyAssignment.assignment5.enitity.Passenger;

public class UpdateData {

	
	PassengerDAOImpl dao;
	
	public static void main(String[] args) {
             Scanner s = new Scanner(System.in);
             
             Passenger pass = new Passenger() ;
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/SpringCoreBharatUdemyAssignment/assignment5/Config.xml");
		 
		PassengerDAOImpl dao = context.getBean("passengerDAOImpl",PassengerDAOImpl.class);
		
		System.out.println("Enter Passeneger Id for Update : ");
		int id = Integer.parseInt(s.nextLine());
		
		System.out.println("Enter Passenger First Name");
		String fname = s.nextLine();
		
		System.out.println("Enter Passenger Last Name");
		String lname = s.nextLine();
		
		pass.setFirstname(fname);
		pass.setLastname(lname);
		int result = dao.update(pass,id);
		
		System.out.println("No of Record Updated : "+result);
		
		
	}

}
