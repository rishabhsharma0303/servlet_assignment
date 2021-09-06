package com.customer.service;

import java.util.List;
import java.util.Optional;

import com.customer.dao.Customer;
import com.customer.dao.CustomerDao;
import com.customer.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDao customerDao;
	
	public CustomerServiceImpl() {
		customerDao=new CustomerDaoImpl();
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerDao.getAllCustomers();
	}

	@Override
	public void deleteCustomer(int id) {
		customerDao.deleteCustomer(id);
	}

	@Override
	public void updateCustomer(int id, Customer customer) {
		customerDao.updateCustomer(id, customer);
	}

	@Override
	public Optional<Customer> getCustomerById(int id) {
		return customerDao.getCustomerById(id);
	}

	@Override
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}

}