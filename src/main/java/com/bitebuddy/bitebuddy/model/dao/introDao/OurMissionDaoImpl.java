package com.bitebuddy.bitebuddy.model.dao.introDao;

import com.bitebuddy.bitebuddy.model.beans.introBeans.IntroSlide;
import com.bitebuddy.bitebuddy.model.beans.introBeans.OurMission;
import com.bitebuddy.bitebuddy.util.DBUtil;
import com.bitebuddy.bitebuddy.util.PropertiesUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OurMissionDaoImpl implements OurMissionDao{
    private static Connection connection = DBUtil.getConnection();
    @Override
    public boolean addOurMission(OurMission ourMission) {
        String query = PropertiesUtil.getProperty("ourMissions.insert");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, ourMission.getImageName());
            preparedStatement.setString(2, ourMission.getCaption());
            preparedStatement.setString(3, ourMission.getDescription());
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully inserted data into our_missions table for the ID : " + ourMission.getId() + " : (" +rowCount + " row(s) affected.");
            return true;
        }catch (SQLException exception) {
            System.err.println("Error inserting data into our_missions table for the ID : " + ourMission.getId() + " : Exeption message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public OurMission getOurMissionById(int id) {
        String query = PropertiesUtil.getProperty("ourMissions.selectById");
        OurMission ourMission = new OurMission();
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ourMission.setId(resultSet.getInt(1));
                ourMission.setImageBasePath(resultSet.getString(2));
                ourMission.setImageName(resultSet.getString(3));
                ourMission.setCaption(resultSet.getString(4));;
                ourMission.setDescription(resultSet.getString(5));
                ourMission.setCreatedAt(resultSet.getTimestamp(6));
                ourMission.setUpdatedAt(resultSet.getTimestamp(7));
                System.out.println("Successfully retrieved data from our_missions table for ID " + id);
                return ourMission;
            }
        } catch (SQLException exception) {
            System.err.println("Error retrieving data from our_missions table for ID : " + id + " : Exception message : " + exception.getMessage());
        }
        return null;
    }

    @Override
    public boolean updateOurMission(OurMission ourMission) {
        String query = PropertiesUtil.getProperty("ourMissions.updateById");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, ourMission.getImageName());
            preparedStatement.setString(2, ourMission.getCaption());
            preparedStatement.setString(3, ourMission.getDescription());
            preparedStatement.setInt(4, ourMission.getId());
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully updated data in our_missions table for the ID : " + ourMission.getId() + " : (" + rowCount + " row(s) affected).");
            return true;
        } catch (SQLException exception) {
            System.err.println("Error updating data in our_missions table for ID " + ourMission.getId() + " : Exception message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public boolean deleteOurMissionById(int id) {
        String query = PropertiesUtil.getProperty("ourMissions.deleteById");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully deleted data from our_missions table for the ID : " + id + " : (" + rowCount + " row(s) affected).");
        }catch (SQLException exception) {
            System.err.println("Error deleting data from our_missions table for ID : " + id + " : Exception message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public List<OurMission> getAllOurMissions() {
        String query = PropertiesUtil.getProperty("ourMissions.selectAll");
        List<OurMission> ourMissions = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
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
            System.out.println("Successfully fetched all records from our_missions table.");
            return ourMissions;
        } catch (SQLException exception) {
            System.err.println("Error fetching data from our_missions table" + " : Exception : " + exception.getMessage());
        }
        return null;
    }
}
