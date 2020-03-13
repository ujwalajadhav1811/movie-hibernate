package com.techdenovo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techdenovo.DAO.UserDao;
import com.techdenovo.DAO.UserDaoImpl;
import com.techdenovo.model.User;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if ((!username.isEmpty()) && (!password.isEmpty())) 
			{
				UserDao userDao=new UserDaoImpl();
				User user=userDao.findUserByUsername(username);
				if (user!=null)
					{
						if (password.equals(user.getPassword()))
								{
									RequestDispatcher dispatcher=request.getRequestDispatcher("dashboard.jsp");
									dispatcher.forward(request, response);
							
								}
						else {
								request.setAttribute("errormessage", "invalid username and password");
								
							}
					}
				
				else
					{
						request.setAttribute("errormsg", "enter usename");
						RequestDispatcher dispatcher=request.getRequestDispatcher("login-user.jsp");
						dispatcher.forward(request, response);
					}
			}
		
		else 
			{
				request.setAttribute("error","usernamenotexist");
				RequestDispatcher dispatcher=request.getRequestDispatcher("login-user.jsp");
				dispatcher.forward(request, response);
				
			}
		
			
	}

}
