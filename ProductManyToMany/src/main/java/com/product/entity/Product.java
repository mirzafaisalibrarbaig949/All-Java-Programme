package com.product.entity;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.GenericGenerator;

import com.product.constant.EntityConstant;

import jakarta.persistence.*;

@Entity
@Table(name = EntityConstant.ProductDetails)
public class Product {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment") // used to generate id automatically and increment
	@GeneratedValue(generator = "auto")

	private int Id;

	private String name;

	private String type;
	
	@ManyToMany
	@JoinColumn
	List<Suppiler> suppllier;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Suppiler> getSuppllier() {
		return suppllier;
	}

	public void setSuppllier(List<Suppiler> suppllier) {
		this.suppllier = suppllier;
	}
	
	
	
	

}
