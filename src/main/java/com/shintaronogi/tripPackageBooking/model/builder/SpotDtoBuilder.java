package com.shintaronogi.tripPackageBooking.model.builder;

import com.shintaronogi.tripPackageBooking.model.dto.SpotDto;

public class SpotDtoBuilder {

    private Long id;
    private String name;
    private String description;
    private String imagePath;

    public SpotDtoBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public SpotDtoBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public SpotDtoBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public SpotDtoBuilder setImagePath(String imagePath) {
        this.imagePath = imagePath;
        return this;
    }

    public SpotDto build() {
        return new SpotDto(id, name, description, imagePath);
    }
}
