package com.bitebuddy.bitebuddy.model.service.introService;

import com.bitebuddy.bitebuddy.model.beans.introBeans.OurTeamMember;

import java.util.List;

public interface OurTeamMemberService {
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
