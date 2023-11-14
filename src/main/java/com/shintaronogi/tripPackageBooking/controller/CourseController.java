package com.shintaronogi.tripPackageBooking.controller;

import com.shintaronogi.tripPackageBooking.dto.CourseDetailDto;
import com.shintaronogi.tripPackageBooking.service.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<CourseDetailDto>> getCourseDetailsByCategory(@PathVariable Long categoryId) {
        List<CourseDetailDto> courseDetails = courseService.getCourseDetailsByCategory(categoryId);
        return ResponseEntity.ok(courseDetails);
    }
}
