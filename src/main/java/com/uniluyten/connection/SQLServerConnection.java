package com.uniluyten.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class SQLServerConnection {

	static {
		new SQLServerDriver();
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:sqlserver://;serverName=localhost;databaseName=CodigoRupestre;integratedSecurity=false;encrypt=false;trustServerCertificate=true",
				"SA","CodigoRupestre11SpaceNative");
		
	}
}
