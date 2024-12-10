package com.bitebuddy.bitebuddy.model.service.introService;

import com.bitebuddy.bitebuddy.model.beans.introBeans.OurPromise;
import com.bitebuddy.bitebuddy.model.dao.introDao.OurPromiseDao;
import com.bitebuddy.bitebuddy.model.dao.introDao.OurPromiseDaoImpl;

import java.util.List;

public class OurPromiseServiceImpl implements OurPromiseService{
    private OurPromiseDao ourPromiseDao;

    public OurPromiseServiceImpl() {
        this.ourPromiseDao = new OurPromiseDaoImpl();
    }

    @Override
    public boolean addOurPromise(OurPromise ourPromise) {
        return ourPromiseDao.addOurPromise(ourPromise);
    }

    @Override
    public OurPromise getOurPromiseById(int id) {
        return ourPromiseDao.getOurPromiseById(id);
    }

    @Override
    public boolean updateOurPromise(OurPromise ourPromise) {
        return ourPromiseDao.updateOurPromise(ourPromise);
    }

    @Override
    public boolean deleteOurPromiseById(int id) {
        return ourPromiseDao.deleteOurPromiseById(id);
    }

    @Override
    public List<OurPromise> getAllOurPromises() {
        return ourPromiseDao.getAllOurPromises();
    }
}
