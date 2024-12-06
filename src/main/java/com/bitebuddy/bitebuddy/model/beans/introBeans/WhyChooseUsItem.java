package com.bitebuddy.bitebuddy.model.beans.introBeans;

import java.sql.Timestamp;

public class WhyChooseUsItem {

    private int id;
    private String imageBasePath;
    private String imageName;
    private String caption;
    private String description;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    //Default constructor
    public WhyChooseUsItem() {}

    //Parameterized constructors
    public WhyChooseUsItem(String imageName, String caption, String description) {
        this.imageName = imageName;
        this.caption = caption;
        this.description = description;
    }

    public WhyChooseUsItem(int id, String imageBasePath, String imageName, String caption, String description, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.imageBasePath = imageBasePath;
        this.imageName = imageName;
        this.caption = caption;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageBasePath() {
        return imageBasePath;
    }

    public void setImageBasePath(String imageBasePath) {
        this.imageBasePath = imageBasePath;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "WhyChooseUsItem{" +
                "id=" + id +
                ", imageBasePath='" + imageBasePath + '\'' +
                ", imageName='" + imageName + '\'' +
                ", caption='" + caption + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}

