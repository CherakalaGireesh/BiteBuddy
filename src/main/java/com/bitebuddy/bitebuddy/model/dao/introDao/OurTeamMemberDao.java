package com.bitebuddy.bitebuddy.model.dao.introDao;

import com.bitebuddy.bitebuddy.model.beans.introBeans.OurTeamMember;

import java.util.List;

public interface OurTeamMemberDao {
    //Cread
    public boolean addOurTeamMember(OurTeamMember ourTeamMember);

    //Read
    public OurTeamMember getOurStoryPartById(int id);

    //Update
    public boolean updateOurStoryPart(OurTeamMember ourTeamMember);;

    //delete
    public boolean deleteOurStoryPartById(int id);

    //Custom Queries
    public List<OurTeamMember> getAllOurTeamMembers();
}
