package com.cablecust.dao;

import java.util.List;

import com.cablecust.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer thCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
}
