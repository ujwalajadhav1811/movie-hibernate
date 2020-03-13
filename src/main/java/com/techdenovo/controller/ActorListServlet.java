package com.techdenovo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techdenovo.DAO.ActorDao;
import com.techdenovo.DAO.ActorDaoImpl;
import com.techdenovo.model.Actor;


@WebServlet("/ActorList")
public class ActorListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ActorListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ActorDao actorDao=new ActorDaoImpl();
		List<Actor> actors=actorDao.getAllActor();
		System.out.println(actors);
		if (!actors.isEmpty()) 
		{
			request.setAttribute("actorList", actors);
			RequestDispatcher dispatcher=request.getRequestDispatcher("actor-list.jsp");
			dispatcher.forward(request, response);
		}
		else {
			response.sendRedirect("error.jsp");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
