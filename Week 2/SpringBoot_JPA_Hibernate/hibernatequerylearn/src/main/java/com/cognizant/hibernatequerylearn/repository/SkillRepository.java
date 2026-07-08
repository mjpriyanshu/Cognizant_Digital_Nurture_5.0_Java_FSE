package com.cognizant.hibernatequerylearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.hibernatequerylearn.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, Integer> {

}