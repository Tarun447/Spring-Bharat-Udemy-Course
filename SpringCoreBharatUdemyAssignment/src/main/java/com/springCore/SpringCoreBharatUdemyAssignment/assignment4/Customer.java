package com.springCore.SpringCoreBharatUdemyAssignment.assignment4;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class Customer {
	private String name;
	
	@Autowired
	private Reservation reservation;  

}
