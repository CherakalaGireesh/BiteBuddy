package com.bitebuddy.bitebuddy.model.dao.introDao;

import com.bitebuddy.bitebuddy.model.beans.introBeans.IntroSlide;
import com.bitebuddy.bitebuddy.util.DBUtil;
import com.bitebuddy.bitebuddy.util.PropertiesUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IntroSlideDaoImpl implements IntroSlideDao{
    private static Connection connection = DBUtil.getConnection();
    @Override
    public boolean addIntroSlide(IntroSlide introSlide) {
        String query = PropertiesUtil.getProperty("introSlides.insert");
        try ( PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, introSlide.getImageName());
            preparedStatement.setString(2, introSlide.getCaption());
            preparedStatement.setString(3, introSlide.getDescription());
            preparedStatement.setString(4, introSlide.getFeatures());
            preparedStatement.setString(5, introSlide.getKeywords());
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully inserted data into intro_slides table for the ID : " + introSlide.getId() + " : (" +rowCount + " row(s) affected.");
            return true;
        }catch (SQLException exception) {
            System.err.println("Error inserting data into intro_slides table for the ID : " + introSlide.getId() + " : Exeption message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public IntroSlide getIntroSlideById(int id) {
        String query = PropertiesUtil.getProperty("introSlides.selectById");
        IntroSlide introSlide = new IntroSlide();
        try ( PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                introSlide.setId(resultSet.getInt(1));
                introSlide.setImageBasePath(resultSet.getString(2));
                introSlide.setImageName(resultSet.getString(3));
                introSlide.setCaption(resultSet.getString(4));
                introSlide.setDescription(resultSet.getString(5));
                introSlide.setFeatures(resultSet.getString(6));
                introSlide.setKeywords(resultSet.getString(7));
                introSlide.setStatus(resultSet.getString(8));
                introSlide.setCreatedAt(resultSet.getTimestamp(9));
                introSlide.setUpdatedAt(resultSet.getTimestamp(10));
            }
            System.out.println("Successfully retrieved data from intro_slides table for ID " + id);
            return introSlide;
        }catch (SQLException exception) {
            System.err.println("Error retrieving data from intro_slides table for ID : " + id + " : Exception message : " + exception.getMessage());
        }
        return null;
    }

    @Override
    public boolean updateIntroSlide(IntroSlide introSlide) {
        String query = PropertiesUtil.getProperty("introSlides.updateById");
        try ( PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, introSlide.getImageName());
            preparedStatement.setString(2, introSlide.getCaption());
            preparedStatement.setString(3, introSlide.getDescription());
            preparedStatement.setString(4, introSlide.getFeatures());
            preparedStatement.setString(5, introSlide.getKeywords());
            preparedStatement.setInt(6,introSlide.getId());
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully updated data in intro_slide table for the ID : " + introSlide.getId() + " : (" + rowCount + " row(s) affected).");
            return rowCount > 0;
        } catch (SQLException exception) {
            System.err.println("Error updating data in intro_slide table for ID " + introSlide.getId() + " : Exception message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public boolean deleteIntroSlide(int id) {
        String query = PropertiesUtil.getProperty("introSlides.deleteById");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully deleted data from intro_slides table for the ID : " + id + " : (" + rowCount + " row(s) affected).");
        }catch (SQLException exception) {
            System.err.println("Error deleting data from intro_slides table for ID : " + id + " : Exception message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public List<IntroSlide> getAllIntroSlides() {
        String query = PropertiesUtil.getProperty("introSlides.selectAll");
        List<IntroSlide> introSlides = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                introSlides.add(new IntroSlide(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8),
                        resultSet.getTimestamp(9),
                        resultSet.getTimestamp(10)
                ));
            }
            System.out.println("Successfully fetched all records from intro_slides table.");
            return introSlides;
        } catch (SQLException exception) {
            System.err.println("Error fetching data from intro_slides table" + " : Exception : " + exception.getMessage());
        }
        return null;
    }
}
