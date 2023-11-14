package com.shintaronogi.tripPackageBooking.model.entity;

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

    @ManyToOne
    @JoinColumn(name = "major_category_id")
    MajorCategory majorCategory;

    @Column(name = "name", nullable = false)
    private String name;

    public CourseCategory() {}

    public CourseCategory(String name, MajorCategory majorCategory) {
        this.name = name;
        this.majorCategory = majorCategory;
    }

    public Set<Course> getCourseSet() {
        return courseSet;
    }

    public void setCourseSet(Set<Course> courseSet) {
        this.courseSet = courseSet;
    }

    public MajorCategory getMajorCategory() {
        return majorCategory;
    }

    public void setMajorCategory(MajorCategory majorCategory) {
        this.majorCategory = majorCategory;
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
