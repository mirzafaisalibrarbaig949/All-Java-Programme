package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entity.Student;

@Transactional
public class StudentDao {
	private HibernateTemplate hibernateTemplate;

	// INSERTING
	public int insert(Student student) {
		Integer save = (Integer) this.hibernateTemplate.save(student);
		return save;

	}

	// ---------Retrieve a single data ---------//

	public Student getStudent(int studentId) {

		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;

	}

	// ---------Retrieve a Multiple data ---------//
	public List<Student> getAllStudents() {

		List<Student> s = this.hibernateTemplate.loadAll(Student.class);

		return s;
	}

	// --------- Delete data ---------//
	public void delete(int studentId) {

		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);

	}

	// ---------Update data ---------//
	public void update(Student student) {

		this.hibernateTemplate.update(student);

	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	

}
