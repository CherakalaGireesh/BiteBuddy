package com.bitebuddy.bitebuddy.model.dao.introDao;

import com.bitebuddy.bitebuddy.model.beans.introBeans.IntroSlide;

import java.util.List;

public interface IntroSlideDao {
    //Create
    public boolean addIntroSlide(IntroSlide introSlide);;

    //Read
    public IntroSlide getIntroSlideById(int id);

    //Update
    public boolean updateIntroSlide(IntroSlide introSlide);;

    //Delete
    public boolean deleteIntroSlide(int id);

    //Custom Queries
    public List<IntroSlide> getAllIntroSlides();
}
