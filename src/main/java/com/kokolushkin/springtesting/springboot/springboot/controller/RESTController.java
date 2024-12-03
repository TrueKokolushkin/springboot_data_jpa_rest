package com.kokolushkin.springtesting.springboot.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kokolushkin.springtesting.springboot.springboot.entity.Employee;
import com.kokolushkin.springtesting.springboot.springboot.service.EmployeeService;

@RestController
public class RESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees/name/{name}")
    public List<Employee> findAllByName(@PathVariable("name") String name){
        return employeeService.findAllByName(name);
    }

    @GetMapping("/employees/salaryFirst/{salaryFirst}/salaryLast/{salaryLast}")
    public List<Employee> findAllBySalaryBetween(@PathVariable("salaryFirst") int salaryFirst,
                                                 @PathVariable("salaryLast") int salaryLast) {
        return employeeService.findAllBySalaryBetween(salaryFirst, salaryLast);
    }
}
