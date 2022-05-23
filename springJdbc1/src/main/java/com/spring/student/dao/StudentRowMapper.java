package com.spring.student.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.student.enity.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student stu = new Student();
		stu.setName(rs.getString(2));
		stu.setEmail(rs.getString(3));
		stu.setState(rs.getString(4));
		return stu;
	}

}
