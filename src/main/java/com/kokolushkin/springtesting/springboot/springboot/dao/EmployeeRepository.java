package com.kokolushkin.springtesting.springboot.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.kokolushkin.springtesting.springboot.springboot.entity.Employee;
import java.util.List;

@Service
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

    public List<Employee> findAllByName(String name);

    public List<Employee> findAllBySalaryBetween(int salaryFirst, int salaryLast);
}
