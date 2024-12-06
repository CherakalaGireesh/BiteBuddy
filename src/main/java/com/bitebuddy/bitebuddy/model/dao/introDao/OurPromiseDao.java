package com.bitebuddy.bitebuddy.model.dao.introDao;

import com.bitebuddy.bitebuddy.model.beans.introBeans.OurMission;
import com.bitebuddy.bitebuddy.model.beans.introBeans.OurPromise;

import java.util.List;

public interface OurPromiseDao {
    //Create
    public boolean addOurPromise(OurPromise ourPromise);

    //Read
    public OurPromise getOurPromiseById(int id);

    //Update
    public boolean updateOurPromise(OurPromise ourPromise);;

    //delete
    public boolean deleteOurPromiseById(int id);

    //Custom Queries
    public List<OurPromise> getAllOurPromises();
}
