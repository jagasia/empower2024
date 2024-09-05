package com.empower.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
//@Table(name = "PRD")
public class Product {
	@Id			//the following field is the primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
//	@Column(name = "product_name")
	private String name;
	private String description;
	private Double price;
	
	public Product() {}

	public Product(Integer id, String name, String description, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}
	
	
}
