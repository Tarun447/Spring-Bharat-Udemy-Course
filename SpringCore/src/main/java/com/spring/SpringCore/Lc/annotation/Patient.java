package com.spring.SpringCore.Lc.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.Data;

@Data
public class Patient {
	private int id;
	
	@PostConstruct
	public void hi()
	{
		System.out.println("Inside Hi method");
	}
	
	@PreDestroy
	public void bye()
	{
		System.out.println("Inside Bye Method");
	}

}
