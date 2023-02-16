package com.onetomany.entity;

import java.io.Serializable;
import java.util.List;



import org.hibernate.annotations.GenericGenerator;

import com.onetomany.constant.EntityConstatnt;

import jakarta.persistence.*;



@Entity
@Table(name = EntityConstatnt.MobileDetails)
public class MobileDetails implements Serializable {
	@Id
	@GenericGenerator(name = "auto",strategy = "increment") //used to generate id automatically and increment
	@GeneratedValue(generator = "auto") //used to generate id automatically
	


	private int id;
	

	private String brand;
	

	private String color;
	

	private Double price;
	

	private String ramsize;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="mobile_id")
	private List<ApplicationDetails> liappApplicationDetails;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getRamsize() {
		return ramsize;
	}
	public void setRamsize(String ramsize) {
		this.ramsize = ramsize;
	}
	public List<ApplicationDetails> getLiappApplicationDetails() {
		return liappApplicationDetails;
	}
	public void setLiappApplicationDetails(List<ApplicationDetails> liappApplicationDetails) {
		this.liappApplicationDetails = liappApplicationDetails;
	}
	@Override
	public String toString() {
		return "MobileDetails [id=" + id + ", brand=" + brand + ", color=" + color + ", price=" + price + ", ramsize="
				+ ramsize + ", liappApplicationDetails=" + liappApplicationDetails + "]";
	}
	
	

	
}
