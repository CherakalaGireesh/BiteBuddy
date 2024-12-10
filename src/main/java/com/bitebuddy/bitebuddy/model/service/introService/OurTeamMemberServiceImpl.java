package com.bitebuddy.bitebuddy.model.service.introService;

import com.bitebuddy.bitebuddy.model.beans.introBeans.OurTeamMember;
import com.bitebuddy.bitebuddy.model.dao.introDao.OurTeamMemberDao;
import com.bitebuddy.bitebuddy.model.dao.introDao.OurTeamMemberDaoImpl;

import java.util.List;

public class OurTeamMemberServiceImpl implements OurTeamMemberService {
    private OurTeamMemberDao ourTeamMemberDao;

    public OurTeamMemberServiceImpl() {
        this.ourTeamMemberDao = new OurTeamMemberDaoImpl();
    }

    @Override
    public boolean addOurTeamMember(OurTeamMember ourTeamMember) {
        return ourTeamMemberDao.addOurTeamMember(ourTeamMember);
    }

    @Override
    public OurTeamMember getOurStoryPartById(int id) {
        return ourTeamMemberDao.getOurStoryPartById(id);
    }

    @Override
    public boolean updateOurStoryPart(OurTeamMember ourTeamMember) {
        return ourTeamMemberDao.updateOurStoryPart(ourTeamMember);
    }

    @Override
    public boolean deleteOurStoryPartById(int id) {
        return ourTeamMemberDao.deleteOurStoryPartById(id);
    }

    @Override
    public List<OurTeamMember> getAllOurTeamMembers() {
        return ourTeamMemberDao.getAllOurTeamMembers();
    }
}
