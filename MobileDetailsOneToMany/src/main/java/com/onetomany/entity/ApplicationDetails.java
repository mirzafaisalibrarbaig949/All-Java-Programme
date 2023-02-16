package com.onetomany.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.onetomany.constant.EntityConstatnt;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = EntityConstatnt.ApplicationDetails)
public class ApplicationDetails implements Serializable {
	@Id
	@GenericGenerator(name = "auto",strategy = "increment") //used to generate id automatically and increment
	@GeneratedValue(generator = "auto") //used to generate id automatically
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	
	private String name;
	
	private String version;
	
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
