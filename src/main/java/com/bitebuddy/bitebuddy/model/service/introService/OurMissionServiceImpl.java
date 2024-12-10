package com.bitebuddy.bitebuddy.model.service.introService;

import com.bitebuddy.bitebuddy.model.beans.introBeans.OurMission;
import com.bitebuddy.bitebuddy.model.dao.introDao.OurMissionDao;
import com.bitebuddy.bitebuddy.model.dao.introDao.OurMissionDaoImpl;

import java.util.List;

public class OurMissionServiceImpl implements OurMissionService {
    private OurMissionDao ourMissionDao;

    public OurMissionServiceImpl() {
        this.ourMissionDao = new OurMissionDaoImpl();
    }

    @Override
    public boolean addOurMission(OurMission ourMission) {
        return ourMissionDao.addOurMission(ourMission);
    }

    @Override
    public OurMission getOurMissionById(int id) {
        return ourMissionDao.getOurMissionById(id);
    }

    @Override
    public boolean updateOurMission(OurMission ourMission) {
        return ourMissionDao.updateOurMission(ourMission);
    }

    @Override
    public boolean deleteOurMissionById(int id) {
        return ourMissionDao.deleteOurMissionById(id);
    }

    @Override
    public List<OurMission> getAllOurMissions() {
        return ourMissionDao.getAllOurMissions();
    }
}
