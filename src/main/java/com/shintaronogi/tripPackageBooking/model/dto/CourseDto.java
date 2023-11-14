package com.shintaronogi.tripPackageBooking.model.dto;

import java.math.BigDecimal;

public class CourseDto {

    private Long id;
    private String name;
    private Float duration;
    private Integer maxSpots;
    private BigDecimal price;
    private CourseCategoryDto courseCategory;

    public CourseDto(Long id, String name, Float duration, Integer maxSpots, BigDecimal price, CourseCategoryDto courseCategory) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.maxSpots = maxSpots;
        this.price = price;
        this.courseCategory = courseCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public Integer getMaxSpots() {
        return maxSpots;
    }

    public void setMaxSpots(Integer maxSpots) {
        this.maxSpots = maxSpots;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public CourseCategoryDto getCourseCategory() {
        return courseCategory;
    }

    public void setCourseCategory(CourseCategoryDto courseCategory) {
        this.courseCategory = courseCategory;
    }
}
