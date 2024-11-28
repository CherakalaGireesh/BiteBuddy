package com.bitebuddy.bitebuddy.controller;

import com.bitebuddy.bitebuddy.model.service.IntroService;
import com.bitebuddy.bitebuddy.model.service.IntroServiceImpl;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class IntroServlet extends HttpServlet {

    private static IntroService introService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        introService = new IntroServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
