package com.example.hrmsapp.service;


import com.example.hrmsapp.model.Employee;
import com.example.hrmsapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

 @Autowired
 private EmployeeRepository employeeRepository;

 public Employee registerEmployee(Employee employee) {
     return employeeRepository.save(employee);
 }

 public List<Employee> getAllEmployees() {
     return employeeRepository.findAll();
 }

 public Employee updateEmployeeDepartment(Long employeeId, String newDepartment) {
     Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);
     if (optionalEmployee.isPresent()) {
         Employee employee = optionalEmployee.get();
         employee.setDepartment(newDepartment);
         return employeeRepository.save(employee);
     } else {
         throw new RuntimeException("Employee not found");
     }
 }
 
 
}

