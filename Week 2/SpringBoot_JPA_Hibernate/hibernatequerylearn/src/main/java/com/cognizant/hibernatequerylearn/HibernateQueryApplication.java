package com.cognizant.hibernatequerylearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*Module 2 imports */
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import com.cognizant.hibernatequerylearn.model.Employee;
import com.cognizant.hibernatequerylearn.service.EmployeeService;

@SpringBootApplication
public class HibernateQueryApplication implements CommandLineRunner {

    private final ApplicationContext context;

    public HibernateQueryApplication(ApplicationContext context) {
        this.context = context;
    }

    public static void main(String[] args) {
        SpringApplication.run(HibernateQueryApplication.class, args);
    }

    @Override
    public void run(String... args) {

        EmployeeService employeeService = context.getBean(EmployeeService.class);

        /*
         * ==========================================================
         * Spring - Data - JPA - Hands on
         * 
         * Module 2 - Get All Permanent Employees using HQL
         * ==========================================================
         */

        // List<Employee> employees =
        // employeeService.getAllPermanentEmployees();

        // System.out.println("\n Permanent Employees: \n");

        // employees.forEach(System.out::println);

        /*
         * ==========================================================
         * Spring - Data - JPA - Hands on
         * 
         * Module 4 - Get Average Salary using HQL
         * ==========================================================
         */

        // Double averageSalary = employeeService.getAverageSalary();

        // System.out.println("\n Average Salary : \n");

        // System.out.println(averageSalary);

        /*
         * ==========================================================
         * Spring - Data - JPA - Hands on
         * 
         * Module 5 - Get All Employees using Native Query
         * ==========================================================
         */

        List<Employee> employees = employeeService.getAllEmployeesNative();
        System.out.println("\n All Employees \n");
        employees.forEach(System.out::println);
    }

}
