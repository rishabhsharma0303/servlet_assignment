package com.customer.dao;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {
	public List<Customer> getAllCustomers();
	public void deleteCustomer(int id);
	public void updateCustomer(int id, Customer customer);
	public Optional<Customer> getCustomerById(int id);
	public void addCustomer(Customer customer);
}
