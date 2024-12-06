package com.bitebuddy.bitebuddy.model.dao.introDao;

import com.bitebuddy.bitebuddy.model.beans.introBeans.OurMission;
import com.bitebuddy.bitebuddy.model.beans.introBeans.OurValue;
import com.bitebuddy.bitebuddy.util.DBUtil;
import com.bitebuddy.bitebuddy.util.PropertiesUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OurValueDaoImpl implements OurValueDao {
    private static Connection connection = DBUtil.getConnection();
    @Override
    public boolean addOurMission(OurValue ourValue) {
        String query = PropertiesUtil.getProperty("ourValues.insert");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, ourValue.getImageName());
            preparedStatement.setString(2, ourValue.getCaption());
            preparedStatement.setString(3, ourValue.getDescription());
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully inserted data into our_values table for the ID : " + ourValue.getId() + " : (" +rowCount + " row(s) affected.");
            return true;
        }catch (SQLException exception) {
            System.err.println("Error inserting data into our_values table for the ID : " + ourValue.getId() + " : Exeption message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public OurValue getOurMissionById(int id) {
        String query = PropertiesUtil.getProperty("ourValues.selectById");
        OurValue ourValue = new OurValue();
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ourValue.setId(resultSet.getInt(1));
                ourValue.setImageBasePath(resultSet.getString(2));
                ourValue.setImageName(resultSet.getString(3));
                ourValue.setCaption(resultSet.getString(4));;
                ourValue.setDescription(resultSet.getString(5));
                ourValue.setCreatedAt(resultSet.getTimestamp(6));
                ourValue.setUpdatedAt(resultSet.getTimestamp(7));
                System.out.println("Successfully retrieved data from our_values table for ID " + id);
                return ourValue;
            }
        } catch (SQLException exception) {
            System.err.println("Error retrieving data from our_values table for ID : " + id + " : Exception message : " + exception.getMessage());
        }
        return null;
    }

    @Override
    public boolean updateOurMission(OurValue ourValue) {
        String query = PropertiesUtil.getProperty("ourValues.updateById");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, ourValue.getImageName());
            preparedStatement.setString(2, ourValue.getCaption());
            preparedStatement.setString(3, ourValue.getDescription());
            preparedStatement.setInt(4, ourValue.getId());
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully updated data in our_values table for the ID : " + ourValue.getId() + " : (" + rowCount + " row(s) affected).");
            return true;
        } catch (SQLException exception) {
            System.err.println("Error updating data in our_values table for ID " + ourValue.getId() + " : Exception message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public boolean deleteOurMissionById(int id) {
        String query = PropertiesUtil.getProperty("ourValues.deleteById");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully deleted data from our_values table for the ID : " + id + " : (" + rowCount + " row(s) affected).");
        }catch (SQLException exception) {
            System.err.println("Error deleting data from our_values table for ID : " + id + " : Exception message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public List<OurValue> getAllOurValues() {
        String query = PropertiesUtil.getProperty("ourValues.selectAll");
        List<OurValue> ourValues = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
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
            System.out.println("Successfully fetched all records from our_values table.");
            return ourValues;
        } catch (SQLException exception) {
            System.err.println("Error fetching data from our_values table" + " : Exception : " + exception.getMessage());
        }
        return null;
    }
}
