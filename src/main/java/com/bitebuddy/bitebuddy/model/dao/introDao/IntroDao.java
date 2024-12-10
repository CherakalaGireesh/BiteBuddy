package com.bitebuddy.bitebuddy.model.dao.introDao;

import com.bitebuddy.bitebuddy.model.beans.introBeans.HowItWork;
import com.bitebuddy.bitebuddy.model.beans.introBeans.IntroSlide;
import com.bitebuddy.bitebuddy.model.beans.introBeans.OurMission;

import java.util.List;

public interface IntroDao {
    //Create
    public boolean addIntroSlide(IntroSlide introSlide);;
    public boolean addHowItWork(HowItWork howItWork);

    //Read
    public IntroSlide getIntroSlideById(int id);
    public HowItWork getHowItWorkById(int id);;

    //Update
    public boolean updateIntroSlide(IntroSlide introSlide);
    public boolean updateHowItWork(HowItWork howItWork);
    ;
    //Delete
    public boolean deleteIntroSlide(int id);
    public boolean deleteHowItWorkById(int id);

    //Custom Queries
    public List<IntroSlide> getAllIntroSlides();
    public List<HowItWork> getAllHowItWorks();
}
