package com.example.api.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name = "Mycourse")
public class Mycourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  //parameters
    private String title;
    private String description;
    private String image; // Filename of the course image

    // Getters and setters
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

