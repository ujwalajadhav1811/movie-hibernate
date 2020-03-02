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
import com.techdenovo.DAO.UserDao;
import com.techdenovo.DAO.UserDaoImpl;
import com.techdenovo.model.Movie;
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
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String username = request.getParameter("username");
		String password = request.getParameter("password");		
		if((!username.isEmpty())&&(!password.isEmpty())) {
			UserDao udaoDao=new UserDaoImpl();
			User user =udaoDao.findUserByUsername(username);
				if (user!=null)
				{
						if (password.equals(user.getPassword()))
						{
							RequestDispatcher dispatcher=request.getRequestDispatcher("dashboard.jsp");
							dispatcher.forward(request, response);
						}
						else {
								request.setAttribute("errormsg", "invalid username and password");
								RequestDispatcher dispatcher=request.getRequestDispatcher("login-user.jsp");
								dispatcher.forward(request, response);
							}
				}	
				else 
				{
					request.setAttribute("errormsg", "Username doesnot exist");
					RequestDispatcher dispatcher=request.getRequestDispatcher("login-user.jsp");
					dispatcher.forward(request, response);
				}
			
		}
		else 
		{
			request.setAttribute("errormsg", "Username/password cannt be empty");
			RequestDispatcher dispatcher=request.getRequestDispatcher("login-user.jsp");
			dispatcher.forward(request, response);
		}
	}
	}

