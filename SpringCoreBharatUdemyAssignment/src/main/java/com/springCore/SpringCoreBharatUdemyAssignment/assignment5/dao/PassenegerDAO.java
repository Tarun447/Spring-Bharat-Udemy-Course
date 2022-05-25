package com.springCore.SpringCoreBharatUdemyAssignment.assignment5.dao;

import java.util.List;

import com.springCore.SpringCoreBharatUdemyAssignment.assignment5.enitity.Passenger;

public interface PassenegerDAO {
	
	int create(Passenger passenger);
	
	int update(Passenger passenger ,int id);
	
	int delete (int id);
	
	Passenger selectById(int id);
	
	List<Passenger> select();
	
	

}
