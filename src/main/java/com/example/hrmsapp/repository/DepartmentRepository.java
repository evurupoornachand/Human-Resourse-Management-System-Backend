package com.example.hrmsapp.repository;

import com.example.hrmsapp.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
 // Custom queries if needed
}

