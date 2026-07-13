package com.cognizant.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.model.Employee;

@SpringBootApplication
public class SpringlearnApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringlearnApplication.class, args);
		// displayDate();

		/*Module 3 - test , output : 5 */
		// ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		// ArrayList<Employee> list = (ArrayList<Employee>) context.getBean("employeeList");
		// System.out.println(list.size());

	}

	public static void displayDate() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		Date date = format.parse("31/12/2018");
		System.out.println(date);
	}

}
