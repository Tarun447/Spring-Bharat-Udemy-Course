package com.spring.SpringCore.list;

import java.util.List;

import lombok.Data;

@Data
public class HospitalPojo {
	
	public String name;
	public List<String> departments;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getDepartments() {
		return departments;
	}
	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}
	
	@Override
	public String toString() {
		return "HospitalPojo [name=" + name + ", departments=" + departments + "]";
	}
	

}
