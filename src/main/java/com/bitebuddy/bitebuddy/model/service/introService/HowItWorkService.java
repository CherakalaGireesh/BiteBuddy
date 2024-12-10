package com.bitebuddy.bitebuddy.model.service.introService;

import com.bitebuddy.bitebuddy.model.beans.introBeans.HowItWork;

import java.util.List;

public interface HowItWorkService {
    //Create
    public boolean addHowItWorks(HowItWork howItWork);

    //Read
    public HowItWork getHowItWorkById(int id);;

    //Update
    public boolean updateHowItWork(HowItWork howItWork);

    //Delete
    public boolean deleteHowItWorkById(int id);

    //Custom Queries
    public List<HowItWork> getAllHowItWorks();
}
