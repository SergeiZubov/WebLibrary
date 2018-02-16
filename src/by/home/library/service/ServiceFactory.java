package by.home.library.service;

import by.home.library.service.impl.BookServiceImpl;
import by.home.library.service.impl.UserServiceImpl;

public class ServiceFactory {

	private static final ServiceFactory factory = new ServiceFactory();

	private final BookService bookService = new BookServiceImpl();
	private final UserService userService = new UserServiceImpl();

	private ServiceFactory() {
	}

	public static ServiceFactory getInstance() {
		return factory;
	}

	public BookService getBookService() {
		return bookService;
	}

	public UserService getUserService() {
		return userService;
	}
}
