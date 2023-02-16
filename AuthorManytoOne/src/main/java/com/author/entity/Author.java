package com.author.entity;

import java.util.*;

import org.hibernate.annotations.GenericGenerator;

import com.author.constant.EntityConstant;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = EntityConstant.AuthorDetails)
public class Author{

@Id
@GenericGenerator(name = "auto",strategy = "increment") 
@GeneratedValue(generator = "auto") 
private Long id;


private String name;


private String email;

@OneToMany(cascade = CascadeType.ALL)

private List<Book> books = new ArrayList<>();

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public List<Book> getBooks() {
	return books;
}

public void setBooks(List<Book> books) {
	this.books = books;
}

@Override
public String toString() {
	return "Author [id=" + id + ", name=" + name + ", email=" + email + ", books=" + books + "]";
}




}