package com.empower.ecom.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.empower.ecom.entity.Customer;

public class CustomerDaoImpl implements CustomerDao {
	
	private Connection getConn() throws SQLException
	{
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	}
	
	@Override
	public int create(Customer customer) throws SQLException {
		Connection con = getConn();
		PreparedStatement st = con.prepareStatement("INSERT INTO Jag_Customer VALUES(?,?,?,?,?)");
		st.setInt(1, customer.getId());
		st.setString(2, customer.getName());
		st.setDate(3, new java.sql.Date(customer.getDob().getTime()));
		st.setString(4, customer.getAddress());
		st.setString(5, customer.getPhone());
		int no=st.executeUpdate();
		con.close();
		return no;
	}
	@Override
	public List<Customer> read() throws SQLException {
		Connection con = getConn();
		ResultSet rs = con.createStatement()
				.executeQuery("SELECT * FROM Jag_Customer");
		List<Customer> customers=new ArrayList<>();
		while(rs.next())
		{
			Customer customer=new Customer(rs.getInt(1), rs.getString(2), new Date(rs.getDate(3).getTime()), rs.getString(4), rs.getString(5));
			customers.add(customer);
		}
		return customers;
	}
	@Override
	public Customer read(Integer id) throws SQLException {
		Connection con = getConn();
		PreparedStatement st = con.prepareStatement("SELECT * FROM Jag_Customer WHERE id=?");
		st.setInt(1, id);
		ResultSet rs = st.executeQuery();
		Customer customer=null;
		if(rs.next())
		{
			customer = new Customer(rs.getInt(1), rs.getString(2), new Date(rs.getDate(3).getTime()), rs.getString(4), rs.getString(5));
		}
		return customer;
	}
	@Override
	public int update(Customer customer) throws SQLException {
		Connection con = getConn();
		PreparedStatement st = con.prepareStatement("UPDATE Jag_Customer SET name=?, dob=?, address=?, phone=? WHERE id=?");
		
		st.setString(1, customer.getName());
		st.setDate(2, new java.sql.Date(customer.getDob().getTime()));
		st.setString(3, customer.getAddress());
		st.setString(4, customer.getPhone());
		st.setInt(5, customer.getId());
		int no=st.executeUpdate();
		con.close();
		return no;
	}
	@Override
	public int delete(Integer id) throws SQLException {
		Connection con = getConn();
		PreparedStatement st = con.prepareStatement("DELETE FROM Jag_Customer WHERE id=?");
		st.setInt(1, id);
		int no=st.executeUpdate();
		con.close();
		return no;
	}
	
}
