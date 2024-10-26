package com.example.hrmsapp.repository;

import com.example.hrmsapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	Employee findById(long id);
}

