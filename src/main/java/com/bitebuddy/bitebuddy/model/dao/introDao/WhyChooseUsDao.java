package com.bitebuddy.bitebuddy.model.dao.introDao;

import com.bitebuddy.bitebuddy.model.beans.introBeans.OurMission;
import com.bitebuddy.bitebuddy.model.beans.introBeans.WhyChooseUsItem;

import java.util.List;

public interface WhyChooseUsDao {
    //Create
    public boolean addOurMission(WhyChooseUsItem whyChooseUsItem);

    //Read
    public WhyChooseUsItem getOurMissionById(int id);

    //Update
    public boolean updateOurMission(WhyChooseUsItem whyChooseUsItem);;

    //delete
    public boolean deleteOurMissionById(int id);

    //Custom Queries
    public List<WhyChooseUsItem> getAllWhyChooseUsItems();
}
