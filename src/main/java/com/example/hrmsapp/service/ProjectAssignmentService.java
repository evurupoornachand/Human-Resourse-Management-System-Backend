package com.example.hrmsapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsapp.model.ProjectAssignment;
import com.example.hrmsapp.repository.ProjectAssignmentRepository;

@Service
public class ProjectAssignmentService {
    
    @Autowired
    private ProjectAssignmentRepository repository;

    public ProjectAssignment assignProject(Long employeeId, Long projectId) {
        ProjectAssignment assignment = new ProjectAssignment(employeeId, projectId);
        return repository.save(assignment);
    }
}

