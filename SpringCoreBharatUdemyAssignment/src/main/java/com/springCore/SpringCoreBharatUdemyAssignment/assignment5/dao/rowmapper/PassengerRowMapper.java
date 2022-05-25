package com.springCore.SpringCoreBharatUdemyAssignment.assignment5.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.springCore.SpringCoreBharatUdemyAssignment.assignment5.enitity.Passenger;

public class PassengerRowMapper implements RowMapper<Passenger> {

	
	
	
	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
		Passenger passenger = new Passenger();
		passenger.setFirstname(rs.getString(2));
		passenger.setLastname(rs.getString(3));
		
		return passenger;
	}

}
