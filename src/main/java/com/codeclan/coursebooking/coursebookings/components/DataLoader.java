package com.codeclan.coursebooking.coursebookings.components;

import com.codeclan.coursebooking.coursebookings.models.Booking;
import com.codeclan.coursebooking.coursebookings.models.Course;
import com.codeclan.coursebooking.coursebookings.models.Customer;
import com.codeclan.coursebooking.coursebookings.repositories.BookingRepository.BookingRepository;
import com.codeclan.coursebooking.coursebookings.repositories.CourseRepository.CourseRepository;
import com.codeclan.coursebooking.coursebookings.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){

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
