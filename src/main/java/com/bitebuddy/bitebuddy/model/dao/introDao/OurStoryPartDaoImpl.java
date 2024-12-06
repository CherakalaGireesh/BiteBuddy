package com.bitebuddy.bitebuddy.model.dao.introDao;

import com.bitebuddy.bitebuddy.model.beans.introBeans.OurMission;
import com.bitebuddy.bitebuddy.model.beans.introBeans.OurStoryPart;
import com.bitebuddy.bitebuddy.util.DBUtil;
import com.bitebuddy.bitebuddy.util.PropertiesUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OurStoryPartDaoImpl implements OurStoryPartDao {
    private  static Connection connection = DBUtil.getConnection();
    @Override
    public boolean addOurStoryPart(OurStoryPart ourStoryPart) {
        String query = PropertiesUtil.getProperty("ourStoryParts.insert");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, ourStoryPart.getImageName());
            preparedStatement.setString(2, ourStoryPart.getCaption());
            preparedStatement.setString(2, ourStoryPart.getDescription());
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully inserted data into our_story_parts table for the ID : " + ourStoryPart.getId() + " : (" +rowCount + " row(s) affected.");
            return true;
        }catch (SQLException exception) {
            System.err.println("Error inserting data into our_story_parts table for the ID : " + ourStoryPart.getId() + " : Exeption message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public OurStoryPart getOurStoryPartById(int id) {
        String query = PropertiesUtil.getProperty("ourStoryParts.selectById");
        OurStoryPart ourStoryPart = new OurStoryPart();
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ourStoryPart.setId(resultSet.getInt(1));
                ourStoryPart.setImageBasePath(resultSet.getString(2));
                ourStoryPart.setImageName(resultSet.getString(3));
                ourStoryPart.setCaption(resultSet.getString(4));;
                ourStoryPart.setDescription(resultSet.getString(5));
                ourStoryPart.setCreatedAt(resultSet.getTimestamp(6));
                ourStoryPart.setUpdatedAt(resultSet.getTimestamp(7));
                System.out.println("Successfully retrieved data from our_story table for ID " + id);
                return ourStoryPart;
            }
        } catch (SQLException exception) {
            System.err.println("Error retrieving data from our_story_parts table for ID : " + id + " : Exception message : " + exception.getMessage());
        }
        return null;
    }

    @Override
    public boolean updateOurStoryPart(OurStoryPart ourStoryPart) {
        String query = PropertiesUtil.getProperty("ourStoryParts.updateById");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, ourStoryPart.getImageName());
            preparedStatement.setString(2, ourStoryPart.getCaption());
            preparedStatement.setString(3, ourStoryPart.getDescription());
            preparedStatement.setInt(4, ourStoryPart.getId());
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully updated data in our_story_parts table for the ID : " + ourStoryPart.getId() + " : (" + rowCount + " row(s) affected).");
            return true;
        } catch (SQLException exception) {
            System.err.println("Error updating data in our_story_parts table for ID " + ourStoryPart.getId() + " : Exception message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public boolean deleteOurStoryPartById(int id) {
        String query = PropertiesUtil.getProperty("ourStoryParts.deleteById");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully deleted data from our_story_parts table for the ID : " + id + " : (" + rowCount + " row(s) affected).");
        }catch (SQLException exception) {
            System.err.println("Error deleting data from our_story_parts table for ID : " + id + " : Exception message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public List<OurStoryPart> getAllOurStoryParts() {
        String query = PropertiesUtil.getProperty("ourStoryParts.selectAll");
        List<OurStoryPart> ourStoryParts = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ourStoryParts.add(new OurStoryPart(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getTimestamp(6),
                        resultSet.getTimestamp(7)
                ));
            }
            System.out.println("Successfully fetched all records from our_story_parts table.");
            return ourStoryParts;
        } catch (SQLException exception) {
            System.err.println("Error fetching data from our_story_parts table" + " : Exception : " + exception.getMessage());
        }
        return null;
    }
}
