<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
    <body>
    <%@ page import="java.util.ArrayList" %>
    
    <%@ page import ="com.nagarro.training.spring_assignment.data.Tshirt"%>
    <%
    ArrayList<Tshirt> b=(ArrayList<Tshirt>) request.getAttribute("t");
    %> 
   <div class="col-3 m-5 p-5" ></div>
	<div>
    	<table class="table table-striped col-3" >
		  <thead>
		    <tr class="table-primary">
		      <th scope="col">S.no</th>
		      <th scope="col">Product ID</th>
		      <th scope="col">Name</th>
		      <th scope="col">Color</th>
		      <th scope="col">Gender</th>
		      <th scope="col">Size</th>
		      <th scope="col">Price</th>
		      <th scope="col">Rating</th>
		      <th scope="col">Availability</th>
		    </tr>
		  </thead>
		  <tbody>
		    <% for(Tshirt t:b){
		    	%><tr>
		    		<td scope="col"><%=t.getId()%></td>
		    		<td scope="col"><%=t.getProductID()%></td>
		    		<td scope="col"><%=t.getName()%></td>
		    		<td scope="col"><%=t.getColour()%></td>
		    		<td scope="col"><%=t.getGender()%></td>
		    		<td scope="col"><%=t.getSize()%></td>
		    		<td scope="col"><%=t.getPrice()%></td>
		    		<td scope="col"><%=t.getRating()%></td>
		    		<td scope="col"><%=t.getAvailability()%></td>
		    	</tr>
		    	<%
		    } %>
		  </tbody>
		</table>
    </div>
    
    
    </body>
    
    
</html>
