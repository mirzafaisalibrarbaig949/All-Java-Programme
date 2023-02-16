package com.spring.jdbc.dao;

import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entity.Student;



public class StudentDaoImp implements StudentDao {
private JdbcTemplate jdbcTemplate;
	@Override
	public int insert(Student student) {
		
			 String query="Insert into student (id,name,city) values (?,?,?)";
			
			
			int result= this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		
		return result;
	}
	
	@Override
	public int update(Student student) {
		String query="Update student set name=? ,city=? where id=?";
		int result= this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return result;
	}
	@Override
	public int delete(int studentId) {
		String query="delete from student where  id=?";
		int result=this.jdbcTemplate.update(query,studentId);
		return result;
	}
	
	public Student getStudent(int studentId) {
		String query="Select * from student where id=?";
			RowMapperImp rowMapper=new RowMapperImp();
		
		Student student= this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		String query="Select * from student ";
//		RowMapperImp rowMapper=new RowMapperImp();
		List<Student> s = this.jdbcTemplate.query(query,new RowMapperImp());
	
		return s;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
