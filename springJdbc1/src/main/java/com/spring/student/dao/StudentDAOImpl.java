package com.spring.student.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.student.enity.Student;

@Component("stuimpl")
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	/*
	 * insert Student data into Data Base
	 */
	@Override
	public int insert(Student student) {
		
		String sql = "insert into student(name,email,state) values(?,?,?)";
		int result = jdbcTemplate.update(sql,student.getName(),student.getEmail(),student.getState());
		return result;
	}


	/*
	 * Update Student Data from data base
	 */
	@Override
	public int update(Student student,int id) {
		String sql = "update student set name=?,email=?,state=? where id=?";
		int result = jdbcTemplate.update(sql,student.getName(),student.getEmail(),student.getState(),id);		
		return result;
	}
	
	/*
	 * Delete Record from Student Database
	 */
	
	@Override
	public int delete(int id) {
		String sql = "delete from student where id=?";
		int result = jdbcTemplate.update(sql,id);
		return result;
	}


	/*
	 * select record by id from student database
	 */
	@Override
	public Student slectById(int id) {
		StudentRowMapper rowMapper = new StudentRowMapper();
		String sql = "select * from student where id=?";
		
		return jdbcTemplate.queryForObject(sql, rowMapper,id);
	}
	
	/*
	 * get All Data From Data Base
	 */
	@Override
	public List<Student> getAllStudent() {
		StudentRowMapper rowMapper = new StudentRowMapper();
		String sql = "select * from student";
		return jdbcTemplate.query(sql, rowMapper);
	}
	
	
	
	
	

}
