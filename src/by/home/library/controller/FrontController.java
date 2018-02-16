package by.home.library.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.home.library.controller.command.Command;


public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private final CommandProvider provider = new CommandProvider();
    
	public FrontController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = request.getParameter("command");
		Command commandQbject = provider.getCommand(command);
		commandQbject.execute(request, response);
		
		doGet(request, response);
	}

}
