package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.Service;

@RestController
public class HomeController {

	@Autowired
	Service service;

	@PostMapping("/registration")
	public String registration(@RequestBody Employee employee) {
		service.registration(employee);
		return "Registration succesfully.......";
	}

	@GetMapping("/getData/{username}/{password}")
	public Object login(@PathVariable("username") String username, @PathVariable("password") String password) {

		List<Employee> login = service.Login(username, password);
		for (Employee e : login) {
			System.out.println("USERMANE FOR LOGIN:-" + e.getUsername());
			System.out.println("PASSWORD FOR LOGIN:" + e.getPassword());
		}
		if (username.equals(username) && password.equals(password)) {
			List<Employee> emp = service.Login(username, password);

			return emp;

		} else
		{
			return "Incorect Username And Password";
		}

	}

}
