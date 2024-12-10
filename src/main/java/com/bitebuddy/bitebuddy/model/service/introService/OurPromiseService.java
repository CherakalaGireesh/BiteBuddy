package com.bitebuddy.bitebuddy.model.service.introService;

import com.bitebuddy.bitebuddy.model.beans.introBeans.OurPromise;

import java.util.List;

public interface OurPromiseService {
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
