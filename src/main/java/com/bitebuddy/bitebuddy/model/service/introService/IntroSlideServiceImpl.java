package com.bitebuddy.bitebuddy.model.service.introService;

import com.bitebuddy.bitebuddy.model.beans.introBeans.IntroSlide;
import com.bitebuddy.bitebuddy.model.dao.introDao.IntroSlideDao;
import com.bitebuddy.bitebuddy.model.dao.introDao.IntroSlideDaoImpl;

import java.util.List;

public class IntroSlideServiceImpl implements IntroSlideService{
    private IntroSlideDao introSlideDao;

    public IntroSlideServiceImpl() {
        this.introSlideDao = new IntroSlideDaoImpl();
    }

    @Override
    public boolean addIntroSlide(IntroSlide introSlide) {
        return introSlideDao.addIntroSlide(introSlide);
    }

    @Override
    public IntroSlide getIntroSlideById(int id) {
        return introSlideDao.getIntroSlideById(id);
    }

    @Override
    public boolean updateIntroSlide(IntroSlide introSlide) {
        return introSlideDao.updateIntroSlide(introSlide);
    }

    @Override
    public boolean deleteIntroSlide(int id) {
        return introSlideDao.deleteIntroSlide(id);
    }

    @Override
    public List<IntroSlide> getAllIntroSlides() {
        return introSlideDao.getAllIntroSlides();
    }
}
