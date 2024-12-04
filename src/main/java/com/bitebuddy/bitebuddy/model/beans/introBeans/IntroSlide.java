package com.bitebuddy.bitebuddy.model.beans.introBeans;

import java.sql.Timestamp;

public class IntroSlide {

    private Long id;
    private String imageBasePath;
    private String imageName;
    private String caption;
    private String description;
    private String features;
    private String keywords;
    private String status;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    // Default constructor
    public IntroSlide() {}

    // Parameterized constructor

    public IntroSlide(Long id, String imageBasePath, String imageName, String caption, String description, String features, String keywords, String status, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.imageBasePath = imageBasePath;
        this.imageName = imageName;
        this.caption = caption;
        this.description = description;
        this.features = features;
        this.keywords = keywords;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        return "IntroSlide{" +
                "id=" + id +
                ", imageBasePath='" + imageBasePath + '\'' +
                ", imageName='" + imageName + '\'' +
                ", caption='" + caption + '\'' +
                ", description='" + description + '\'' +
                ", features='" + features + '\'' +
                ", keywords='" + keywords + '\'' +
                ", status='" + status + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
