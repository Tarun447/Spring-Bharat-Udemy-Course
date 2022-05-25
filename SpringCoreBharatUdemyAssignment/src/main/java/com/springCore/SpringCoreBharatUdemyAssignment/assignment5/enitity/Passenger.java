package com.springCore.SpringCoreBharatUdemyAssignment.assignment5.enitity;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Component
public class Passenger {
   
	
	private String firstname;
	private String lastname;
}
