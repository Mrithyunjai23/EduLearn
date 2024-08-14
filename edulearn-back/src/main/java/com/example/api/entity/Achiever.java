package com.example.api.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "Topach")
public class Achiever {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //parameters
    private Long id;
    private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

   
}

