package com.empower.ecom.dao;

import java.sql.SQLException;
import java.util.List;

import com.empower.ecom.entity.Product;

public interface ProductDao {

	int create(Product product) throws SQLException;

	List<Product> read() throws SQLException;

	Product read(Integer id) throws SQLException;

	int update(Product product) throws SQLException;

	int delete(Integer id) throws SQLException;

}