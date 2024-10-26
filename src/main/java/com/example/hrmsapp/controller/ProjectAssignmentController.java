package com.example.hrmsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.hrmsapp.service.ProjectAssignmentService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ProjectAssignmentController {

    @Autowired
    private ProjectAssignmentService assignmentService;

    @PostMapping("/assignProject")
    public ResponseEntity<String> assignProject(@RequestBody ProjectAssignmentRequest request) {
        assignmentService.assignProject(request.getEmployeeId(), request.getProjectId());
        return ResponseEntity.ok("Project assigned successfully!");
    }
}