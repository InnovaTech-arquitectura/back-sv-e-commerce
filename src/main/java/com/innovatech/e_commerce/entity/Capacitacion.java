package com.innovatech.e_commerce.entity;

public class Capacitacion {
    private Long id;
    private String title;
    private String date;
    private String modality;
    private String description;
    private String link;
    private double score;  

    public Capacitacion(Long id, String title, String date, String modality, String description, String link, double score) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.modality = modality;
        this.description = description;
        this.link = link;
        this.score = score; 
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
