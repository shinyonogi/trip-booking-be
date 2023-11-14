package com.shintaronogi.tripPackageBooking.controller;

import com.shintaronogi.tripPackageBooking.model.dto.MajorCategoryDto;
import com.shintaronogi.tripPackageBooking.service.MajorCategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/majorCategories")
public class MajorCategoryController {

    private MajorCategoryService majorCategoryService;

    public MajorCategoryController(MajorCategoryService majorCategoryService) {
        this.majorCategoryService = majorCategoryService;
    }

    @GetMapping
    public ResponseEntity<List<MajorCategoryDto>> getAllMajorCategories() {
        List<MajorCategoryDto> majorCategories = majorCategoryService.getAllMajorCategories();
        return ResponseEntity.ok(majorCategories);
    }
}
