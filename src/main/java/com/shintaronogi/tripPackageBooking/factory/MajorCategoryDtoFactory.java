package com.shintaronogi.tripPackageBooking.factory;

import com.shintaronogi.tripPackageBooking.dto.MajorCategoryDto;
import com.shintaronogi.tripPackageBooking.entity.MajorCategory;

public class MajorCategoryDtoFactory {

    public static MajorCategoryDto createMajorCategoryDto(MajorCategory majorCategory) {
        return new MajorCategoryDto(majorCategory.getId(), majorCategory.getName());
    }
}
