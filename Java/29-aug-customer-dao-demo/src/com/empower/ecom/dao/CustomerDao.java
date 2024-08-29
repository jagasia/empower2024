package com.empower.ecom.dao;

import java.sql.SQLException;
import java.util.List;

import com.empower.ecom.entity.Customer;

public interface CustomerDao {

	int create(Customer customer) throws SQLException;

	List<Customer> read() throws SQLException;

	Customer read(Integer id) throws SQLException;

	int update(Customer customer) throws SQLException;

	int delete(Integer id) throws SQLException;

}