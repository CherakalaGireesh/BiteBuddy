package com.bitebuddy.bitebuddy.bean;

import java.sql.Date;

public class Slideshows {

    public int slideshowId;
    public String slideshowName;
    public String slideshowDescription:
    public String slideShowStatus;
    public Date slideShowCreatedAt;
    public Date slideShowUpdatedAt;

    public int getSlideshowId() {
        return slideshowId;
    }

    public void setSlideshowId(int slideshowId) {
        this.slideshowId = slideshowId;
    }

    public String getSlideshowName() {
        return slideshowName;
    }

    public void setSlideshowName(String slideshowName) {
        this.slideshowName = slideshowName;
    }

    public String getSlideshowDescription() {
        return slideshowDescription;
    }

    public void setSlideshowDescription(String slideshowDescription) {
        this.slideshowDescription = slideshowDescription;
    }

    public String getSlideShowStatus() {
        return slideShowStatus;
    }

    public void setSlideShowStatus(String slideShowStatus) {
        this.slideShowStatus = slideShowStatus;
    }

    public Date getSlideShowCreatedAt() {
        return slideShowCreatedAt;
    }

    public void setSlideShowCreatedAt(Date slideShowCreatedAt) {
        this.slideShowCreatedAt = slideShowCreatedAt;
    }

    public Date getSlideShowUpdatedAt() {
        return slideShowUpdatedAt;
    }

    public void setSlideShowUpdatedAt(Date slideShowUpdatedAt) {
        this.slideShowUpdatedAt = slideShowUpdatedAt;
    }
}
