package com.bitebuddy.bitebuddy.controller;

import com.bitebuddy.bitebuddy.model.beans.introBeans.OurValue;
import com.bitebuddy.bitebuddy.model.dao.introDao.*;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class IntroServlet extends HttpServlet {

    //private static IntroService introService = new IntroServiceImpl();

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IntroSlideDao introSlideDao = new IntroSlideDaoImpl();
        System.out.println(introSlideDao.getAllIntroSlides());
        HowItWorkDao howItWorkDao = new HowItWorksDaoImpl();
        System.out.println(howItWorkDao.getAllHowItWorks());
        OurMissionDao ourMissionDao = new OurMissionDaoImpl();
        System.out.println(ourMissionDao.getAllOurMissions());
        OurPromiseDao ourPromiseDao = new OurPromiseDaoImpl();
        System.out.println(ourPromiseDao.getAllOurPromises());
        OurStoryPartDao ourStoryPartDao = new OurStoryPartDaoImpl();
        System.out.println(ourStoryPartDao.getAllOurStoryParts());
        OurTeamMemberDao ourTeamMemberDao = new OurTeamMemberDaoImpl();
        System.out.println(ourTeamMemberDao.getAllOurTeamMembers());
        OurValueDao ourValueDao = new OurValueDaoImpl();
        System.out.println(ourValueDao.getAllOurValues());
        WhyChooseUsDao whyChooseUsDao = new WhyChooseUsDaoImpl();
        System.out.println(whyChooseUsDao.getAllWhyChooseUsItems());
    }
}
