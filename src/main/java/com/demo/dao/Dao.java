package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;
import java.lang.String;
import java.util.List;

@Repository
public interface Dao extends JpaRepository<Employee, Integer> {

	@Query("from Employee where user=?1 and pass=?2")
	List<Employee> finduser(String username, String password);

}
