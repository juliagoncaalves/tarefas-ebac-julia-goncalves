package org.example.controllers;

import org.example.entities.Employee;
import org.example.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping
    private List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @PostMapping
    private Employee create(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
}
