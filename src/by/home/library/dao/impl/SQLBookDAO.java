package by.home.library.dao.impl;

import by.home.library.dao.BookDAO;
import by.home.library.dao.exception.DAOException;
import by.home.library.entity.Book;

public class SQLBookDAO implements BookDAO {

	@Override
	public boolean addBook(Book book) throws DAOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book findBook(String title) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBook(int idBook) throws DAOException {
		// TODO Auto-generated method stub
		return false;
	}

}
