package by.home.library.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private String URL = "jdbc:mysql://localhost:3306/library";
	private String username = "root";
	private String password = "andreich_1";
	Connection	getConnection;
	
	
	public DBConnector() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		getConnection = DriverManager.getConnection(URL,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
