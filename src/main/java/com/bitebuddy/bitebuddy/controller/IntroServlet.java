package com.bitebuddy.bitebuddy.controller;

import com.bitebuddy.bitebuddy.model.beans.introBeans.*;
import com.bitebuddy.bitebuddy.model.dao.introDao.IntroSlideDao;
import com.bitebuddy.bitebuddy.model.dao.introDao.IntroSlideDaoImpl;
import com.bitebuddy.bitebuddy.model.service.IntroService;
import com.bitebuddy.bitebuddy.model.service.IntroServiceImpl;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.awt.desktop.OpenURIEvent;
import java.io.IOException;
import java.util.List;

public class IntroServlet extends HttpServlet {

    private static IntroService introService = new IntroServiceImpl();

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
