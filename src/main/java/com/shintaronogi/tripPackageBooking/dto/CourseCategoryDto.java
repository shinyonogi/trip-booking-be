package com.shintaronogi.tripPackageBooking.dto;

public class CourseCategoryDto {

    private Long id;
    private String name;

    public CourseCategoryDto(Long id, String name) {
        this.id = id;
        this.name = name;
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
}
