package com.example.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.dao.Employee;

public interface EmployeeRepo  extends JpaRepository<Employee, Integer>{

}
