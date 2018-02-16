package by.home.library.dao;

import by.home.library.dao.exception.DAOException;
import by.home.library.entity.User;

public interface UserDAO {

	boolean registration(User user) throws DAOException;
	User logination(String login, String password) throws DAOException;
}
