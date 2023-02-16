package com.streamAPI.Movies;

public class Movie {
	Integer id;
	String name;
	String villanName;
	String category;
	Double rating;
//	DESIGN A FUNCTION TO FILTER MOVIES with rating  GRETER THAN 7 .....................
//DESIGN A FUNCTION TO FILTER MOVIES with catogory
	
	public Movie(int id, String name, String villanName, String category, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.villanName = villanName;
		this.category = category;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", villanName=" + villanName + ", category=" + category
				+ ", rating=" + rating + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVillanName() {
		return villanName;
	}
	public void setVillanName(String villanName) {
		this.villanName = villanName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	

}
