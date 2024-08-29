package com.empower.ecom.dao;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.empower.ecom.entity.Customer;

public class App {

	public static void main(String[] args) throws ParseException, SQLException {
		Customer customer=new Customer();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		customer.setId(1);
		customer.setName("Raja");
		customer.setDob(sdf.parse("01-06-2002"));
		customer.setAddress("Bengaluru");
		customer.setPhone("9898989797");
		
		CustomerDao cdao=new CustomerDaoImpl();
		
		int no=cdao.create(customer);
		System.out.println(no);
	}

}
