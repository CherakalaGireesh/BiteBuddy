package com.bitebuddy.bitebuddy.model.dao.introDao;

import com.bitebuddy.bitebuddy.model.beans.introBeans.HowItWork;
import com.bitebuddy.bitebuddy.util.DBUtil;
import com.bitebuddy.bitebuddy.util.PropertiesUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HowItWorkDaoImpl implements HowItWorkDao{
    private static Connection connection = DBUtil.getConnection();
    @Override
    public boolean addHowItWork(HowItWork howItWork) {
        String query = PropertiesUtil.getProperty("howItWorks.insert");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, howItWork.getId());
            preparedStatement.setString(2,howItWork.getImageBasePath());
            preparedStatement.setString(3, howItWork.getImageName());
            preparedStatement.setString(4, howItWork.getCaption());
            preparedStatement.setString(5, howItWork.getDescription());
            preparedStatement.setString(6, howItWork.getUserAction());
            preparedStatement.setString(7, howItWork.getAdditionalInfo());
            preparedStatement.setString(8, howItWork.getTip());
            preparedStatement.setString(9, howItWork.getStatus());
            preparedStatement.setTimestamp(10, howItWork.getCreatedAt());
            preparedStatement.setTimestamp(11, howItWork.getUpdatedAt());
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully inserted data into intro_slides table for the ID : " + howItWork.getId() + " : (" +rowCount + " row(s) affected.");
            return true;
        } catch (SQLException exception) {
            System.err.println("Error inserting data into intro_slides table for the ID : " + howItWork.getId() + " : Exeption message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public HowItWork getHowItWorkById(int id) {
        String query = PropertiesUtil.getProperty("howItWorks.selectById");;
        HowItWork howItWork = new HowItWork();
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                howItWork.setId(resultSet.getInt(1));
                howItWork.setImageBasePath(resultSet.getString(2));
                howItWork.setImageName(resultSet.getString(3));
                howItWork.setCaption(resultSet.getString(4));
                howItWork.setDescription(resultSet.getString(5));
                howItWork.setUserAction(resultSet.getString(6));
                howItWork.setAdditionalInfo(resultSet.getString(7));
                howItWork.setTip(resultSet.getString(8));
                howItWork.setStatus(resultSet.getString(9));
                howItWork.setCreatedAt(resultSet.getTimestamp(10));
                howItWork.setUpdatedAt(resultSet.getTimestamp(11));
            }
            System.out.println("Successfully retrieved data from how_it_works table for ID " + id);
            return howItWork;
        } catch (SQLException exception) {
            System.err.println("Error retrieving data from how_it_works table for ID : " + id + " : Exception message : " + exception.getMessage());
        }
        return null;
    }

    @Override
    public boolean updateHowItWork(HowItWork howItWork) {
        String query = PropertiesUtil.getProperty("howItWorks.updateById");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, howItWork.getImageName());
            preparedStatement.setString(2, howItWork.getCaption());
            preparedStatement.setString(3, howItWork.getDescription());
            preparedStatement.setString(4, howItWork.getUserAction());
            preparedStatement.setString(5, howItWork.getAdditionalInfo());
            preparedStatement.setString(6, howItWork.getTip());
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully updated data for ID in how_it_works table: " + howItWork.getId() + " : (" + rowCount + " row(s) affected).");
        } catch ( SQLException exception) {
            System.err.println("Error updating data in how_it_works table for ID " + howItWork.getId() + " : Exception message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public boolean deleteHowItWorkById(int id) {
        String query = PropertiesUtil.getProperty("howItWorks.deleteById");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully deleted data from how_it_works table for the ID : " + id + " : (" + rowCount + " row(s) affected).");
        }catch (SQLException exception) {
            System.err.println("Error deleting data from how_it_works table for ID : " + id + " : Exception message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public List<HowItWork> getAllHowItWorks() {
        String query = PropertiesUtil.getProperty("howItWorks.selectAll");
        List<HowItWork> howItWorks = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                howItWorks.add(new HowItWork(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8),
                        resultSet.getString(9),
                        resultSet.getTimestamp(10),
                        resultSet.getTimestamp(11)
                ));
            }
            System.out.println("Successfully fetched all records from how_it_works table.");
            return howItWorks;
        } catch (SQLException exception) {
            System.err.println("Error fetching data from how_it_works table" + " : Exception : " + exception.getMessage());
        }
        return null;
    }
}
