package com.streamAPI;

import java.util.Objects;

//public class Laptop implements Comparable<Laptop> {
public class Laptop{
	private Integer id;
	private String brand;
	private String model;
	private Integer ram;

public Laptop(Integer id, String brand, String model, Integer ram) {
	super();
	this.id = id;
	this.brand = brand;
	this.model = model;
	this.ram = ram;
}

@Override
public String toString() {
	return "Laptop [id=" + id + ", brand=" + brand + ", model=" + model + ", ram=" + ram + "]";
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public Integer getRam() {
	return ram;
}

public void setRam(Integer ram) {
	this.ram = ram;
}

@Override
public int hashCode() {
	return Objects.hash(brand, id, model, ram);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Laptop other = (Laptop) obj;
	return Objects.equals(brand, other.brand) && Objects.equals(id, other.id) && Objects.equals(model, other.model)
			&& Objects.equals(ram, other.ram);
}


//@Override
//public int compareTo(Laptop o) {
//	// TODO Auto-generated method stub
//	return this.compareTo(o);
}




