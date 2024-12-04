package com.bitebuddy.bitebuddy.model.beans.introBeans;

import java.sql.Timestamp;

public class OurTeam {
    private int id;
    private String imageBasePath;
    private String imageName;
    private String name;
    private String role;
    private String caption;
    private String description;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    // Default constructor
    public OurTeam() {}

    // Parameterized constructors
    public OurTeam(String imageName, String name, String role, String caption, String description) {
        this.imageName = imageName;
        this.name = name;
        this.role = role;
        this.caption = caption;
        this.description = description;
    }

    public OurTeam(int id, String imageBasePath, String imageName, String name, String role, String caption, String description, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.imageBasePath = imageBasePath;
        this.imageName = imageName;
        this.name = name;
        this.role = role;
        this.caption = caption;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getter and Setter methods
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    // Overridden toString method
    @Override
    public String toString() {
        return "OurTeam{" +
                "id=" + id +
                ", imageBasePath='" + imageBasePath + '\'' +
                ", imageName='" + imageName + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", caption='" + caption + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
