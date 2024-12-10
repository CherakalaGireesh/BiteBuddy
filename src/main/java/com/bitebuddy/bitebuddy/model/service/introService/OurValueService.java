package com.bitebuddy.bitebuddy.model.service.introService;

import com.bitebuddy.bitebuddy.model.beans.introBeans.OurValue;

import java.util.List;

public interface OurValueService {
    public boolean addOurMission(OurValue ourValue);

    //Read
    public OurValue getOurMissionById(int id);

    //Update
    public boolean updateOurMission(OurValue ourValue);;

    //delete
    public boolean deleteOurMissionById(int id);

    //Custom Queries
    public List<OurValue> getAllOurValues();
}
