package com.jspider.dto;

import java.io.Serializable;

public class ResturantDto implements Serializable {
	private int id;
	private String rating;
	private String address;
	private String pinCode;
	private String name;
	
	
	public String getPinCode() {
		return pinCode;
	}


	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getRating() {
		return rating;
	}


	public void setRating(String rating) {
		this.rating = rating;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public  void findRestaurantById(int id,String rating,String address) {
		
		
	}
	public  void UpdateById(int id,String piCode,String address) {
		
		
	}
	public  void deleteById(String name) {
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
