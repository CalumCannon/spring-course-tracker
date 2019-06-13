package com.codeclan.coursebooking.coursebookings;

import com.codeclan.coursebooking.coursebookings.models.Booking;
import com.codeclan.coursebooking.coursebookings.models.Course;
import com.codeclan.coursebooking.coursebookings.models.Customer;
import com.codeclan.coursebooking.coursebookings.repositories.BookingRepository.BookingRepository;
import com.codeclan.coursebooking.coursebookings.repositories.CourseRepository.CourseRepository;
import com.codeclan.coursebooking.coursebookings.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoursebookingsApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testFindCourseByRating(){
		Course course = new Course("CodeClan", "Glasgow", 5);
		courseRepository.save(course);

		Customer customer = new Customer("Calum", "Locwhinnoch", 26);
		customerRepository.save(customer);

		Booking booking1 = new Booking("13/06/2019", course, customer);
		Booking booking2 = new Booking("14/06/2019", course, customer);
		bookingRepository.save(booking1);
		bookingRepository.save(booking2);
	}

}
