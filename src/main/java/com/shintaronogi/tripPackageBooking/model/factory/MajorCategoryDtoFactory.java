package com.shintaronogi.tripPackageBooking.model.factory;

import com.shintaronogi.tripPackageBooking.model.dto.MajorCategoryDto;
import com.shintaronogi.tripPackageBooking.model.entity.MajorCategory;

public class MajorCategoryDtoFactory {

    public static MajorCategoryDto createMajorCategoryDto(MajorCategory majorCategory) {
        return new MajorCategoryDto(majorCategory.getId(), majorCategory.getName());
    }
}
