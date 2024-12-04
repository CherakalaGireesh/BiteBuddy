package com.bitebuddy.bitebuddy.model.dao;

import com.bitebuddy.bitebuddy.model.beans.introBeans.*;
import com.bitebuddy.bitebuddy.util.DBUtil;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class IntroDaoImpl implements IntroDao{
    private static DBUtil dbUtil = new DBUtil();
    private static Connection connection;
    private static Properties properties;

    static {
        try {
            connection = dbUtil.getConnection();
        }catch(Exception exception){
            exception.printStackTrace();
            throw new ExceptionInInitializerError("Database Connection is not Established");
        }

        try{
            InputStream inputStream = IntroDaoImpl.class.getClassLoader().getResourceAsStream("introPageQueries.properties");
            if (inputStream == null)
                    throw new ExceptionInInitializerError("failed to load properties file");
            properties = new Properties();
            properties.load(inputStream);
        }catch (Exception exception) {
            exception.printStackTrace();
            throw new ExceptionInInitializerError("Properties file could not be loaded");
        }
    }

    //Default Constructor
    public IntroDaoImpl(){}

    @Override
    public boolean addOurMission(OurMission ourMission) {
        return false;
    }

    @Override
    public boolean addOurPromise(OurPromise ourPromise) {
        return false;
    }

    @Override
    public boolean addOurStory(OurStory ourStory) {
        return false;
    }

    @Override
    public boolean addOurTeam(OurTeam ourTeam) {
        return false;
    }

    @Override
    public boolean addOurValues(OurValue ourValues) {
        return false;
    }

    @Override
    public OurMission getOurMission(int id) {
        return null;
    }

    @Override
    public OurPromise getOurPromise(int id) {
        return null;
    }

    @Override
    public OurStory getOurStory(int id) {
        return null;
    }

    @Override
    public OurTeam getOurTeam(int id) {
        return null;
    }

    @Override
    public OurValue getOurValues(int id) {
        return null;
    }

    @Override
    public boolean updateOurMission(OurMission ourMission) {
        return false;
    }

    @Override
    public boolean updateOurPromise(OurPromise ourPromise) {
        return false;
    }

    @Override
    public boolean updateOurStory(OurStory ourStory) {
        return false;
    }

    @Override
    public boolean updateOurTeam(OurTeam ourTeam) {
        return false;
    }

    @Override
    public boolean updateOurValues(OurValue ourValues) {
        return false;
    }

    @Override
    public boolean deleteOurMission(int id) {
        return false;
    }

    @Override
    public boolean deleteOurPromise(int id) {
        return false;
    }

    @Override
    public boolean deleteOurStory(int id) {
        return false;
    }

    @Override
    public boolean deleteOurTeam(int id) {
        return false;
    }

    @Override
    public boolean deleteOurValues(int id) {
        return false;
    }

    @Override
    public List<OurMission> getAllOurMissions() {
        List<OurMission> ourMissions = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(properties.getProperty("ourMission.selectAll"))) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ourMissions.add(new OurMission(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getTimestamp(6),
                        resultSet.getTimestamp(7)
                        ));
            }
        }catch (Exception exception) {
            exception.printStackTrace();
        }
        return ourMissions;
    }

    @Override
    public List<OurPromise> getAllOurPromises() {
        List<OurPromise> ourPromises = new ArrayList<>();
        try(PreparedStatement preparedStatement = connection.prepareStatement(properties.getProperty("ourPromise.selectAll"))) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ourPromises.add(new OurPromise(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getTimestamp(6),
                        resultSet.getTimestamp(7)
                ));
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return ourPromises;
    }

    @Override
    public List<OurStory> getAllOurStories() {
        List<OurStory> ourStories = new ArrayList<>();
        try(PreparedStatement preparedStatement = connection.prepareStatement(properties.getProperty("ourStory.selectAll"))) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ourStories.add(new OurStory(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getTimestamp(6),
                        resultSet.getTimestamp(7)
                ));
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return ourStories;
    }

    @Override
    public List<OurTeam> getAllOurTeams() {
        List<OurTeam> ourTeams = new ArrayList<>();
        try(PreparedStatement preparedStatement = connection.prepareStatement(properties.getProperty("ourTeam.selectAll"))) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ourTeams.add(new OurTeam(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getTimestamp(8),
                        resultSet.getTimestamp(9)
                ));
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return ourTeams;
    }

    @Override
    public List<OurValue> getAllOurValues() {
        List<OurValue> ourValues = new ArrayList<>();
        try(PreparedStatement preparedStatement = connection.prepareStatement(properties.getProperty("ourValue.selectAll"))) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ourValues.add(new OurValue(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getTimestamp(6),
                        resultSet.getTimestamp(7)
                ));
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return ourValues;
    }
}
