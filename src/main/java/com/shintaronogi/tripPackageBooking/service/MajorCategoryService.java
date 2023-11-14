package com.shintaronogi.tripPackageBooking.service;

import com.shintaronogi.tripPackageBooking.model.dto.MajorCategoryDto;
import com.shintaronogi.tripPackageBooking.model.entity.MajorCategory;
import com.shintaronogi.tripPackageBooking.model.factory.MajorCategoryDtoFactory;
import com.shintaronogi.tripPackageBooking.model.repository.MajorCategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MajorCategoryService {

    private MajorCategoryRepository majorCategoryRepository;

    public MajorCategoryService(MajorCategoryRepository majorCategoryRepository) {
        this.majorCategoryRepository = majorCategoryRepository;
    }

    @Transactional(readOnly = true)
    public List<MajorCategoryDto> getAllMajorCategories() {
       List<MajorCategory> majorCategories = majorCategoryRepository.findAll();
       List<MajorCategoryDto> majorCategoriesDtos = majorCategories.stream()
               .map(majorCategory -> MajorCategoryDtoFactory.createMajorCategoryDto(majorCategory))
               .collect(Collectors.toList());

       return majorCategoriesDtos;
    }
}
