package com.codeclan.coursebooking.coursebookings.repositories.CourseRepository;

import com.codeclan.coursebooking.coursebookings.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    public List<Course> findCoursesByStarRating(int rating);

}
