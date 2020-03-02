
<%@ include file="header.jsp" %>
<body>

<div class="container">
	<%@ include file="menu.jsp" %>
	
	<div class="row">	
	     <div class="container">
	     <form action="/ListServlet" method="get">
	         <h3 class="text-center">List of Movies</h3>
	         <hr>
	         <div class="container text-left">
	
	             <a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add New Movie</a>
	               </div>
	               <br>
	             
	         <table class="table table-bordered">
	             <thead>
	                 <tr>
	                     <th>ID</th>
	                     <th>Name</th>
	                     <th>Description</th>
	                     <th>Status</th>
	                     <th>Actions</th>
	                     
	   		
	                 
	             </thead>
	             <tbody>
	              
	                 
	                 <c:forEach var="movie" items="${listMovie}">
	
	                     <tr>
	                         <td>
	                             <c:out value="${movie.id}" />
	                         </td>
	                         <td>
	                             <c:out value="${movie.name}" />
	                         </td>
	                         <td>
	                             <c:out value="${movie.description}" />
	                         </td>
	                         <td>
	                             <c:out value="${movie.status}" />
	                             
	                        </td>
	                        
	                        <td>
			                     <a href="EditServlet?id=${movie.id}">edit</a>
			                     <a href="DeleteServlet?id=${movie.id}">Delete</a>
	                     	</td>
	   			
	                         
	                     </tr>
	                 </c:forEach>
	                 
	             </tbody>
	
	         </table>
	     </div>
	 </div>

</div>

            
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>

</html>