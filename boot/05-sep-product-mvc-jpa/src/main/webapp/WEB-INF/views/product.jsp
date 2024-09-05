<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container-fluid p-5 bg-secondary text-white text-center">
  <h1>My MVC Project</h1>
  <p>created by Empower 2024 best batch!</p> 
</div>
  
<div class="container mt-5">
  <div class="row">
    <div class="col-sm-4">
      
    </div>
    <div class="col-sm-4">
      <h3>Product Page</h3>
      <form method="post" action="/dml">
      	Id: <input type="number" class="form-control" name="id" />
      	Name: <input type="text" class="form-control" name="name" />
      	Description: <input type="text" class="form-control" name="description" />
      	Price: <input type="number" class="form-control" name="price" />
      	<br/>
 		<input type="submit" class="btn btn-success" name="add" value="Add" />
 		<input type="submit" class="btn btn-warning" name="update" value="Update" />
 		<input type="submit" class="btn btn-danger" name="delete" value="Delete" />      	
      </form>
    </div>
    <div class="col-sm-4">
      
    </div>
  </div>
  <div class="row">
  	<div class="col-sm-2">
   	</div>
  	<div class="col-sm-8">
		<table class="table table-bordered table-striped table-hover">
			<thead>
				<td>Id</td><td>Name</td><td>Description</td><td>Price</td>
			</thead>
			<tbody>
				<c:forEach var="p" items="${products }">
					<tr>
						<td>${p.id }</td>
						<td>${p.name }</td>
						<td>${p.description }</td>
						<td>${p.price }</td>
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