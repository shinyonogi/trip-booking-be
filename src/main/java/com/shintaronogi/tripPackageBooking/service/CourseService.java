package com.shintaronogi.tripPackageBooking.service;

import com.shintaronogi.tripPackageBooking.builder.CourseDtoBuilder;
import com.shintaronogi.tripPackageBooking.builder.SpotDtoBuilder;
import com.shintaronogi.tripPackageBooking.dto.CourseDetailDto;
import com.shintaronogi.tripPackageBooking.dto.CourseDto;
import com.shintaronogi.tripPackageBooking.dto.SpotDto;
import com.shintaronogi.tripPackageBooking.entity.Course;
import com.shintaronogi.tripPackageBooking.entity.Spot;
import com.shintaronogi.tripPackageBooking.factory.CourseDetailDtoFactory;
import com.shintaronogi.tripPackageBooking.repository.CourseRepository;
import com.shintaronogi.tripPackageBooking.repository.SpotRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseService {

    private final CourseRepository courseRepository;
    private final SpotRepository spotRepository;

    public CourseService(CourseRepository courseRepository, SpotRepository spotRepository) {
        this.courseRepository = courseRepository;
        this.spotRepository = spotRepository;
    }

    @Transactional(readOnly = true)
    public List<CourseDetailDto> getCourseDetailsByCategory(Long categoryId) {
        List<Course> courses = courseRepository.findByCourseCategoryId(categoryId);
        List<CourseDetailDto> courseDetails = new ArrayList<>();

        for (Course course : courses) {
            CourseDto courseDto = new CourseDtoBuilder()
                    .setId(course.getId())
                    .setName(course.getName())
                    .setDuration(course.getDuration())
                    .setMaxSpots(course.getMaxSpots())
                    .setPrice(course.getPrice())
                    .setCourseCategory(course.getCourseCategory())
                    .build();

            List<Spot> spots = spotRepository.findSpotsByCourseId((course.getId()));
            List<SpotDto> spotsDtos = spots.stream()
                    .map(spot -> new SpotDtoBuilder()
                            .setId(spot.getId())
                            .setName(spot.getName())
                            .setDescription(spot.getDescription())
                            .setImagePath(spot.getImagePath())
                            .build())
                    .collect(Collectors.toList());

            courseDetails.add(CourseDetailDtoFactory.createCourseDetailDto(courseDto, spotsDtos));
        }

        return courseDetails;
    }
}
