package com.example.api.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "Topins")
public class Topins {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  //parameters
    private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    // Getters and setters
}

