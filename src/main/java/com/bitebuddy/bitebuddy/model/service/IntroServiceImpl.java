package com.bitebuddy.bitebuddy.model.service;

import com.bitebuddy.bitebuddy.model.beans.introBeans.*;

import java.util.List;

public class IntroServiceImpl implements IntroService {
    private static IntroDao introDao = new IntroDaoImpl();

    @Override
    public boolean addOurMission(OurMission ourMission) {
        return false;
    }

    @Override
    public boolean addOurPromise(OurPromise ourPromise) {
        return false;
    }

    @Override
    public boolean addOurStory(OurStory ourStory) {
        return false;
    }

    @Override
    public boolean addOurTeam(OurTeam ourTeam) {
        return false;
    }

    @Override
    public boolean addOurValues(OurValue ourValues) {
        return false;
    }

    @Override
    public OurMission getOurMission(int id) {
        return null;
    }

    @Override
    public OurPromise getOurPromise(int id) {
        return null;
    }

    @Override
    public OurStory getOurStory(int id) {
        return null;
    }

    @Override
    public OurTeam getOurTeam(int id) {
        return null;
    }

    @Override
    public OurValue getOurValues(int id) {
        return null;
    }

    @Override
    public boolean updateOurMission(OurMission ourMission) {
        return false;
    }

    @Override
    public boolean updateOurPromise(OurPromise ourPromise) {
        return false;
    }

    @Override
    public boolean updateOurStory(OurStory ourStory) {
        return false;
    }

    @Override
    public boolean updateOurTeam(OurTeam ourTeam) {
        return false;
    }

    @Override
    public boolean updateOurValues(OurValue ourValues) {
        return false;
    }

    @Override
    public boolean deleteOurMission(int id) {
        return false;
    }

    @Override
    public boolean deleteOurPromise(int id) {
        return false;
    }

    @Override
    public boolean deleteOurStory(int id) {
        return false;
    }

    @Override
    public boolean deleteOurTeam(int id) {
        return false;
    }

    @Override
    public boolean deleteOurValues(int id) {
        return false;
    }

    @Override
    public List<OurMission> getAllOurMissions() {
        return introDao.getAllOurMissions();
    }

    @Override
    public List<OurPromise> getAllOurPromises() {
        return introDao.getAllOurPromises();
    }

    @Override
    public List<OurStory> getAllOurStories() {
        return introDao.getAllOurStories();
    }

    @Override
    public List<OurTeam> getAllOurTeams() {
        return introDao.getAllOurTeams();
    }

    @Override
    public List<OurValue> getAllOurValues() {
        return introDao.getAllOurValues();
    }
}
