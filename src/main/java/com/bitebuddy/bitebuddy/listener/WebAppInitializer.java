package com.bitebuddy.bitebuddy.listener;

import com.bitebuddy.bitebuddy.util.DBUtil;
import com.bitebuddy.bitebuddy.util.PropertiesUtil;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

import java.io.IOException;
import java.sql.SQLException;

@WebListener
public class WebAppInitializer implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            PropertiesUtil.loadProperties();
            System.out.println("Properties loaded sucessfully");
            DBUtil.establishConnection();
            System.out.println("Database connection established successfully");
        } catch (IOException exception) {
            System.err.println("Error occurred while loading properties : " + exception.getMessage());
        } catch (SQLException exception) {
            System.err.println("Error occurred during database connection initialization : " + exception.getMessage());
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
