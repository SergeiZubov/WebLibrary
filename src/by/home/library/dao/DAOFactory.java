package by.home.library.dao;

import by.home.library.dao.impl.SQLBookDAO;
import by.home.library.dao.impl.SQLUserDAO;

public class DAOFactory {

	private static final DAOFactory factory = new DAOFactory();

	private final BookDAO bookDAO = new SQLBookDAO();
	private final UserDAO userDAO = new SQLUserDAO();

	private DAOFactory() {
	}

	public static DAOFactory getInstance() {
		return factory;
	}

	public BookDAO getBookDAO() {
		return bookDAO;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

}
