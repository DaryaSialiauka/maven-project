package by.it_academy.servlet.controller;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String separator = " ";
	
	private static final String entrance = "entrance"; 
	private static final String registration = "registration";
	private static final String login = "login";
	private static final String password = "password";
	private static final String name = "name";
	private static final String datebirth = "datebirth";
	private static final String phone = "phone";
	private static final String email = "email";
	private static final String gender = "gender";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(entrance.equals(request.getParameter("command"))) {
			response.getWriter().println(login + separator + request.getParameter(login));
			response.getWriter().println(password + separator + request.getParameter(password));
		} else if(registration.equals(request.getParameter("command"))) {
			response.getWriter().println(login + separator + request.getParameter(login));
			response.getWriter().println(password + separator + request.getParameter(password));
			response.getWriter().println(name + separator + request.getParameter(name));
			response.getWriter().println(datebirth + separator + request.getParameter(datebirth));
			response.getWriter().println(phone + separator + request.getParameter(phone));
			response.getWriter().println(email + separator + request.getParameter(email));
			response.getWriter().println(gender + separator + request.getParameter(gender));
		}
	}

}
