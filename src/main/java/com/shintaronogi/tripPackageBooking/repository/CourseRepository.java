package com.shintaronogi.tripPackageBooking.repository;

import com.shintaronogi.tripPackageBooking.model.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {}
