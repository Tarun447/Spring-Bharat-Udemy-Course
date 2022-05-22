package com.spring.springJdbc.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.springJdbc.employee.dao.rowmapper.EmployeeRowmapper;
import com.spring.springJdbc.employee.entity.Employee;

import lombok.Data;


@Data
@Component("empimpl")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/*
	 * For Insert Data Into DataBase
	 */
	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";

		@SuppressWarnings("deprecation")
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstname(), employee.getLastname());
		return result;
	}

	/*
	 * For Update Data Into DataBase
	 */
	@Override
	public int update(Employee employee) {

		String sql = "update  employee set firstname=?,lastname=? where id=?";

		int result = jdbcTemplate.update(sql, employee.getFirstname(), employee.getLastname(), employee.getId());

		return result;
	}

	/*
	 * For Delete Data Into DataBase
	 */
	@Override
	public int delete(int id) {
		String sql = "delete from employee where id=?";

		int result = jdbcTemplate.update(sql, id);
		return result;
	}

	/*
	 * For get Single Record from DataBase
	 */
	@Override
	public Employee singleEmplyeeData(int id) {
		String sql = "select * from employee where id=?";
		EmployeeRowmapper rowMapper = new EmployeeRowmapper();
		Employee emp = jdbcTemplate.queryForObject(sql, rowMapper, id);
		return emp;
	}

	/*
	 * For Get Multiple Data From DataBases
	 */
	@Override
	public List<Employee> EmployeeRecord() {
		String sql = "select * from employee";
		EmployeeRowmapper rowMapper = new EmployeeRowmapper();
		List<Employee> result = jdbcTemplate.query(sql, rowMapper);
		return result;
	}

}
