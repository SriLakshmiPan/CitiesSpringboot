package com.zetcode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectDB {

	static String databaseName = null;
	static String url = "jdbc:mysql://lakshmi:3306/lakshmi?verifyServerCertificate=false&serverTimezone=EDT";
	static String username = "root";
	static String password = "Temp123$";

	public static void main(String[] args)
			throws InstantiationException, ClassNotFoundException, SQLException, IllegalAccessException {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		Connection connection = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = connection.prepareStatement("select * from cities;");

		int status = ps.executeUpdate();

		if (status != 0) {
			System.out.println("DB started");
			System.out.println("executed the given query");
		}

	}

}
