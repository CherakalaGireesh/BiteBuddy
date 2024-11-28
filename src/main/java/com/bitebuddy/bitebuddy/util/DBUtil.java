package com.bitebuddy.bitebuddy.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
    private static String url;
    private static String username;
    private static String password;
    private static String driverClassName;

    static{
        try(InputStream inputStream = DBUtil.class.getClassLoader().getResourceAsStream("database.properties")){
            Properties properties = new Properties();
            properties.load(inputStream);

            //load properties
            url = properties.getProperty("db.url");
            username = properties.getProperty("db.username");
            password = properties.getProperty("db.password");
            driverClassName = properties.getProperty("db.driverClass");

            //load driver class
            Class.forName(driverClassName);
        }
        catch(Exception exception){
            exception.printStackTrace();
            throw new ExceptionInInitializerError("Database properties could not be loaded");
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}
