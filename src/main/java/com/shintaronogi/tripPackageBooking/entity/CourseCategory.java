package com.shintaronogi.tripPackageBooking.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "course_categories")
public class CourseCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @OneToMany(mappedBy = "courseCategory", fetch = FetchType.LAZY)
    Set<Course> courseSet;

    @Column(name = "name", nullable = false)
    private String name;

    public CourseCategory() {}

    public CourseCategory(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CourseCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
