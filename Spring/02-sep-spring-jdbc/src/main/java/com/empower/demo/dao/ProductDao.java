package com.empower.demo.dao;

import java.util.List;

import com.empower.demo.entity.Product;

public interface ProductDao {

	int create(Product product);

	List<Product> read();

	Product read(Integer id);

	int update(Product product);

	int delete(Integer id);

}