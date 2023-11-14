package com.shintaronogi.tripPackageBooking.repository;

import com.shintaronogi.tripPackageBooking.entity.CourseCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseCategoryRepository extends JpaRepository<CourseCategory, Long> {
    List<CourseCategory> findCourseCategoryByMajorCategoryId(Long majorCategoryId);
}
