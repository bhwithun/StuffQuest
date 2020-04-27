package com.brianandkathi.sqcore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Connectivity using JDBC to SQLite3 with a little help from
 * https://www.edureka.co/community/4028/how-to-import-a-jar-file-in-eclipse
 * 
 * @see https://www.tutorialspoint.com/jdbc/statement-object-example.htm
 * 
 * @author brian
 */
public class Database {
	protected Connection connection;
	protected Statement statement;
	
	public void connect(String dbfile) {
		try {
			String url = "jdbc:sqlite:" + dbfile;
			connection = DriverManager.getConnection(url);
			statement = connection.createStatement();
			System.out.println("Database: connected " + dbfile);
		} catch(SQLException s) {
			System.out.println(s.getMessage());
		}
	}
	
	public void disconnect() {
		try {
			statement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public ResultSet getResultSet(String select_statement) {
		ResultSet resultSet = null;
		//System.out.println("getResultSet: "+select_statement);
		try {
			resultSet = statement.executeQuery(select_statement);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultSet;
	}
}
