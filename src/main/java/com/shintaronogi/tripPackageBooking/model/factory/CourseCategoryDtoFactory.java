package com.shintaronogi.tripPackageBooking.model.factory;

import com.shintaronogi.tripPackageBooking.model.dto.CourseCategoryDto;
import com.shintaronogi.tripPackageBooking.model.entity.CourseCategory;

public class CourseCategoryDtoFactory {

    public static CourseCategoryDto createCourseCategoryDto(CourseCategory courseCategory) {
        return new CourseCategoryDto(
                courseCategory.getId(),
                courseCategory.getName(),
                MajorCategoryDtoFactory.createMajorCategoryDto(courseCategory.getMajorCategory())
        );
    }
}
