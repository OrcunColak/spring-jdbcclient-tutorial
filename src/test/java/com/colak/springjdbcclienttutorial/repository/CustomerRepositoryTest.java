package com.colak.springjdbcclienttutorial.repository;

import com.colak.springjdbcclienttutorial.model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    void getAllCustomer() {
        List<Customer> customerList = customerRepository.getAllCustomer();
        assertEquals(1, customerList.size());

        Customer firstCustomer = customerList.getFirst();
        LocalDate expected = LocalDate.of(1990, 5, 15);
        assertEquals(expected, firstCustomer.birthday());
    }

}
