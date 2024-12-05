package com.bitebuddy.bitebuddy.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
    private static Properties properties = new Properties();

    public static void loadProperties() throws IOException {
        String files[]  = {
                "D:\\PROJECTS\\BiteBuddy\\src\\main\\resources\\database.properties",
                "D:\\PROJECTS\\BiteBuddy\\src\\main\\resources\\introPageQueries.properties"
        };

        for (String filename: files) {
            loadPropertyFile(filename);
        }
    }

    private static void loadPropertyFile(String filename) throws IOException {
        try (InputStream inputStream = new FileInputStream(filename)) {
            properties.load(inputStream);
            System.out.println("Successfully loaded" + filename +" properties file");
        } catch (IOException exception) {
            System.out.println("Error loading properties from" + filename + "file : " + exception.getMessage());
            throw exception;
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
