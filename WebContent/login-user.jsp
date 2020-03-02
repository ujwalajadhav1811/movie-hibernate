
  
 <%@ include file="header.jsp" %>
  
<body>

<div class="container">
<form action="LoginServlet" method="post">
	<%@ include file="menu.jsp" %>
	
	<div class="row">	
	     <div class="container">
	     
		  <div class="form-group-row">
		    <label for="exampleInputname">Username</label>
		    <div class="col-sm-4">
		    <input type="text" name="name" class="form-control" id="exampleInputname">
		  </div>
		  </div>
		  
		  <div class="form-group-row">
		    <label for="exampleInputstatus">Password</label>
		    <div class="col-sm-4">
		    <input type="text" name="description" class="form-control" id="exampleInputstatus">
		  </div>
		  </div>
	</br>
  <button type="submit" class="btn btn-primary">Login</button>
  </div>
  </div>
</form>
</div>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
                
   

    </body>

</html>