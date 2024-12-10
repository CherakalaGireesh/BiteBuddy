package com.bitebuddy.bitebuddy.model.dao.introDao;

import com.bitebuddy.bitebuddy.model.beans.introBeans.CustomerReview;

import java.util.List;

public interface CustomerReviewDao {
    //Create
    public boolean addCustomerReview(CustomerReview customerReview);;

    //Read
    public CustomerReview getCustomerReviewById(int id);

    //Update
    public boolean updateCustomerReview(CustomerReview customerReview);

    //Delete
    public boolean deleteCustomerReviewById(int id);

    //CustomQueries
    public List<CustomerReview> getAllCustomerReviews();
}
