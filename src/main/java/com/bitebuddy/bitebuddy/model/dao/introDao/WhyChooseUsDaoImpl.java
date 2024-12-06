package com.bitebuddy.bitebuddy.model.dao.introDao;

import com.bitebuddy.bitebuddy.model.beans.introBeans.OurMission;
import com.bitebuddy.bitebuddy.model.beans.introBeans.WhyChooseUsItem;
import com.bitebuddy.bitebuddy.util.DBUtil;
import com.bitebuddy.bitebuddy.util.PropertiesUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WhyChooseUsDaoImpl implements WhyChooseUsDao {
    private static Connection connection = DBUtil.getConnection();
    @Override
    public boolean addOurMission(WhyChooseUsItem whyChooseUsItem) {
        String query = PropertiesUtil.getProperty("whyChooseUs.insert");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, whyChooseUsItem.getImageName());
            preparedStatement.setString(2, whyChooseUsItem.getCaption());
            preparedStatement.setString(3, whyChooseUsItem.getDescription());
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully inserted data into why_choose_us_items table for the ID : " + whyChooseUsItem.getId() + " : (" +rowCount + " row(s) affected.");
            return true;
        }catch (SQLException exception) {
            System.err.println("Error inserting data into why_choose_us_items table for the ID : " + whyChooseUsItem.getId() + " : Exeption message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public WhyChooseUsItem getOurMissionById(int id) {
        String query = PropertiesUtil.getProperty("whyChooseUs.selectById");
        WhyChooseUsItem whyChooseUsItem = new WhyChooseUsItem();
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                whyChooseUsItem.setId(resultSet.getInt(1));
                whyChooseUsItem.setImageBasePath(resultSet.getString(2));
                whyChooseUsItem.setImageName(resultSet.getString(3));
                whyChooseUsItem.setCaption(resultSet.getString(4));;
                whyChooseUsItem.setDescription(resultSet.getString(5));
                whyChooseUsItem.setCreatedAt(resultSet.getTimestamp(6));
                whyChooseUsItem.setUpdatedAt(resultSet.getTimestamp(7));
                System.out.println("Successfully retrieved data from why_choose_us_items table for ID " + id);
                return whyChooseUsItem;
            }
        } catch (SQLException exception) {
            System.err.println("Error retrieving data from why_choose_us_items table for ID : " + id + " : Exception message : " + exception.getMessage());
        }
        return null;
    }

    @Override
    public boolean updateOurMission(WhyChooseUsItem whyChooseUsItem) {
        String query = PropertiesUtil.getProperty("whyChooseUs.updateById");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, whyChooseUsItem.getImageName());
            preparedStatement.setString(2, whyChooseUsItem.getCaption());
            preparedStatement.setString(3, whyChooseUsItem.getDescription());
            preparedStatement.setInt(4, whyChooseUsItem.getId());
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully updated data in why_choose_us_items table for the ID : " + whyChooseUsItem.getId() + " : (" + rowCount + " row(s) affected).");
            return true;
        } catch (SQLException exception) {
            System.err.println("Error updating data in why_choose_us_items table for ID " + whyChooseUsItem.getId() + " : Exception message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public boolean deleteOurMissionById(int id) {
        String query = PropertiesUtil.getProperty("whyChooseUs.deleteById");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully deleted data from why_choose_us_items table for the ID : " + id + " : (" + rowCount + " row(s) affected).");
        }catch (SQLException exception) {
            System.err.println("Error deleting data from why_choose_us_items table for ID : " + id + " : Exception message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public List<WhyChooseUsItem> getAllWhyChooseUsItems() {
        String query = PropertiesUtil.getProperty("whyChooseUs.selectAll");
        List<WhyChooseUsItem> whyChooseUsItems = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                whyChooseUsItems.add(new WhyChooseUsItem(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getTimestamp(6),
                        resultSet.getTimestamp(7)
                ));
            }
            System.out.println("Successfully fetched all records from why_choose_us_items table.");
            return whyChooseUsItems;
        } catch (SQLException exception) {
            System.err.println("Error fetching data from why_choose_us_items table" + " : Exception : " + exception.getMessage());
        }
        return null;
    }
}
