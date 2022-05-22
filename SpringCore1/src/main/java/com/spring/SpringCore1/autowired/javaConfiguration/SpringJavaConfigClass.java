package com.spring.SpringCore1.autowired.javaConfiguration;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.SpringCore1.autowired.javaConfiguration")
public class SpringJavaConfigClass {
	
	@Bean
	public Employee getEmployee()
	{
		
		return new Employee();
	}
	
	
	@Bean
	public Address getAddress()
	{
		
		return new Address();
	}
	
	@Bean
	public Scanner getScanner()
	{
		return new Scanner(System.in);
	}
	

}
