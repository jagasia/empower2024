package com.empower.ecom.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

	private Connection getConn() throws SQLException
	{
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	}
	
	@Override
	public int create(Product product) throws SQLException {
		//INSERT
		Connection con = getConn();
		PreparedStatement st = con.prepareStatement("INSERT INTO Product VALUES(?,?,?,?)");
		st.setInt(1, product.getId());
		st.setString(2, product.getName());
		st.setString(3, product.getDescription());
		st.setDouble(4, product.getPrice());
		
		int no=st.executeUpdate();
		
		con.close();
		return no;
	}
	@Override
	public List<Product> read() throws SQLException {
		//SELECT
		Connection con = getConn();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM Product");
		List<Product> products=new ArrayList<>();
		while(rs.next())
		{
			Product product=new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
			products.add(product);
		}
		con.close();
		return products;
	}
	@Override
	public Product read(Integer id) throws SQLException {
		//SELECT
		Connection con = getConn();
		PreparedStatement st = con.prepareStatement("SELECT * FROM Product WHERE id=?");
		st.setInt(1, id);
		
		ResultSet rs = st.executeQuery();
		Product product=null;
		if(rs.next())
		{
			product=new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
		}
		con.close();
		return product;
	}
	@Override
	public int update(Product product) throws SQLException {
		//UPDATE
		Connection con = getConn();
		PreparedStatement st = con.prepareStatement("UPDATE Product SET name=?, description=?, price=? WHERE id=?");
		st.setString(1, product.getName());
		st.setString(2, product.getDescription());
		st.setDouble(3, product.getPrice());
		st.setInt(4, product.getId());
		
		int no=st.executeUpdate();
		
		con.close();
		return no;
	}
	@Override
	public int delete(Integer id) throws SQLException {
		//DELETE
		Connection con = getConn();
		PreparedStatement st = con.prepareStatement("DELETE FROM Product WHERE id=?");
		st.setInt(1, id);
		
		int no=st.executeUpdate();
		
		con.close();
		return no;

	}
	
}
