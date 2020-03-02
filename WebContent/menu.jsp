
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Movie Management</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Movie
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
       
          <a class="dropdown-item" href="<%=request.getContextPath()%>/ListServlet">movie list</a>
          <a class="dropdown-item" href="<%=request.getContextPath()%>/movie?action=insert">Add New</a>
          
        </div>  
      </li>
      
       <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Actor
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
       
          <a class="dropdown-item" href="<%=request.getContextPath()%>/actor?action=actorlist">Actor list</a>
          <a class="dropdown-item" href="<%=request.getContextPath()%>/actor?action=insert-actor">Add New</a>
        </div>  
      </li>
     </ul>
    
  </div>
</nav>
