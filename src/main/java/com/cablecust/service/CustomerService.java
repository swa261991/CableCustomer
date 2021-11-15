package com.cablecust.service;

import com.cablecust.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomers();

    public void saveCustomer(Customer thCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);
}
