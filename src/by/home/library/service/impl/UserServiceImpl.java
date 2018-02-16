package by.home.library.service.impl;

import by.home.library.dao.DAOFactory;
import by.home.library.dao.UserDAO;
import by.home.library.dao.exception.DAOException;
import by.home.library.entity.User;
import by.home.library.service.UserService;
import by.home.library.service.exception.ServiceException;

public class UserServiceImpl implements UserService {

	@Override
	public boolean registration(User user) {
		boolean bool = false;
		if(user==null||user.getLogin().isEmpty()) {
		return false;
		}else {
			DAOFactory df = DAOFactory.getInstance();
			UserDAO userDAO = df.getUserDAO();
			try {
				bool = userDAO.registration(user);
			} catch (DAOException e) {
				e.printStackTrace();
			}
			return bool; 
			
		}
	
		
		
	}

	@Override
	public User logination(String login, String password) throws ServiceException {
		// validation
		
		User user = null;
		
		DAOFactory factory = DAOFactory.getInstance();
		UserDAO userDAO = factory.getUserDAO();
		
		try {
			user = userDAO.logination(login, password);
		} catch (DAOException e) {
			throw new ServiceException("my message", e);
		}
		
		return user;
	}

}
