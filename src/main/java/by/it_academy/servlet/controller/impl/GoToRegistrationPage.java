package by.it_academy.servlet.controller.impl;

import java.io.IOException;

import by.it_academy.servlet.controller.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GoToRegistrationPage implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.getRequestDispatcher("WEB-INF/jsp/registration.jsp").forward(request, response);
	}

}
