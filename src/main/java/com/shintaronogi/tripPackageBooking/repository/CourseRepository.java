package com.shintaronogi.tripPackageBooking.repository;

import com.shintaronogi.tripPackageBooking.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByCourseCategoryId(Long courseCategoryId);
}
