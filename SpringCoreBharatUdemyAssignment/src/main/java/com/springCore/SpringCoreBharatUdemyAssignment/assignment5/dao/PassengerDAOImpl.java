package com.springCore.SpringCoreBharatUdemyAssignment.assignment5.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springCore.SpringCoreBharatUdemyAssignment.assignment5.dao.rowmapper.PassengerRowMapper;
import com.springCore.SpringCoreBharatUdemyAssignment.assignment5.enitity.Passenger;


@Component
public class PassengerDAOImpl implements PassenegerDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	Passenger passenger;

	@Override
	public int create(Passenger passenger) {
		String sql = "insert into passenger (firstname,lastname) values(?,?);";
		int result = jdbcTemplate.update(sql,passenger.getFirstname(),passenger.getLastname());
		return result;
	}

	@Override
	public int update(Passenger passenger, int id) {
		String sql = "update passenger set firstname=?,lastname=? where id=?";
		int result = jdbcTemplate.update(sql,passenger.getFirstname(),passenger.getLastname(),id);
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from passenger where id=?";
		int result = jdbcTemplate.update(sql,id);
		return result;
	}

	@Override
	public Passenger selectById(int id) {
		PassengerRowMapper rowMapper = new PassengerRowMapper();
		String sql = "select * from passenger where id=?";
		passenger = jdbcTemplate.queryForObject(sql, rowMapper, id);
		return passenger;
	}

	@Override
	public List<Passenger> select() {
		PassengerRowMapper rowMapper = new PassengerRowMapper();
		String sql = "select * from passenger";
		List<Passenger> pass = jdbcTemplate.query(sql,rowMapper);
		return pass;
	}

}
