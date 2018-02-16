package by.home.library.dao;

import by.home.library.dao.exception.DAOException;
import by.home.library.entity.Book;

public interface BookDAO {
	
	boolean addBook(Book book) throws DAOException;
	
	Book findBook(String title) throws DAOException;
	
	boolean deleteBook(int idBook) throws DAOException;

}
