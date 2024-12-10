package com.bitebuddy.bitebuddy.model.service.introService;

import com.bitebuddy.bitebuddy.model.beans.introBeans.IntroSlide;

import java.util.List;

public interface IntroSlideService {
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
