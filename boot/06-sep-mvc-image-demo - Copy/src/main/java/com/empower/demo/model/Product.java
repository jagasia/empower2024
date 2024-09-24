package com.empower.demo.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String description;
	private Double price;
	private Date expiryDate;
	@Lob
	private byte[] picture;
	
	public Product() {}

	public Product(Integer id, String name, String description, Double price, Date expiryDate, byte[] picture) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.expiryDate = expiryDate;
		this.picture = picture;
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

	public Date getExpiryDate() {
		return expiryDate;
	}
	

	public String getExpiryDate1() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		return sdf.format(expiryDate);
	}
	

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public byte[] getPicture() {
		return picture;
	}
	
	public String getPicture1() {
		//to convert byte[] into Base64 encoded string
		//we need to add a dependency in pom.xml
		return Base64.encodeBase64String(picture);
	}
	
	

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", expiryDate=" + expiryDate + ", picture=" + picture.length + "]";
	}
	
}
