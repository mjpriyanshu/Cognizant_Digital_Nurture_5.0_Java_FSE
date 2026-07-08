package com.cognizant.hibernatequerylearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.hibernatequerylearn.model.Employee;
import com.cognizant.hibernatequerylearn.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    /*
     * ==========================================================
     * Spring - Data - JPA - Hands on
     * 
     * Module 2 - Get All Permanent Employees using HQL
     * ==========================================================
     */

    @Transactional
    public List<Employee> getAllPermanentEmployees() {

        return employeeRepository.getAllPermanentEmployees();

    }

    /*
     * ==========================================================
     * Spring - Data - JPA - Hands on
     * 
     * Module 4 - Get Average Salary using HQL
     * ==========================================================
     */

    @Transactional
    public Double getAverageSalary() {

        return employeeRepository.getAverageSalary();

    }

    /*
     * ==========================================================
     * Spring - Data - JPA - Hands on
     * 
     * Module 5 - Get All Employees using Native Query
     * ==========================================================
     */

    @Transactional
    public List<Employee> getAllEmployeesNative() {

        return employeeRepository.getAllEmployeesNative();

    }

}