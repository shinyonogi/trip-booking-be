package com.shintaronogi.tripPackageBooking.model.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "courses_spots")
public class CourseSpot {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @ManyToOne
    @JoinColumn(name = "course_id")
    Course course;

    @ManyToOne
    @JoinColumn(name = "spot_id")
    Spot spot;

    public CourseSpot() {}

    public CourseSpot(Course course, Spot spot) {
        this.course = course;
        this.spot = spot;
    }

    public long getId() {
        return id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Spot getSpot() {
        return spot;
    }

    public void setSpot(Spot spot) {
        this.spot = spot;
    }
}
