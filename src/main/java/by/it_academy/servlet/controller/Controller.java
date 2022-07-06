package by.it_academy.servlet.controller;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String commandStr = "command";

	CommandProvider commandProvider = new CommandProvider();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String commandName = request.getParameter(commandStr);
		Command command = commandProvider.getCommand(commandName);
		command.execute(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String commandName = request.getParameter(commandStr);
		Command command = commandProvider.getCommand(commandName);
		command.execute(request, response); 

	}

}
