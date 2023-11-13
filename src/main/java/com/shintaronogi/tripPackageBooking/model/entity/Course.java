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

    @OneToMany(mappedBy = "course")
    Set<CoursesSpots> coursesSpots;

    @Column(name = "name")
    private String name;

    @Column(name = "duration")
    private float duration;

    @Column(name = "max_spots")
    private int maxSpots;

    @Column(name = "price")
    private BigDecimal price;

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
