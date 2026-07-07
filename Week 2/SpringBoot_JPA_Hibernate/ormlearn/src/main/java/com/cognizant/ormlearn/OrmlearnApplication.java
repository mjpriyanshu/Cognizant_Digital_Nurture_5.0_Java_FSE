package com.cognizant.ormlearn;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.repository.StockRepository;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.SkillService;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.model.Skill;
import com.cognizant.ormlearn.model.Department;

import java.util.Date;

@SpringBootApplication
public class OrmlearnApplication {

    // Hands-on 1 - Country Service
    private static CountryService countryService;

    // Hands-on 2 - Stock Query Methods
    private static StockRepository stockRepository;

    /*
     * ==========================================================
     * Module 3 - Hands on 4 - ManyToOne Mapping
     * ==========================================================
     */

    private static EmployeeService employeeService;

    private static DepartmentService departmentService;

    private static SkillService skillService;

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(OrmlearnApplication.class, args);

        System.out.println("Application Started");

        /*
         * Module 1 - Spring Core MAVEN : hands on 5,6 and 7 - comment out these to use
         */
        countryService = context.getBean(CountryService.class);
        // testGetAllCountries();
        // testFindCountry();
        // testAddCountry();

        /*
         * Module 1 - SpringBoot_JPA_Hibernate:
         * Hands on 1
         */

        // testSearchCountry();
        // testSearchCountrySorted();
        // testCountryStartsWith();

        /* Hands on 2 - Stock Query Methods */
        stockRepository = context.getBean(StockRepository.class);

        // testFaceBookSeptember();
        // testGoogleGreaterThan1250();
        // testTop3Volume();
        // testLowestNetflix();

        /*
         * ==========================================================
         * Module 3 - Hands on 4 - ManyToOne Mapping
         * ==========================================================
         */

        employeeService = context.getBean(EmployeeService.class);
        departmentService = context.getBean(DepartmentService.class);
        skillService = context.getBean(SkillService.class);

        // testGetEmployee();
        // testAddEmployee();
        // testUpdateEmployee();

        /*
         * ==========================================================
         * Module 3 - Hands on 5 - OneToMany Mapping
         * ==========================================================
         */

        // testGetDepartment();



        /*
         * ==========================================================
         * Module 3 - Hands on 6 - ManyToMany Mapping
         * ==========================================================
         */

        // testGetEmployee();

        testAddSkillToEmployee();

    }

    private static void testGetAllCountries() {
        System.out.println("\nFetching Countries...\n");
        List<Country> countries = countryService.getAllCountries();
        for (Country country : countries) {
            System.out.println(country);
        }
        System.out.println("\nCompleted Successfully.");

    }

    private static void testFindCountry() {
        System.out.println("\nFinding Country...\n");
        try {
            Country country = countryService.findCountryByCode("IN");
            System.out.println(country);
        } catch (CountryNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void testAddCountry() {

        System.out.println("\nAdding New Country...\n");

        Country country = new Country("NP", "Nepal");

        countryService.addCountry(country);

        try {

            Country addedCountry = countryService.findCountryByCode("NP");
            System.out.println("Country Added Successfully");
            System.out.println(addedCountry);

        } catch (CountryNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    /* Module 2: Hands on 1 */
    private static void testSearchCountry() {
        System.out.println("\nCountries containing 'ou' :  \n");
        List<Country> countries = countryService.searchCountries("ou");
        countries.forEach(System.out::println);
    }

    private static void testSearchCountrySorted() {
        System.out.println("\n Countries containing 'ou' (Sorted) :  \n");
        List<Country> countries = countryService.searchCountriesSorted("ou");
        countries.forEach(System.out::println);
    }

    private static void testCountryStartsWith() {
        System.out.println("\n Countries starting with Z :   \n");
        List<Country> countries = countryService.getCountriesStartingWith("Z");
        countries.forEach(System.out::println);

    }

    /* Hands 2 - Stock query methods */
    private static void testFaceBookSeptember() {
        System.out.println("\n FACEBOOK SEPTEMBER STOCKS \n");
        List<Stock> stocks = stockRepository.findByCodeAndDateBetween(
                "FB",
                LocalDate.of(2019, 9, 1),
                LocalDate.of(2019, 9, 15));

        stocks.forEach(System.out::println);
    }

    // Hands-on 2 - Query 2
    // Google close price > 1250
    private static void testGoogleGreaterThan1250() {
        System.out.println("\n GOOGLE > 1250 : \n");
        List<Stock> stocks = stockRepository.findByCodeAndCloseGreaterThan(
                "GOOGL",
                1250);
        stocks.forEach(System.out::println);
    }

    // Hands-on 2 - Query 3
    // Highest Volume

    private static void testTop3Volume() {

        System.out.println("\n TOP 3 VOLUME \n");

        List<Stock> stocks = stockRepository.findTop3ByOrderByVolumeDesc();

        stocks.forEach(System.out::println);

    }

    // Hands-on 2 - Query 4
    // Lowest Netflix Prices

    private static void testLowestNetflix() {

        System.out.println("\n LOWEST NETFLIX STOCK \n");
        List<Stock> stocks = stockRepository.findTop3ByCodeOrderByCloseAsc(
                "NFLX");
        stocks.forEach(System.out::println);
    }

    /*
     * ==========================================================
     * Module 3 - Hands on 4 - ManyToOne Mapping
     * ==========================================================
     */

    private static void testGetEmployee() {

        System.out.println("\n Employee Details\n");

        Employee employee = employeeService.get(1);

        System.out.println(employee);

        // System.out.println(employee.getDepartment()); //replaced with below to print
        // department details in a better way
        System.out.println(employee.getDepartment());

        System.out.println();

        System.out.println("Skills");

        System.out.println(employee.getSkillList());
    }

    /*
     * ==========================================================
     * Module 3 - Hands on 4 - ManyToOne Mapping
     * ==========================================================
     */

    private static void testAddEmployee() {

        Employee employee = new Employee();

        employee.setName("Rohit");

        employee.setSalary(75000);

        employee.setPermanent(true);

        employee.setDateOfBirth(new Date());

        Department department = departmentService.get(2);

        employee.setDepartment(department);

        employeeService.save(employee);

        System.out.println(employee);

    }

    /*
     * ==========================================================
     * Module 3 - Hands on 4 - ManyToOne Mapping
     * ==========================================================
     */

    private static void testUpdateEmployee() {
        Employee employee = employeeService.get(1);
        Department department = departmentService.get(3);
        employee.setDepartment(department);
        employeeService.save(employee);
        System.out.println(employee);

    }

    /*
     * ==========================================================
     * Module 3 - Hands on 5 - OneToMany Mapping
     * ==========================================================
     */

    private static void testGetDepartment() {

        System.out.println("\n Department \n");
        Department department = departmentService.get(2);
        System.out.println(department);
        System.out.println();
        System.out.println("Employees");
        System.out.println(department.getEmployeeList());
    }

    /*
     * ==========================================================
     * Module 3 - Hands on 6 - ManyToMany Mapping
     * ==========================================================
     */

    private static void testAddSkillToEmployee() {
        Employee employee = employeeService.get(3);
        Skill skill = skillService.get(2);
        employee.getSkillList().add(skill);
        employeeService.save(employee);
        System.out.println(employee);

    }

}
