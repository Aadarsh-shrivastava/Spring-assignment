<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

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
<body class="container-fluid">
	<form class="col-3" action="/spring-assignment/add" method="post">
		  
		  <div class="mb-3">
		    <label for="color" class="form-label">Color</label>
		    <select id="color" class="form-select" name="color">
	        	<option value="Black">Black</option>
	        	<option value="White">White</option>
	        	<option value="Blue">Blue</option>
	        	<option value="Purple">Purple</option>
	        	<option value="Grey">Grey</option>
	        	<option value="Pink">Pink</option>
	           	<option value="Maroon">Maroon</option>
	        	<option value="Yellow">Yellow</option>
	        </select>
		  </div>
		  
		  <div class="mb-3">
		    <label for="size" class="form-label">Size</label>
		    <select id="size" class="form-select" name="size">
	        	<option value="S">Small</option>
	        	<option value="M">Medium</option>
	        	<option value="L">Large</option>
	        	<option value="XL">Extra Large</option>
	        	<option value="xxl">Double XL</option>
	        </select>
		  </div>
		  
		  <div class="mb-3">
	      <label for="gender" class="form-label">Select Gender</label>
	      <select id="gender" class="form-select" name="gender">
	        <option value="M">Male</option>
	        <option value="F">Female</option>
	        <option value="U">Unisex</option>
	      </select>
    	</div>
    	
    	<div class="mb-3">
	      <label for="gender" class="form-label">Select Gender</label>
	      <select id="gender" class="form-select" name="preference">
	        <option value="Price">Price</option>
	        <option value="rating">Rating</option>
	        
	      </select>
    	</div>
		    
		  <button type="submit" class="btn btn-primary">Submit</button>
	</form>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
		crossorigin="anonymous"></script>
</body>
</html>
