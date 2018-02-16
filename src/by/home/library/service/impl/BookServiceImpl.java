package by.home.library.service.impl;

import by.home.library.dao.BookDAO;
import by.home.library.dao.DAOFactory;
import by.home.library.dao.exception.DAOException;
import by.home.library.entity.Book;
import by.home.library.service.BookService;
import by.home.library.service.exception.ServiceException;

public class BookServiceImpl implements BookService {

	@Override
	public boolean addBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book findBook(String title) throws ServiceException{
		// VALIDATION
		
		DAOFactory factory = DAOFactory.getInstance();
		BookDAO bookDAO = factory.getBookDAO();
		Book book;
		
		try {
			book = bookDAO.findBook(title);
		} catch (DAOException e) {
			throw new ServiceException("message", e);
		}

		return book;
	}

	@Override
	public boolean deleteBook(int idBook) {
		// TODO Auto-generated method stub
		return false;
	}

}
