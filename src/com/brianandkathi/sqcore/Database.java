package com.brianandkathi.sqcore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Connectivity using JDBC to SQLite3 with a little help from
 * https://www.edureka.co/community/4028/how-to-import-a-jar-file-in-eclipse
 * 
 * @author brian
 *
 */
public class Database {

	public void connect(String dbfile) {
		Connection conn = null;
		try {
			String url = "jdbc:sqlite:" + dbfile;
			conn = DriverManager.getConnection(url);
			System.out.println("Connection to SQLite has been established: " + dbfile);
		} catch(SQLException s) {
			System.out.println(s.getMessage());
		} finally {
			try {
				if (conn !=null) {
					conn.close();
				}
			} catch(SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}
