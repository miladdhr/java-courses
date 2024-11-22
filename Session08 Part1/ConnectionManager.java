package ir.freeland.jsonquize.service;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionManager{
	
    private static Connection connection;


    // Private constructor to prevent instantiation
    private ConnectionManager() {
    }

    public static Connection getConnection() throws Exception {
    	connection = DriverManager.getConnection(DatabaseInfo.URL, DatabaseInfo.USER, DatabaseInfo.PASSWORD);	
    	
    	return connection;	
        
    }
}