package com.shintaronogi.tripPackageBooking.controller;

import com.shintaronogi.tripPackageBooking.dto.CourseCategoryDto;
import com.shintaronogi.tripPackageBooking.service.CourseCategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/courseCategories")
public class CourseCategoryController {

    private CourseCategoryService courseCategoryService;

    public CourseCategoryController(CourseCategoryService courseCategoryService) {
        this.courseCategoryService = courseCategoryService;
    }

    @GetMapping("/{majorCategoryId}")
    public ResponseEntity<List<CourseCategoryDto>> getAllCourseCategoriesByMajorCategoryId(@PathVariable Long majorCategoryId) {
        List<CourseCategoryDto> courseCategories = courseCategoryService.getAllCourseCategoriesByMajorCategoryId(majorCategoryId);
        return ResponseEntity.ok(courseCategories);
    }
}
