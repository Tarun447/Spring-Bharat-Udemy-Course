package com.spring.SpringCore2.StereoTypeAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Profile {

	@Value("Software Developer")
	private String title;
	
	@Value("Capgemini India")
	private String Company;
}
