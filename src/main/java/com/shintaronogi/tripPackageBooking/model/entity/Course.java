package com.shintaronogi.tripPackageBooking.model.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    Set<CourseSpot> coursesSpots;

    @ManyToOne
    @JoinColumn(name = "course_category_id")
    CourseCategory courseCategory;

    @Column(name = "name")
    private String name;

    @Column(name = "duration")
    private float duration;

    @Column(name = "max_spots")
    private int maxSpots;

    @Column(name = "price")
    private BigDecimal price;

    public Course() {}

    public Course(Set<CourseSpot> coursesSpots, CourseCategory courseCategory, String name, float duration, int maxSpots, BigDecimal price) {
        this.coursesSpots = coursesSpots;
        this.courseCategory = courseCategory;
        this.name = name;
        this.duration = duration;
        this.maxSpots = maxSpots;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public Set<CourseSpot> getCoursesSpots() {
        return coursesSpots;
    }

    public CourseCategory getCourseCategory() {
        return courseCategory;
    }

    public String getName() {
        return name;
    }

    public float getDuration() {
        return duration;
    }

    public int getMaxSpots() {
        return maxSpots;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", maxSpots=" + maxSpots +
                ", price=" + price +
                '}';
    }
}
