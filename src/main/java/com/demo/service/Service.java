package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface Service {

	void registration(Employee employee);

	List<Employee> Login(String username, String password);

}
