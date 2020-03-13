package com.techdenovo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techdenovo.DAO.ActorDao;
import com.techdenovo.DAO.ActorDaoImpl;
import com.techdenovo.model.Actor;


@WebServlet("/AddActor")
public class AddActorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddActorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		
		if (!(name.isEmpty()) || !(address.isEmpty())) 
		{
			Actor actor=new Actor();
			actor.setName(name);
			actor.setAddress(address);
			ActorDao actorDao=new ActorDaoImpl();
			
			int r=actorDao.addActor(actor);
			if (r!=0)
			{
				response.sendRedirect("success.jsp");
			}
			}
	}

}
