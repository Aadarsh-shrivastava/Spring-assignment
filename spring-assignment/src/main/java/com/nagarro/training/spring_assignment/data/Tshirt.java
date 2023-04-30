package com.nagarro.training.spring_assignment.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tshirt {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int id;
	private String productID;
	private String name;
	private String colour;
	@Column(name = "Gender")
	private String gender;
	private String size;
	private double price;
	private double rating;
	private String availability;

	public Tshirt() {
		
	}


	public Tshirt( String productID, String name, String colour, String gender, String size,
			double price, double rating, String availability) {
//		this.id=id;
		this.productID = productID;
		this.name = name;
		this.colour = colour;
		this.gender = gender;
		this.size = size;
		this.price = price;
		this.rating = rating;
		this.availability = availability;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "Tshirt [id=" + id + ", productID=" + productID + ", name=" + name + ", colour=" + colour
				+ ", gender=" + gender + ", size=" + size + ", price=" + price + ", rating="
				+ rating + ", availability=" + availability + "]";
	}

}