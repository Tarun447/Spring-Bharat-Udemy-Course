package com.spring.SpringCore.map;

import java.util.Map;

import lombok.Data;

@Data
public class Customer {
	public int id;
	public Map<Integer,String> products;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Map<Integer, String> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", products=" + products + "]";
	}
	
	
	
}
