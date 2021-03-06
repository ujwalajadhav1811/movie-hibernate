package com.techdenovo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techdenovo.DAO.MovieDao;
import com.techdenovo.DAO.MovieDaoImpl;
import com.techdenovo.model.Movie;


@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		MovieDao mdDao=new MovieDaoImpl();
		List<Movie> movies = mdDao.getAllMovies();
		System.out.println(movies);
		if (!movies.isEmpty()) {
			request.setAttribute("listMovie", movies);
			RequestDispatcher dispatcher = request.getRequestDispatcher("list-movie.jsp");
			dispatcher.forward(request, response);
		}else {
			response.sendRedirect("error.jsp");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
