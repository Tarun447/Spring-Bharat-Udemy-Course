package com.spring.SpringCore2.StereoTypeAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Instructor {
	
	@Value("21")
	private int id;
	
	@Value("Tarun")
	private String name;
	
	@Autowired
	private Profile profile;

}
