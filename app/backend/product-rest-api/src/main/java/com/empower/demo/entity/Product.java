package com.empower.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String category;
	private Double price;
	private Date mfd;
	private String picture;
	
	public Product() {}

	public Product(Integer id, String name, String category, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public Product(Integer id, String name, String category, Double price, Date mfd, String picture) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.mfd=mfd;
		this.picture=picture;
	}

	public void setMfd(Date mfd)
	{	
		this.mfd=mfd;
	}

	public void setPicture(String picture)
	{
		this.picture=picture;
	}
	
	public Date getMfd()
	{
		return this.mfd;
	}

	public String getPicture()
	{
		return this.picture;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	
}
