package com.yash.ppmtoolapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 * This JDBCUtil will be used for performing databased related operations like
 * Driver loader, connection handling, and getting PreparedStatement objects
 * @author nolanschoenle
 *
 */
public class JDBCUtil {

		
	// The constants
		private static final String URL = "jdbc:mysql://localhost/ppmtoolappdb";
		private static final String TIMEZONEFIX = "?useTimezone=true&serverTimezone=UTC";
		private static final String USER = "root";
		private static final String PASS = "P@ssword1";
		// The connection
		protected Connection con = null;

		protected PreparedStatement pstmt = null;
		
		/**
		 * This block will execute the Driver setup every time a DBUtil is instantiated.
		 */
		static {
			String driverClassName = "com.mysql.cj.jdbc.Driver";
			try {
				Class c = Class.forName(driverClassName);
			//	log(c);
			//	System.out.println(c);

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		}
		
		/**
		 * This connect operation sets up the connection between the DB and the program.
		 * 
		 * This private method serves as a a helper method to createPreparedStatement.
		 * 
		 * @return con the connection object associated with the DBUtil
		 */
		public Connection connect() {
			try {
				con = DriverManager.getConnection(URL + TIMEZONEFIX, USER, PASS);
				System.out.println(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return con;
		}
		
		/**
		 * This createPreparedStatement creates a prepared SQL statement given by the
		 * input
		 * 
		 * @param sql A string representation of the PreparedStatement
		 * @return the Prepared statement of the string
		 */
		public PreparedStatement createPreparedStatement(String sql) {
			try {
				connect();
				pstmt = con.prepareStatement(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return pstmt;
		}

		/**
		 * This releaseResources() releases the resources held by the database,
		 * namely the connection and the preparedStatement objects
		 */
		public void releaseResources() {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
}
