package com.bitebuddy.bitebuddy.model.service.introService;

import com.bitebuddy.bitebuddy.model.beans.introBeans.HowItWork;
import com.bitebuddy.bitebuddy.model.dao.introDao.HowItWorkDao;
import com.bitebuddy.bitebuddy.model.dao.introDao.HowItWorkDaoImpl;

import java.util.List;

public class HowItWorkServiceImpl implements HowItWorkService{
    private HowItWorkDao howItWorkDao;

    public HowItWorkServiceImpl() {
        this.howItWorkDao = new HowItWorkDaoImpl();
    }

    @Override
    public boolean addHowItWorks(HowItWork howItWork) {
        return howItWorkDao.addHowItWork(howItWork);
    }

    @Override
    public HowItWork getHowItWorkById(int id) {
        return howItWorkDao.getHowItWorkById(id);
    }

    @Override
    public boolean updateHowItWork(HowItWork howItWork) {
        return howItWorkDao.updateHowItWork(howItWork);
    }

    @Override
    public boolean deleteHowItWorkById(int id) {
        return howItWorkDao.deleteHowItWorkById(id);
    }

    @Override
    public List<HowItWork> getAllHowItWorks() {
        return howItWorkDao.getAllHowItWorks();
    }
}
