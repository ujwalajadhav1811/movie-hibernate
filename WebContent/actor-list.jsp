
<%@ include file="header.jsp" %>
<body>

<div class="container">
	<%@ include file="menu.jsp" %>
	
	<div class="row">	
	     <div class="container">
	     <form action="ActorList" method="get">
	         <h3 class="text-center">List of Actors</h3>
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
	                     <th>Address</th>
	                    
	                     <th>Actions</th>
	                     
	   		
	                 
	             </thead>
	             <tbody>
	              
	                 
	                 <c:forEach var="actor" items="${actorList}">
	
	                     <tr>
	                         <td>
	                             <c:out value="${actor.id}" />
	                         </td>
	                         <td>
	                             <c:out value="${actor.name}" />
	                         </td>
	                         <td>
	                             <c:out value="${actor.address}" />
	                         </td>
	                         
	                        
	                        <td>
			                     <a href="EditServlet?id=${actor.id}">edit</a>
			                     <a href="DeleteServlet?id=${actor.id}">Delete</a>
	                     	</td>
	   			
	                         
	                     </tr>
	                 </c:forEach>
	                 
	             </tbody>
	
	         </table>
	         </form>
	     </div>
	 </div>

</div>

            
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>

</html>