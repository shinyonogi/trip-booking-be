package com.shintaronogi.tripPackageBooking.model.factory;

import com.shintaronogi.tripPackageBooking.model.dto.CourseDetailDto;
import com.shintaronogi.tripPackageBooking.model.dto.CourseDto;
import com.shintaronogi.tripPackageBooking.model.dto.SpotDto;

import java.util.List;

public class CourseDetailDtoFactory {

    public static CourseDetailDto createCourseDetailDto(CourseDto course, List<SpotDto> spots) {
        return new CourseDetailDto(course, spots);
    }
}
