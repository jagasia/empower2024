package com.empower.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.empower.demo.entity.Product;

@Component("pdao")
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public int create(Product product) {
		return jt.update("INSERT INTO Product VALUES (?,?,?,?)", product.getId(), product.getName(), product.getDescription(), product.getPrice());
	}
	@Override
	public List<Product> read() {
		return jt.query("SELECT * FROM Product", new ProductRowMapper());
	}
	@Override
	public Product read(Integer id) {
		return jt.queryForObject("SELECT * FROM Product WHERE id=?", new ProductRowMapper(), id);
	}
	@Override
	public int update(Product product) {
		return jt.update("UPDATE Product SET name=?, description=?, price=? WHERE id=?", product.getName(), product.getDescription(), product.getPrice(), product.getId());
	}
	@Override
	public int delete(Integer id) {
		return jt.update("DELETE FROM Product WHERE id=?", id);
	}
	
}
