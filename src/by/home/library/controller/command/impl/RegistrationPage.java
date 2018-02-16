package by.home.library.controller.command.impl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.home.library.controller.command.Command;

public class RegistrationPage implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String registration = request.getParameter("command");
		String goToPage;
		if(registration.equals("registrationPage")) {
			goToPage = "WEB-INF/jsp/registration.jsp";
		}else goToPage = "WEB-INF/index.jsp";
		
		RequestDispatcher disp = request.getRequestDispatcher(goToPage);
		disp.forward(request, response);
	}

}
