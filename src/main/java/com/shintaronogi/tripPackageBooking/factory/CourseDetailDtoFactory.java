package com.shintaronogi.tripPackageBooking.factory;

import com.shintaronogi.tripPackageBooking.dto.CourseDetailDto;
import com.shintaronogi.tripPackageBooking.dto.CourseDto;
import com.shintaronogi.tripPackageBooking.dto.SpotDto;

import java.util.List;

public class CourseDetailDtoFactory {

    private CourseDto course;
    private List<SpotDto> spots;

    public static CourseDetailDto createCourseDetailDto(CourseDto course, List<SpotDto> spots) {
        return new CourseDetailDto(course, spots);
    }
}
