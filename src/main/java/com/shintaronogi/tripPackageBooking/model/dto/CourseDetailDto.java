package com.shintaronogi.tripPackageBooking.model.dto;

import java.util.List;

public class CourseDetailDto {

    private CourseDto course;
    private List<SpotDto> spots;

    public CourseDetailDto(CourseDto course, List<SpotDto> spots) {
        this.course = course;
        this.spots = spots;
    }

    public CourseDto getCourse() {
        return course;
    }

    public void setCourse(CourseDto course) {
        this.course = course;
    }

    public List<SpotDto> getSpots() {
        return spots;
    }

    public void setSpots(List<SpotDto> spots) {
        this.spots = spots;
    }
}
