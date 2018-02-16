package by.home.library.controller.command.impl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.home.library.controller.command.Command;
import by.home.library.entity.User;
import by.home.library.service.ServiceFactory;
import by.home.library.service.UserService;
import by.home.library.service.exception.ServiceException;

public class LoginationCommand implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		
		
		ServiceFactory factory = ServiceFactory.getInstance();
		UserService userService = factory.getUserService();
		
		User user = null;
		String goToPage;
		try {
			user = userService.logination(login, password);
			
			if(user != null) {
				request.setAttribute("myuser", user);;
				goToPage= "/WEB-INF/jsp/main.jsp";
			}else {
				goToPage= "error.jsp";
				request.setAttribute("errorMessage", "no such user");
			}
		} catch (ServiceException e) {
			// logging
			e.printStackTrace();//stub
			request.setAttribute("errorMessage", "smth wrong...");
			goToPage = "error.jsp";
		}		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(goToPage);
		dispatcher.forward(request, response);
		
	}
}
	


