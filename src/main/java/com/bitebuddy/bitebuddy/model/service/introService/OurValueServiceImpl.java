package com.bitebuddy.bitebuddy.model.service.introService;

import com.bitebuddy.bitebuddy.model.beans.introBeans.OurValue;
import com.bitebuddy.bitebuddy.model.dao.introDao.OurValueDao;
import com.bitebuddy.bitebuddy.model.dao.introDao.OurValueDaoImpl;

import java.util.List;

public class OurValueServiceImpl implements OurValueService {
    private OurValueDao ourValueDao;

    public OurValueServiceImpl() {
        this.ourValueDao = new OurValueDaoImpl();
    }
    @Override
    public boolean addOurMission(OurValue ourValue) {
        return ourValueDao.addOurMission(ourValue);
    }

    @Override
    public OurValue getOurMissionById(int id) {
        return ourValueDao.getOurMissionById(id);
    }

    @Override
    public boolean updateOurMission(OurValue ourValue) {
        return ourValueDao.updateOurMission(ourValue);
    }

    @Override
    public boolean deleteOurMissionById(int id) {
        return ourValueDao.deleteOurMissionById(id);
    }

    @Override
    public List<OurValue> getAllOurValues() {
        return ourValueDao.getAllOurValues();
    }
}
