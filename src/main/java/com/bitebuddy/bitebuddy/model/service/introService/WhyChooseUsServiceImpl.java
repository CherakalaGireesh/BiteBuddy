package com.bitebuddy.bitebuddy.model.service.introService;

import com.bitebuddy.bitebuddy.model.beans.introBeans.WhyChooseUsItem;
import com.bitebuddy.bitebuddy.model.dao.introDao.WhyChooseUsDao;
import com.bitebuddy.bitebuddy.model.dao.introDao.WhyChooseUsDaoImpl;

import java.util.List;

public class WhyChooseUsServiceImpl implements WhyChooseUsService{
    private WhyChooseUsDao whyChooseUsDao;

    public WhyChooseUsServiceImpl() {
        this.whyChooseUsDao = new WhyChooseUsDaoImpl();
    }

    @Override
    public boolean addOurMission(WhyChooseUsItem whyChooseUsItem) {
        return whyChooseUsDao.addOurMission(whyChooseUsItem);
    }

    @Override
    public WhyChooseUsItem getOurMissionById(int id) {
        return whyChooseUsDao.getOurMissionById(id);
    }

    @Override
    public boolean updateOurMission(WhyChooseUsItem whyChooseUsItem) {
        return whyChooseUsDao.updateOurMission(whyChooseUsItem);
    }

    @Override
    public boolean deleteOurMissionById(int id) {
        return whyChooseUsDao.deleteOurMissionById(id);
    }

    @Override
    public List<WhyChooseUsItem> getAllWhyChooseUsItems() {
        return whyChooseUsDao.getAllWhyChooseUsItems();
    }
}
