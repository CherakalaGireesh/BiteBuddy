package com.bitebuddy.bitebuddy.model.service.introService;

import com.bitebuddy.bitebuddy.model.beans.introBeans.OurStoryPart;
import com.bitebuddy.bitebuddy.model.dao.introDao.OurStoryPartDao;
import com.bitebuddy.bitebuddy.model.dao.introDao.OurStoryPartDaoImpl;

import java.util.List;

public class OurStoryPartServiceImpl implements OurStoryPartService {
    private OurStoryPartDao ourStoryPartDao;

    public OurStoryPartServiceImpl() {
        this.ourStoryPartDao = new OurStoryPartDaoImpl();
    }

    @Override
    public boolean addOurStoryPart(OurStoryPart ourStoryPart) {
        return ourStoryPartDao.addOurStoryPart(ourStoryPart);
    }

    @Override
    public OurStoryPart getOurStoryPartById(int id) {
        return ourStoryPartDao.getOurStoryPartById(id);
    }

    @Override
    public boolean updateOurStoryPart(OurStoryPart ourStoryPart) {
        return ourStoryPartDao.updateOurStoryPart(ourStoryPart);
    }

    @Override
    public boolean deleteOurStoryPartById(int id) {
        return ourStoryPartDao.deleteOurStoryPartById(id);
    }

    @Override
    public List<OurStoryPart> getAllOurStoryParts() {
        return ourStoryPartDao.getAllOurStoryParts();
    }
}
