package by.home.library.service;

import by.home.library.entity.Book;
import by.home.library.service.exception.ServiceException;

public interface BookService {
	boolean addBook(Book book) throws ServiceException;
	Book findBook(String title) throws ServiceException;
	boolean deleteBook(int idBook) throws ServiceException;
}
