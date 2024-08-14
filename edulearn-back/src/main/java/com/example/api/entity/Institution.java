package com.example.api.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "Institution")
public class Institution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  //parameters
    private String name;
    private String location;
    private String coursesOffered;
    private int studentsEnrolled;
    private String link;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCoursesOffered() {
		return coursesOffered;
	}
	public void setCoursesOffered(String coursesOffered) {
		this.coursesOffered = coursesOffered;
	}
	public int getStudentsEnrolled() {
		return studentsEnrolled;
	}
	public void setStudentsEnrolled(int studentsEnrolled) {
		this.studentsEnrolled = studentsEnrolled;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}

    // Getters and setters
}

