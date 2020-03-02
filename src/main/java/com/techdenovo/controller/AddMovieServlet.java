package com.techdenovo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techdenovo.DAO.MovieDao;
import com.techdenovo.DAO.MovieDaoImpl;
import com.techdenovo.model.Movie;

@WebServlet("/AddMovie")
public class AddMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddMovieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		String status = request.getParameter("status");
		
		if(!(name.isEmpty()) || !(description.isEmpty()) || !(status.isEmpty())) {
			Movie movie= new Movie();
			movie.setName(name);
			movie.setDescription(description);
			movie.setStatus(status);
			MovieDao mdao = new MovieDaoImpl() ;
			  
			int r=mdao.addMovie(movie); 
			if(r!=0) {
				response.sendRedirect("success.jsp");
			}
			
	}

	}
}
