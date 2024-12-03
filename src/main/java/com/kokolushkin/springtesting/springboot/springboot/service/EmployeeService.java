package com.kokolushkin.springtesting.springboot.springboot.service;

import java.util.List;

import com.kokolushkin.springtesting.springboot.springboot.entity.Employee;

public interface EmployeeService {

    public List<Employee> findAllByName(String name);

    public List<Employee> findAllBySalaryBetween(int salaryFirst, int salaryLast);
}
