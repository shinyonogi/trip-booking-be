package com.shintaronogi.tripPackageBooking.model.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "major_categories")
public class MajorCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToMany(mappedBy = "majorCategory", fetch = FetchType.LAZY)
    Set<CourseCategory> courseCategories;

    @Column(name = "name")
    private String name;

    public MajorCategory() {}

    public MajorCategory(String name, Set<CourseCategory> courseCategories) {
        this.name = name;
        this.courseCategories = courseCategories;
    }

    public void setCourseCategories(Set<CourseCategory> courseCategories) {
        this.courseCategories = courseCategories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public Set<CourseCategory> getCourseCategories() {
        return courseCategories;
    }

    public String getName() {
        return name;
    }
}
