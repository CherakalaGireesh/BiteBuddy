package com.bitebuddy.bitebuddy.model.dao.introDao;

import com.bitebuddy.bitebuddy.model.beans.introBeans.CustomerReview;
import com.bitebuddy.bitebuddy.model.beans.introBeans.HowItWork;
import com.bitebuddy.bitebuddy.util.DBUtil;
import com.bitebuddy.bitebuddy.util.PropertiesUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerReviewDaoImpl implements CustomerReviewDao {
    private Connection connection = DBUtil.getConnection();

    @Override
    public boolean addCustomerReview(CustomerReview customerReview) {
        String query = PropertiesUtil.getProperty("customerReviews.insert");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, customerReview.getCustomerName());
            preparedStatement.setDouble(2, customerReview.getRating());
            preparedStatement.setString(3, customerReview.getReviewText());
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully updated data for ID in customer_reviews table: " + customerReview.getId() + " : (" + rowCount + " row(s) affected).");
        } catch ( SQLException exception) {
            System.err.println("Error updating data in customer_reviews table for ID " + customerReview.getId() + " : Exception message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public CustomerReview getCustomerReviewById(int id) {
        String query = PropertiesUtil.getProperty("customerReviews.selectById");;
        CustomerReview customerReview = new CustomerReview();
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                customerReview.setId(resultSet.getInt(1));
                customerReview.setCustomerName(resultSet.getString(2));
                customerReview.setRating(resultSet.getDouble(3));
                customerReview.setReviewText(resultSet.getString(4));
                customerReview.setCreatedAt(resultSet.getTimestamp(5));
                customerReview.setUpdatedAt(resultSet.getTimestamp(6));
            }
            System.out.println("Successfully retrieved data from customer_reviews table for ID " + id);
            return customerReview;
        } catch (SQLException exception) {
            System.err.println("Error retrieving data from customer_reviews table for ID : " + id + " : Exception message : " + exception.getMessage());
        }
        return null;
    }

    @Override
    public boolean updateCustomerReview(CustomerReview customerReview) {
        String query = PropertiesUtil.getProperty("customerReviews.updateById");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, customerReview.getCustomerName());
            preparedStatement.setDouble(2, customerReview.getRating());
            preparedStatement.setString(3, customerReview.getReviewText());
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully updated data for ID in customer_reviews table: " + customerReview.getId() + " : (" + rowCount + " row(s) affected).");
        } catch ( SQLException exception) {
            System.err.println("Error updating data in customer_reviews table for ID " + customerReview.getId() + " : Exception message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public boolean deleteCustomerReviewById(int id) {
        String query = PropertiesUtil.getProperty("customerReviews.deleteById");
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Successfully deleted data from customer_reviews table for the ID : " + id + " : (" + rowCount + " row(s) affected).");
        }catch (SQLException exception) {
            System.err.println("Error deleting data from customer_reviews table for ID : " + id + " : Exception message : " + exception.getMessage());
        }
        return false;
    }

    @Override
    public List<CustomerReview> getAllCustomerReviews() {
        String query = PropertiesUtil.getProperty("customerReviews.selectAll");
        List<CustomerReview> customerReviews = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                customerReviews.add(new CustomerReview(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getDouble(3),
                        resultSet.getString(4),
                        resultSet.getTimestamp(5),
                        resultSet.getTimestamp(6)
                ));
            }
            System.out.println("Successfully fetched all records from customer_reviews table.");
            return customerReviews;
        } catch (SQLException exception) {
            System.err.println("Error fetching data from customer_reviews table" + " : Exception : " + exception.getMessage());
        }
        return null;
    }
}
