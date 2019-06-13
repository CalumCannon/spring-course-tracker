package com.codeclan.coursebooking.coursebookings.repositories.BookingRepository;

import com.codeclan.coursebooking.coursebookings.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
