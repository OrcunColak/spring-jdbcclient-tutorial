package com.colak.springjdbcclienttutorial.repository;

import com.colak.springjdbcclienttutorial.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {

    List<Customer> getAllCustomer();

    Optional<Customer> getCustomerById(int id);

    void insert(Customer customer);

    void update(int id, Customer customer);

    void delete(int id);
}
