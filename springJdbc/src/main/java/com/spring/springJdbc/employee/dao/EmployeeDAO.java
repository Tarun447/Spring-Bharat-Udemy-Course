package com.spring.springJdbc.employee.dao;

import java.util.List;

import com.spring.springJdbc.employee.entity.Employee;

public interface EmployeeDAO {
	
	// insert data into db
	int create(Employee employee);
	
	
	// update data from db
	int update(Employee employee);
	
	// delete data from db
	int delete(int id);
	
	//select single data from db;
	Employee singleEmplyeeData(int id);
	
	//List Of Employee Record
	List<Employee> EmployeeRecord();
	
	
	

}
 