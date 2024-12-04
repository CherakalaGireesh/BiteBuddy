package com.bitebuddy.bitebuddy.model.dao.introDao;

import com.bitebuddy.bitebuddy.model.beans.introBeans.IntroSlide;

import java.util.List;

public class IntroSlideDaoImpl implements IntroSlideDao{
    @Override
    public boolean addIntroSlide(IntroSlide introSlide) {
        return false;
    }

    @Override
    public IntroSlide getIntroSlideById(int id) {
        return null;
    }

    @Override
    public boolean updateIntroSlide(IntroSlide introSlide) {
        return false;
    }

    @Override
    public boolean deleteIntroSlide(int id) {
        return false;
    }

    @Override
    public List<IntroSlide> getAllIntroSlides() {
        return List.of();
    }
}
