package com.bitebuddy.bitebuddy.model.beans;

import java.sql.Timestamp;

public class HowItWorks {

    private Long id;
    private String imageBasePath;
    private String imageName;
    private String caption;
    private String description;
    private String userAction;
    private String additionalInfo;
    private String tip;
    private String status;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    // Default constructor
    public HowItWorks() {}

    // Parameterized constructor
    public HowItWorks(Long id, String imageBasePath, String imageName, String caption, String description,
                      String userAction, String additionalInfo, String tip, String status,
                      Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.imageBasePath = imageBasePath;
        this.imageName = imageName;
        this.caption = caption;
        this.description = description;
        this.userAction = userAction;
        this.additionalInfo = additionalInfo;
        this.tip = tip;
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

    public String getUserAction() {
        return userAction;
    }

    public void setUserAction(String userAction) {
        this.userAction = userAction;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
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
        return "HowItWorks{" +
                "id=" + id +
                ", imageBasePath='" + imageBasePath + '\'' +
                ", imageName='" + imageName + '\'' +
                ", caption='" + caption + '\'' +
                ", description='" + description + '\'' +
                ", userAction='" + userAction + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", tip='" + tip + '\'' +
                ", status='" + status + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

}