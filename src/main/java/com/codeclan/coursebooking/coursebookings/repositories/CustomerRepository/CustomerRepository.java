package com.codeclan.coursebooking.coursebookings.repositories.CustomerRepository;

import com.codeclan.coursebooking.coursebookings.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
