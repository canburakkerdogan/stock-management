package io.github.ydhekim.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {

	static final String JDBC_DRIVER = "org.h2.Driver";
	static final String DB_URL = "jdbc:h2:~/test";

	static final String USER = "sa";
	static final String PASS = "";

	static Connection connection = null;
	static Statement statement = null;
	
	public void connectToDatabase() {
		try {
			Class.forName(JDBC_DRIVER);
			connection = DriverManager.getConnection(DB_URL, USER, PASS);
			statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}
}
