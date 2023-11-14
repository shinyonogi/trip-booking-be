package com.shintaronogi.tripPackageBooking.repository;

import com.shintaronogi.tripPackageBooking.entity.Spot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SpotRepository extends JpaRepository<Spot, Long> {
    @Query("SELECT s FROM Spot s JOIN s.courseSpotSet cs WHERE cs.course.id = :courseId")
    List<Spot> findSpotsByCourseId(@Param("courseId") Long courseId);
}
