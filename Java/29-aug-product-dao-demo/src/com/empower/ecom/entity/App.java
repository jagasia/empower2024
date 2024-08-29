package com.empower.ecom.entity;

import java.sql.SQLException;
import java.util.List;

public class App {

	public static void main(String[] args) throws SQLException {
		ProductDao pdao=new ProductDaoImpl();
//		Product p=new Product(1, "Pencil", "is used to write", 5.0);
//		int no = pdao.create(p);
//		int no=pdao.update(p);
//		System.out.println(no+" row(s) updated");
		
//		List<Product> products = pdao.read();
//		for(Product p:products)
//			System.out.println(p);
		
		int no=pdao.delete(1);
		System.out.println(no+" row(s) deleted");
	}

}
