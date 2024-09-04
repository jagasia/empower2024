<%@page import="java.util.List"%>
<%@page import="com.empower.demo.model.Product"%>
<%@page import="com.empower.demo.model.ProductDaoImpl"%>
<%@page import="com.empower.demo.model.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>


<%
	if(session.getAttribute("products")==null)
	{
		out.print("You are not authorized to visit this url.");
		return;
	}
%>
<div class="container-fluid p-5 bg-success text-white text-center">
  <h1>Product Page</h1>
  <p>Admin can use this page to manage the Products!</p> 
</div>
  
<div class="container mt-5">
  <div class="row">
    <div class="col-sm-4">

    </div>
    <div class="col-sm-4">
    	<h3> Products </h3>
	<form method="post" action="product">
		Id:<input type="number" name="id" class="form-control" value="${product.id }" />
		Name:<input type="text" name="name" class="form-control" value="${product.name }" />
		Description:<input type="text" name="description" class="form-control" value="${product.description }" />
		Price:<input type="number" name="price" class="form-control" value="${product.price }" />
		<br/>
		<input type="submit" name="btn" value="Add" class="btn btn-success" />&nbsp;
		<input type="submit" name="btn" value="Update" class="btn btn-warning" />&nbsp;
		<input type="submit" name="btn" value="Delete" class="btn btn-danger" />&nbsp;
	</form>
    </div>
    <div class="col-sm-4">

    </div>
  </div>
  <hr/>
  <div class="row">
  <div class="col-sm-2">

    </div>
    <div class="col-sm-8">
		<table class="table table-bordered table-striped table-hover">
			<thead>
			<td>Id</td><td>Name</td><td>Description</td><td>Price</td><td></td>
			</thead>
			<tbody>
				<c:forEach var="p" items="${products }">
				<tr>
					<td>${p.id }</td>
					<td>${p.name }</td>
					<td>${p.description }</td>
					<td>${p.price }</td>
					<td>
					<a href="select?id=${p.id }">Select</a>
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
    </div>
    <div class="col-sm-2">

    </div>
  </div>
</div>
</body>
</html>