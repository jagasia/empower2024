package com.empower.demo.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String category;
	@Lob
	private String picture;
	private Date mfd;
	
	public Product() {
		
	}

	public Product(Integer id, String name, String category, String picture, Date mfd) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.picture = picture;
		this.mfd = mfd;
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

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Date getMfd() {
		return mfd;
	}

	public void setMfd(Date mfd) {
		this.mfd = mfd;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", picture=" + picture.length() + ", mfd="
				+ mfd + "]";
	}
	
	
}
