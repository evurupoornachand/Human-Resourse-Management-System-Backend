package com.example.hrmsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hrmsapp.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    // Additional query methods can be defined here if needed
}

