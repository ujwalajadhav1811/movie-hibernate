package com.techdenovo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techdenovo.DAO.MovieDao;
import com.techdenovo.DAO.MovieDaoImpl;
import com.techdenovo.model.Movie;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int id=Integer.parseInt(request.getParameter("id"));
		MovieDao mdao=new MovieDaoImpl();
		Movie movie=mdao.findMovieById(id);
		request.setAttribute("movie", movie);
		System.out.println("inside doget "+movie);
		RequestDispatcher dispatcher=request.getRequestDispatcher("delete-movie.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int id=Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		String status = request.getParameter("status");
		Movie movie= new Movie();
		movie.setId(id);
		movie.setName(name);
		movie.setDescription(description);
		movie.setStatus(status);
		MovieDao mdao = new MovieDaoImpl() ;
		mdao.movieDelete(movie);
		response.sendRedirect("success.jsp");
	}

}
