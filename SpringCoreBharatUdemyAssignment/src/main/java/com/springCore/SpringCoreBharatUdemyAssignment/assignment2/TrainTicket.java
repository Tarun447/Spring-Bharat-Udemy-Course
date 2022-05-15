package com.springCore.SpringCoreBharatUdemyAssignment.assignment2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TrainTicket {
	
	@PostConstruct
	public void intialization()
	{
		System.out.println("Inside Intialization Method");
	}
	
	@PreDestroy
	public void cleenUp()
	{
		System.out.println("inside Cleanup Method");
	}

}
