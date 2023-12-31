package com.shintaronogi.tripPackageBooking.service;

import com.shintaronogi.tripPackageBooking.model.dto.CourseCategoryDto;
import com.shintaronogi.tripPackageBooking.model.entity.CourseCategory;
import com.shintaronogi.tripPackageBooking.model.factory.CourseCategoryDtoFactory;
import com.shintaronogi.tripPackageBooking.model.repository.CourseCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseCategoryService {

    CourseCategoryRepository courseCategoryRepository;

    public CourseCategoryService(CourseCategoryRepository courseCategoryRepository) {
        this.courseCategoryRepository = courseCategoryRepository;
    }

    public List<CourseCategoryDto> getAllCourseCategoriesByMajorCategoryId(Long majorCategoryId) {
        List<CourseCategory> courseCategories = courseCategoryRepository.findCourseCategoryByMajorCategoryId(majorCategoryId);
        List<CourseCategoryDto> courseCategoriesDtos = courseCategories.stream()
                .map(courseCategory -> CourseCategoryDtoFactory.createCourseCategoryDto(courseCategory))
                .collect(Collectors.toList());

        return courseCategoriesDtos;
    }
}
