package com.bitebuddy.bitebuddy.model.dao.introDao;


import com.bitebuddy.bitebuddy.model.beans.introBeans.OurStoryPart;

import java.util.List;

public interface OurStoryPartDao {
    public boolean addOurStoryPart(OurStoryPart ourStoryPart);

    //Read
    public OurStoryPart getOurStoryPartById(int id);

    //Update
    public boolean updateOurStoryPart(OurStoryPart ourStoryPart);;

    //delete
    public boolean deleteOurStoryPartById(int id);

    //Custom Queries
    public List<OurStoryPart> getAllOurStoryParts();
}
