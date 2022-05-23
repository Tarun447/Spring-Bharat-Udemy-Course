package com.spring.student.dao;

import java.util.List;

import com.spring.student.enity.Student;

public interface StudentDAO {
	
	
	// insert student data
	int insert(Student student);
	
	// update Student data
	int update(Student student,int id);
	
	
	int delete(int id);
	
	// select by id 
    Student slectById(int id);
    
    // get All Student 
    List<Student> getAllStudent();
	

}
