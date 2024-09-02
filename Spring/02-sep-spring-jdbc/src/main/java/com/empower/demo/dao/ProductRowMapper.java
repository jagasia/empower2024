package com.empower.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.empower.demo.entity.Product;

public class ProductRowMapper implements RowMapper<Product>
{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
	}

}
