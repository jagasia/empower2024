package com.empower.demo.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.empower.demo.model.Product;
import com.empower.demo.model.ProductDao;
import com.empower.demo.model.ProductDaoImpl;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id=Integer.parseInt(request.getParameter("id"));
		String btn=request.getParameter("btn");
		String name="", description="";
		Double price=0.0;
		if(!btn.equals("Delete"))
		{
			name=request.getParameter("name");
			description=request.getParameter("description");
			price=Double.parseDouble(request.getParameter("price"));

		}
		
		Product product=null;
		ProductDao pdao=null;
		switch(btn)
		{
		case "Add":
			product=new Product(id, name, description, price);
			
			pdao=new ProductDaoImpl();
			try {
				pdao.create(product);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			break;
		case "Update":
			product=new Product(id, name, description, price);
			pdao=new ProductDaoImpl();
			try {
				pdao.update(product);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "Delete":
			pdao=new ProductDaoImpl();
			try {
				int delete = pdao.delete(id);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		
		response.sendRedirect("product.jsp");
	}

}
