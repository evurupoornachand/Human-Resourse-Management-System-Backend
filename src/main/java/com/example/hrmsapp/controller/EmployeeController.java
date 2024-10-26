package com.example.hrmsapp.controller;


import com.example.hrmsapp.model.Employee;
import com.example.hrmsapp.repository.EmployeeRepository;
import com.example.hrmsapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {

 @Autowired
 private EmployeeService employeeService;
 
 @Autowired
 private EmployeeRepository employeeRepository;

 @PostMapping
 public ResponseEntity<Employee> registerEmployee(@RequestBody Employee employee) {
     Employee registeredEmployee = employeeService.registerEmployee(employee);
     return ResponseEntity.ok(registeredEmployee);
 }

 @GetMapping
 public ResponseEntity<List<Employee>> getAllEmployees() {
     List<Employee> employees = employeeService.getAllEmployees();
     return ResponseEntity.ok(employees);
 }

 @PutMapping("/transfer/{id}")
 public ResponseEntity<String> transferEmployee(@PathVariable Long id, @RequestBody Map<String, String> request) {
     String newDepartment = request.get("newDepartment");
     Employee employee = employeeRepository.findById(id).orElse(null);

     if (employee != null) {
         employee.setDepartment(newDepartment);
         employeeRepository.save(employee);
         return ResponseEntity.ok("Employee transferred successfully.");
     } else {
         return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found.");
     }
 }
 
 
 
 
 
}

