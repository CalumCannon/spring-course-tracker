package com.codeclan.coursebooking.coursebookings.repositories.CourseRepository;

import com.codeclan.coursebooking.coursebookings.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
