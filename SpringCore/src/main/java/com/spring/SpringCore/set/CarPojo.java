package com.spring.SpringCore.set;

import java.util.Set;


public class CarPojo {

	public String name;
	public Set<String> models;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getModels() {
		return models;
	}
	public void setModels(Set<String> models) {
		this.models = models;
	}
	
	@Override
	public String toString() {
		return "CarPojo [name=" + name + ", models=" + models + "]";
	}
	
	
	
}
