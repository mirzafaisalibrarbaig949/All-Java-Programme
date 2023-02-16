package com.author.entity;

import org.hibernate.annotations.GenericGenerator;

import com.author.constant.EntityConstant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = EntityConstant.BookDetails)
public class Book {
	@Id
	@GenericGenerator(name = "auto",strategy = "increment") //used to generate id automatically and increment
	@GeneratedValue(generator = "auto") 
    private Long id;

   
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

    
    
}
