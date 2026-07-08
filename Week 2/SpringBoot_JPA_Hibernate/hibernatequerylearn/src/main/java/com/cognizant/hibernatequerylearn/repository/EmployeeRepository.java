package com.cognizant.hibernatequerylearn.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.hibernatequerylearn.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    /*
     * ==========================================================
     * Spring - Data - JPA - Hands on
     * 
     * Module 2 - Get All Permanent Employees using HQL
     * ==========================================================
     */

    @Query("FROM Employee e WHERE e.permanent = true")
    List<Employee> getAllPermanentEmployees();

    /*
     * ==========================================================
     * Spring - Data - JPA - Hands on
     * 
     * Module 4 - Get Average Salary using HQL
     * ==========================================================
     */

    @Query("SELECT AVG(e.salary) FROM Employee e")
    Double getAverageSalary();

    /*
     * ==========================================================
     * Spring - Data - JPA - Hands on
     * 
     * Module 5 - Get All Employees using Native Query
     * ==========================================================
     */

    @Query(value = "SELECT * FROM employee", nativeQuery = true)
    List<Employee> getAllEmployeesNative();
}