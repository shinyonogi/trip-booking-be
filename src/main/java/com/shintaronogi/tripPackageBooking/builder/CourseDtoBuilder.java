package com.shintaronogi.tripPackageBooking.builder;

import com.shintaronogi.tripPackageBooking.dto.CourseCategoryDto;
import com.shintaronogi.tripPackageBooking.dto.CourseDto;
import com.shintaronogi.tripPackageBooking.entity.CourseCategory;
import com.shintaronogi.tripPackageBooking.factory.CourseCategoryDtoFactory;

import java.math.BigDecimal;

public class CourseDtoBuilder {

    private Long id;
    private String name;
    private Float duration;
    private Integer maxSpots;
    private BigDecimal price;
    private CourseCategoryDto courseCategoryDto;

    public CourseDtoBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public CourseDtoBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CourseDtoBuilder setDuration(Float duration) {
        this.duration = duration;
        return this;
    }

    public CourseDtoBuilder setMaxSpots(Integer maxSpots) {
        this.maxSpots = maxSpots;
        return this;
    }

    public CourseDtoBuilder setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public CourseDtoBuilder setCourseCategory(CourseCategory courseCategory) {
        this.courseCategoryDto = CourseCategoryDtoFactory.createCourseCategoryDto(courseCategory);
        return this;
    }

    public CourseDto build() {
        return new CourseDto(id, name, duration, maxSpots, price, courseCategoryDto);
    }
}
