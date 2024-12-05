package com.bitebuddy.bitebuddy.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
    private static final String url = PropertiesUtil.getProperty("db.url");
    private static final String username = PropertiesUtil.getProperty("db.username");
    private static final String password = PropertiesUtil.getProperty("db.password");
    private static final String driverClassName = PropertiesUtil.getProperty("db.driverClassName");
    public static Connection connection;


    static {
        try {
            Class.forName(driverClassName);
            System.out.println("Successfully loaded driver class name : " + driverClassName);
        } catch (ClassNotFoundException exception) {
            System.err.println("Failed to load DB Driver Class : " + driverClassName + " : " + exception.getMessage());
        }
    }

    public static Connection establishConnection() throws SQLException {
        try {
            connection = DriverManager.getConnection(url, username, password );
            System.out.println("Successfullly connected to databse using url : " + url);
        } catch (SQLException exception) {
            System.err.println("Failed to connect to database using url : " + url + " : " + exception.getMessage());
            throw exception;
        }
        return null;
    }

    public static Connection getConnection() {
        return connection;
    }

}
