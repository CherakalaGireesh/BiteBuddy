package com.bitebuddy.bitebuddy.controller;

import com.bitebuddy.bitebuddy.model.beans.introBeans.*;
import com.bitebuddy.bitebuddy.model.dao.introDao.*;
import com.bitebuddy.bitebuddy.model.service.introService.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class IntroServlet extends HttpServlet {
    private IntroSlideService introSlideService;
    private HowItWorkService howItWorkService;
    private OurMissionService ourMissionService;
    private OurStoryPartService ourStoryPartService;
    private OurValueService ourValueService;
    private OurTeamMemberService ourTeamMemberService;
    private WhyChooseUsService whyChooseUsService;
    private OurPromiseService ourPromiseService;
    private CustomerReviewService customerReviewService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        introSlideService = new IntroSlideServiceImpl();
        howItWorkService = new HowItWorkServiceImpl();
        ourMissionService = new OurMissionServiceImpl();
        ourStoryPartService = new OurStoryPartServiceImpl();
        ourValueService = new OurValueServiceImpl();
        ourTeamMemberService = new OurTeamMemberServiceImpl();
        whyChooseUsService = new WhyChooseUsServiceImpl();
        ourPromiseService = new OurPromiseServiceImpl();
        customerReviewService = new CustomerReviewServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<IntroSlide> introSlides = introSlideService.getAllIntroSlides();
        List<HowItWork> howItWorks = howItWorkService.getAllHowItWorks();
        List<OurMission> ourMissions = ourMissionService.getAllOurMissions();
        List<OurStoryPart> ourStoryParts = ourStoryPartService.getAllOurStoryParts();
        List<OurValue> ourValues = ourValueService.getAllOurValues();
        List<OurTeamMember> ourTeamMembers = ourTeamMemberService.getAllOurTeamMembers();
        List<WhyChooseUsItem> whyChooseUsItems = whyChooseUsService.getAllWhyChooseUsItems();
        List<CustomerReview> customerReviews = customerReviewService.getAllCustomerReviews();
        request.setAttribute("introSlides", introSlides);
        request.setAttribute("howItWorks", howItWorks);
        request.setAttribute("ourMissions", ourMissions);
        request.setAttribute("ourStoryParts", ourStoryParts);
        request.setAttribute("ourValues", ourValues);;
        request.setAttribute("ourTeamMembers", ourTeamMembers);
        request.setAttribute("whyChooseUsItems", whyChooseUsItems);
        request.setAttribute("customerReviews", customerReviews);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/view/intro_page.jsp");
        requestDispatcher.forward(request, response);

    }
}
