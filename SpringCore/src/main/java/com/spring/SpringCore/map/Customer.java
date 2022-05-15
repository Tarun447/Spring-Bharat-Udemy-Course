package com.spring.SpringCore.map;

import java.util.Map;

import lombok.Data;

@Data
public class Customer {
	public int id;
	public Map<Integer,String> products;
	
	
}
