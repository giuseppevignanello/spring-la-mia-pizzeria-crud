package org.java.app.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Pizza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(unique = true, length = 150, nullable = false)
	private String name;
	
	@Lob
	@Column(columnDefinition="text")
	private String description;
	
	@Lob
	@Column(columnDefinition="text")
	private String photo;
	
	@Column(nullable = false)
	private double price;
	
	public Pizza() {
		
	}
	
	public Pizza(String name, String description, String photo, double price) {
		setName(name); 
		setDescription(description); 
		setPhoto(photo); 
		setPrice(price);
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
