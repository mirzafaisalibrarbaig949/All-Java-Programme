package com.product.entity;



import java.util.List;

import org.hibernate.annotations.GenericGenerator;

import com.product.constant.EntityConstant;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = EntityConstant.SupplierDetails)
public class Suppiler {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@GenericGenerator(name = "auto", strategy = "increment") // used to generate id automatically and increment
	@GeneratedValue(generator = "auto")
	private int id;
	
	
	private String city;
	
	
	private String name;
	
	@ManyToMany( cascade = CascadeType.ALL)
	List<Product> products;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
	
}