package com.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.Dao;
import com.demo.model.Employee;

@Service
public class ServiceImpl implements com.demo.service.Service {

	@Autowired
	Dao dao;

	@Override
	public void registration(Employee employee) {
		dao.save(employee);

	}

	@Override
	public List<Employee> Login(String username, String password) {

		List<Employee> emp = dao.finduser(username, password);

		return emp;
	}

}
