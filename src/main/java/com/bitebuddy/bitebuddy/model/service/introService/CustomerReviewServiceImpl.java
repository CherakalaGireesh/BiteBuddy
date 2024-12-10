package com.bitebuddy.bitebuddy.model.service.introService;

import com.bitebuddy.bitebuddy.model.beans.introBeans.CustomerReview;
import com.bitebuddy.bitebuddy.model.dao.introDao.CustomerReviewDao;
import com.bitebuddy.bitebuddy.model.dao.introDao.CustomerReviewDaoImpl;

import java.util.List;

public class CustomerReviewServiceImpl implements CustomerReviewService {
    private CustomerReviewDao customerReviewDao;

    public CustomerReviewServiceImpl () {
        this.customerReviewDao = new CustomerReviewDaoImpl();
    }

    @Override
    public boolean addCustomerReview(CustomerReview customerReview) {
        return customerReviewDao.addCustomerReview(customerReview);
    }

    @Override
    public CustomerReview getCustomerReviewById(int id) {
        return customerReviewDao.getCustomerReviewById(id);
    }

    @Override
    public boolean updateCustomerReview(CustomerReview customerReview) {
        return customerReviewDao.updateCustomerReview(customerReview);
    }

    @Override
    public boolean deleteCustomerReviewById(int id) {
        return customerReviewDao.deleteCustomerReviewById(id);
    }

    @Override
    public List<CustomerReview> getAllCustomerReviews() {
        return customerReviewDao.getAllCustomerReviews();
    }
}
