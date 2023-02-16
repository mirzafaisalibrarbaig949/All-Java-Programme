package com.jspiders.restaurant.entity;

import java.io.Serializable;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;

import com.jspider.restaurant.constant.EntityConstant;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Cacheable
@Entity
@Table(name =EntityConstant.RESTAURANT_INFO)
public class RestaurantInfo implements Serializable {
	
	@Id
	@GenericGenerator(name="auto" , strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "id")
	private int id; 
	@Column(name = "name")
	private String name;
	@Column(name = "type")
	private String type;
	@Column(name = "address")
	private String address;
	@Column(name = "menu")
	private String menu;
	@Column(name="rating")
	private String rating;
	@Column(name = "pinCode")
	private String pinCode;
	
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public RestaurantInfo(int id, String name, String type, String address, String menu, String rating,
			String pinCode) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.address = address;
		this.menu = menu;
		this.rating = rating;
		this.pinCode = pinCode;
	}
	public RestaurantInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RestaurantInfo [id=" + id + ", name=" + name + ", type=" + type + ", address=" + address + ", menu="
				+ menu + ", rating=" + rating + ", pinCode=" + pinCode + "]";
	}
	
	
	

}
