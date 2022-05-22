package com.spring.springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springJdbc/Config.xml");
		
		 JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
		 
		 // create a query for execute;
		 
		 String sql = "insert into employee values(?,?,?)";
		 
		 @SuppressWarnings("deprecation")
		int result = jdbcTemplate.update(sql, new Integer(416254),"Tarun Kumar","Nanda");
		 
		 System.out.println("Number of Record Inserted into the data base : "+result);

	}

}
