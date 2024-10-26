package com.example.hrmsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrmsapp.model.ProjectAssignment;

public interface ProjectAssignmentRepository extends JpaRepository<ProjectAssignment, Long> {
}

