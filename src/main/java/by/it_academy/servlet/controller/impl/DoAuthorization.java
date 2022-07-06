package by.it_academy.servlet.controller.impl;

import java.io.IOException;

import by.it_academy.servlet.controller.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DoAuthorization implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("/WEB-INF/jsp/result_authorization.jsp").forward(request, response);

	}

}
