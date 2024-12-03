package com.kokolushkin.springtesting.springboot.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kokolushkin.springtesting.springboot.springboot.dao.EmployeeRepository;
import com.kokolushkin.springtesting.springboot.springboot.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAllByName(String name) {
        return employeeRepository.findAllByName(name);
    }

    @Override
    public List<Employee> findAllBySalaryBetween(int salaryFirst, int salaryLast) {
        return employeeRepository.findAllBySalaryBetween(salaryFirst, salaryLast);
    }
}
