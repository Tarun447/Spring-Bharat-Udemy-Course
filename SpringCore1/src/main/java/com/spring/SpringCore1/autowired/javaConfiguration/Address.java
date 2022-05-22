package com.spring.SpringCore1.autowired.javaConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Address {
	
   

	@Value("577677")
	public int hno  ;
	
	
	// here we use Spring Expression Languange inside the Value Method
	@Value("#{'CNB'}")
	public String street;
	
	@Value("#{'BDK'}")
	public String city;
}
