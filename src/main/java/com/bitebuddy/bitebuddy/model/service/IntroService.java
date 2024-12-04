package com.bitebuddy.bitebuddy.model.service;

import com.bitebuddy.bitebuddy.model.beans.introBeans.*;

import java.util.List;

public interface IntroService {

    // Create
    public boolean addOurMission(OurMission ourMission);
    public boolean addOurPromise(OurPromise ourPromise);
    public boolean addOurStory(OurStory ourStory);
    public boolean addOurTeam(OurTeam ourTeam);
    public boolean addOurValues(OurValue ourValues);

    // Read
    public OurMission getOurMission(int id);
    public OurPromise getOurPromise(int id);
    public OurStory getOurStory(int id);
    public OurTeam getOurTeam(int id);
    public OurValue getOurValues(int id);

    // Update
    public boolean updateOurMission(OurMission ourMission);
    public boolean updateOurPromise(OurPromise ourPromise);
    public boolean updateOurStory(OurStory ourStory);
    public boolean updateOurTeam(OurTeam ourTeam);
    public boolean updateOurValues(OurValue ourValues);

    // Delete
    public boolean deleteOurMission(int id);
    public boolean deleteOurPromise(int id);
    public boolean deleteOurStory(int id);
    public boolean deleteOurTeam(int id);
    public boolean deleteOurValues(int id);

    // Custom Queries
    public List<OurMission> getAllOurMissions();
    public List<OurPromise> getAllOurPromises();
    public List<OurStory> getAllOurStories();
    public List<OurTeam> getAllOurTeams();
    public List<OurValue> getAllOurValues();

}
