package com.mybank.mts.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getMySqlconnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/mybank_transact?verifyServerCertificate=false&useSSL=true";
		String user = "root";
		String password = "root";
		
		return DriverManager.getConnection(url, user, password);

	}
}
