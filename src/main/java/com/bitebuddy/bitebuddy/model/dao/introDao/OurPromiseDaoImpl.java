package com.bitebuddy.bitebuddy.model.dao.introDao;

import com.bitebuddy.bitebuddy.model.beans.introBeans.OurMission;
import com.bitebuddy.bitebuddy.model.beans.introBeans.OurPromise;
import com.bitebuddy.bitebuddy.util.DBUtil;
import com.bitebuddy.bitebuddy.util.PropertiesUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OurPromiseDaoImpl implements OurPromiseDao{
    private static Connection connection = DBUtil.getConnection();
    @Override
    public boolean addOurPromise(OurPromise ourPromise) {
        String query = PropertiesUtil.getProperty("ourPromises.insert");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, ourPromise.getImageName());
            preparedStatement.setString(2, ourPromise.getCaption());
            preparedStatement.setString(2, ourPromise.getDescription());
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully inserted data into our_promises table for the ID : " + ourPromise.getId() + " : (" +rowCount + " row(s) affected.");
            return true;
        }catch (SQLException exception) {
            System.err.println("Error inserting data into our_promises table for the ID : " + ourPromise.getId() + " : Exeption message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public OurPromise getOurPromiseById(int id) {
        String query = PropertiesUtil.getProperty("ourPromises.selectById");
        OurPromise ourPromise = new  OurPromise();
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ourPromise.setId(resultSet.getInt(1));
                ourPromise.setImageBasePath(resultSet.getString(2));
                ourPromise.setImageName(resultSet.getString(3));
                ourPromise.setCaption(resultSet.getString(4));;
                ourPromise.setDescription(resultSet.getString(5));
                ourPromise.setCreatedAt(resultSet.getTimestamp(6));
                ourPromise.setUpdatedAt(resultSet.getTimestamp(7));
                System.out.println("Successfully retrieved data from our_promises table for ID " + id);
                return ourPromise;
            }
        } catch (SQLException exception) {
            System.err.println("Error retrieving data from our_promises table for ID : " + id + " : Exception message : " + exception.getMessage());
        }
        return null;
    }

    @Override
    public boolean updateOurPromise(OurPromise ourPromise) {
        String query = PropertiesUtil.getProperty("ourPromises.updateById");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, ourPromise.getImageName());
            preparedStatement.setString(2, ourPromise.getCaption());
            preparedStatement.setString(3, ourPromise.getDescription());
            preparedStatement.setInt(4, ourPromise.getId());
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully updated data in our_promises table for the ID : " + ourPromise.getId() + " : (" + rowCount + " row(s) affected).");
            return true;
        } catch (SQLException exception) {
            System.err.println("Error updating data in our_promises table for ID " + ourPromise.getId() + " : Exception message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public boolean deleteOurPromiseById(int id) {
        String query = PropertiesUtil.getProperty("ourPromises.deleteById");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully deleted data from our_promises table for the ID : " + id + " : (" + rowCount + " row(s) affected).");
        }catch (SQLException exception) {
            System.err.println("Error deleting data from our_promises table for ID : " + id + " : Exception message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public List<OurPromise> getAllOurPromises() {
        String query = PropertiesUtil.getProperty("ourPromises.selectAll");
        List<OurPromise> ourPromises = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
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
            System.out.println("Successfully fetched all records from our_promises table.");
            return ourPromises;
        } catch (SQLException exception) {
            System.err.println("Error fetching data from our_promises table" + " : Exception : " + exception.getMessage());
        }
        return null;
    }
}
