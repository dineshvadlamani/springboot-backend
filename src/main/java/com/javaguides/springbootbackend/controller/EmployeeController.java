package com.javaguides.springbootbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaguides.springbootbackend.model.Employee;
import com.javaguides.springbootbackend.repository.Employeerepository;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private Employeerepository employeerepository;

    // get all employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeerepository.findAll();
    }
}
