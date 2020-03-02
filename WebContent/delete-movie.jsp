<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>


<body>

<div class="container">
<form action="DeleteServlet" method="post">
	<%@ include file="menu.jsp" %>
	
	<div class="row">	
	     <div class="container">
	     
	   
  			<div class="form-group-row">
		    <label for="exampleInputname">Id</label>
		    <div class="col-sm-10">
		    <input type="text" name="id" class="form-control" id="exampleInputname" value="${movie.id}" readonly="readonly">
		  </div>
		  </div>
		  
	
		  <div class="form-group-row">
		    <label for="exampleInputname">Name</label>
		    <div class="col-sm-10">
		    <input type="text" name="name" class="form-control" id="exampleInputname" value="${movie.name}">
		  </div>
		  </div>
		  
		  <div class="form-group-row">
		    <label for="exampleInputstatus">Description</label>
		    <div class="col-sm-10">
		    <input type="text" name="description" class="form-control" id="exampleInputstatus" value="${movie.description}">
		  </div>
		  </div>
		  <div class="form-group-row">
		    <label for="exampleInputdescription">Status</label>
		    <div class="col-sm-10">
		    <input type="text" name="status" class="form-control" id="exampleInputdescription" value="${movie.status}">
		  </div>
		  </div>
		  </br>
		  <div>
		  <button type="submit" class="btn btn-primary">Delete</button>
		  </div>
		  </div>
		  </div>
		  
</form>
	  </div>  
	</div>        
</div>


<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
                
   

    </body>

</html>