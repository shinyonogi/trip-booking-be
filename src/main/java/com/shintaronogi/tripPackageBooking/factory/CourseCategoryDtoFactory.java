package com.shintaronogi.tripPackageBooking.factory;

import com.shintaronogi.tripPackageBooking.dto.CourseCategoryDto;
import com.shintaronogi.tripPackageBooking.entity.CourseCategory;

public class CourseCategoryDtoFactory {

    private Long id;
    private String name;

    public static CourseCategoryDto createCourseCategoryDto(CourseCategory courseCategory) {
        return new CourseCategoryDto(courseCategory.getId(), courseCategory.getName());
    }
}
