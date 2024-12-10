package com.bitebuddy.bitebuddy.model.service.introService;

import com.bitebuddy.bitebuddy.model.beans.introBeans.OurMission;

import java.util.List;

public interface OurMissionService {
    //Create
    public boolean addOurMission(OurMission ourMission);

    //Read
    public OurMission getOurMissionById(int id);

    //Update
    public boolean updateOurMission(OurMission ourMission);;

    //delete
    public boolean deleteOurMissionById(int id);

    //Custom Queries
    public List<OurMission> getAllOurMissions();

}
