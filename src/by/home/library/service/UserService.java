package by.home.library.service;

import by.home.library.entity.User;
import by.home.library.service.exception.ServiceException;

public interface UserService {
	
	boolean registration(User user) throws ServiceException;
	User logination(String login, String password) throws ServiceException;

}
