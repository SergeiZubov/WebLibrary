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

public class RegistrationCommand implements Command{
	
	private String login;
	private String password;
	private String name;
	private String surname;
	private String mail;
	private String phone;
	private User user = new User();
	private String goToPage;
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		login = request.getParameter("login");
		password = request.getParameter("password");
		name = request.getParameter("name");
		surname = request.getParameter("surname");
		mail = request.getParameter("mail");
		phone = request.getParameter("phone");
		
		ServiceFactory sf = ServiceFactory.getInstance();
		UserService userService = sf.getUserService();
		
		user.setLogin(login);
		user.setPassword(password);
		user.setName(name);
		user.setSurname(surname);
		user.setMail(mail);
		user.setPhone(phone);
		boolean bool = false;
		try {
			bool = userService.registration(user);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		
		if (bool == true) {
			goToPage = "WEB-INF/jsp/logination.jsp";
		}
		else goToPage = "WEB-INF/jsp/registration.jsp";
		
		RequestDispatcher disp = request.getRequestDispatcher(goToPage);
		disp.forward(request, response);
		
		
		
	}

}
