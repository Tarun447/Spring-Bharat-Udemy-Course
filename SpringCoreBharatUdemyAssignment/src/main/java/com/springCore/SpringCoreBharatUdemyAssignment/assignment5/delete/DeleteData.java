package com.springCore.SpringCoreBharatUdemyAssignment.assignment5.delete;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.SpringCoreBharatUdemyAssignment.assignment5.dao.PassengerDAOImpl;
import com.springCore.SpringCoreBharatUdemyAssignment.assignment5.enitity.Passenger;

public class DeleteData {

	
	PassengerDAOImpl dao;
	
	public static void main(String[] args) {
             Scanner s = new Scanner(System.in);
             
             Passenger pass = new Passenger() ;
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/SpringCoreBharatUdemyAssignment/assignment5/Config.xml");
		 
		PassengerDAOImpl dao = context.getBean("passengerDAOImpl",PassengerDAOImpl.class);
		
		System.out.println("Enter Passenger Id for delete");
		int id = s.nextInt();
		
		
		int result = dao.delete(id);
		
		System.out.println("No of Record Inserted : "+result);
		
		
	}

}
