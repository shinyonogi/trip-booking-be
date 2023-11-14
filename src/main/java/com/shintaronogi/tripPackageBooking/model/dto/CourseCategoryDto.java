package com.shintaronogi.tripPackageBooking.model.dto;

public class CourseCategoryDto {

    private Long id;
    private String name;
    private MajorCategoryDto majorCategory;

    public CourseCategoryDto(Long id, String name, MajorCategoryDto majorCategory) {
        this.id = id;
        this.name = name;
        this.majorCategory = majorCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MajorCategoryDto getMajorCategory() {
        return majorCategory;
    }

    public void setMajorCategory(MajorCategoryDto majorCategory) {
        this.majorCategory = majorCategory;
    }
}
