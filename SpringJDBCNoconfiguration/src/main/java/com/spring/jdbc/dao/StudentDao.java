package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entity.Student;

public interface StudentDao {
	public abstract int insert(Student student);
	public abstract int update(Student student);
	public abstract int delete(int studentId);
	public Student getStudent(int studentId);
	public List<Student> getAllStudents();
	

}
