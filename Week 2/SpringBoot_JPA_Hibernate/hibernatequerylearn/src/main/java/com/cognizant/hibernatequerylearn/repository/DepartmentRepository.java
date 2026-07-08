package com.cognizant.hibernatequerylearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.hibernatequerylearn.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}