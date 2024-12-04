package com.bitebuddy.bitebuddy.model.beans.introBeans;

import java.sql.Timestamp;

public class WhyChooseUs {

    private int id;
    private String imageBasePath;
    private String imagePath;
    private String imageName;
    private String caption;
    private String description;
    private String backgroundColor;
    private Timestamp createAt;
    private Timestamp updateAt;

    //Default constructor
    public WhyChooseUs() {}

    //Parameterized constructors
    public WhyChooseUs(String imagePath, String imageName, String caption, String description, String backgroundColor) {
        this.imagePath = imagePath;
        this.imageName = imageName;
        this.caption = caption;
        this.description = description;
        this.backgroundColor = backgroundColor;
    }

    public WhyChooseUs(int id, String imageBasePath, String imagePath, String imageName, String caption, String description, String backgroundColor, Timestamp createAt, Timestamp updateAt) {
        this.id = id;
        this.imageBasePath = imageBasePath;
        this.imagePath = imagePath;
        this.imageName = imageName;
        this.caption = caption;
        this.description = description;
        this.backgroundColor = backgroundColor;
        this.createAt = createAt;
        this.updateAt = updateAt;
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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
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

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "WhyChooseUs{" +
                "id=" + id +
                ", imageBasePath='" + imageBasePath + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", imageName='" + imageName + '\'' +
                ", caption='" + caption + '\'' +
                ", description='" + description + '\'' +
                ", backgroundColor='" + backgroundColor + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}

