package by.home.library.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.corba.se.impl.orb.ParserTable.TestLegacyORBSocketFactory;

import by.home.library.dao.UserDAO;
import by.home.library.dao.exception.DAOException;
import by.home.library.entity.User;

public class SQLUserDAO implements UserDAO{
	
	private Statement statement;
	private int resultSetUpdate;
	private ResultSet resultSet;
	private String SQL;
	private String SQL1;
	private String name;
	private String surname;
	private String login;
	String testLogin = "testLogin";
	DBConnector connector = new DBConnector();
	@Override
	public boolean registration(User user) throws DAOException {
		SQL1 = "SELECT `users`.`users_id`,\r\n" + 
				"`users`.`name`,\r\n" + 
				"`users`.`surname`,\r\n" + 
				"`users`.`login`,\r\n" + 
				"`users`.`password`,\r\n" + 
				"`users`.`mail`,\r\n" + 
				"`users`.`phone`\r\n" + 
				"FROM `library`.`users`\r\n" + 
				"WHERE `login`= '"+user.getLogin()+"';";
		try {
			statement = connector.getConnection.createStatement();
			resultSet = statement.executeQuery(SQL1);
			while(resultSet.next()) {
				if(resultSet.getString("login")!=null) {
				testLogin = resultSet.getString("login");
			}
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}if(testLogin.equals(user.getLogin())) {
				return true;
			}else {
		SQL = "INSERT INTO `library`.`users` (`name`,`surname`,`login`,`password`,`mail`,`phone`)\r\n" + 
				"VALUES\r\n" + 
				"('"+user.getName()+"',\r\n" + 
				"'"+user.getSurname()+"',\r\n" + 
				"'"+user.getLogin()+"',\r\n" + 
				"'"+user.getPassword().hashCode()+"',\r\n" + 
				"'"+user.getMail()+"',\r\n" + 
				"'"+user.getPhone()+"');";
		
		
		try {
			
			resultSetUpdate = statement.executeUpdate(SQL);
			resultSet = statement.executeQuery(SQL1);
			while (resultSet.next()) {
				login = resultSet.getString("login");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
			
		}
		if(login.equals(user.getLogin())) {
			return true;
		}else return false;
		
	}
	}

	@Override
	public User logination(String login, String password) throws DAOException {
		
		User user = new User();
		user.setLogin(login);
		user.setPassword(password);
		
		SQL = "SELECT `users`.`users_id`,\r\n" + 
				"    `users`.`name`,\r\n" + 
				"    `users`.`surname`,\r\n" + 
				"    `users`.`login`,\r\n" + 
				"    `users`.`password`,\r\n" + 
				"    `users`.`mail`,\r\n" + 
				"    `users`.`phone`\r\n" + 
				"FROM `library`.`users`\r\n" + 
				"WHERE `login`= '"+login+"' AND `password` = '"+password.hashCode()+"';";//

		try {
			
			statement = connector.getConnection.createStatement();
			
			resultSet = statement.executeQuery(SQL);
			
			while(resultSet.next()) {
				
			name = resultSet.getString("name");
			surname = resultSet.getString("surname");
			
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		user.setName(name);
		
		user.setSurname(surname);
		
		return user;
	}

}
