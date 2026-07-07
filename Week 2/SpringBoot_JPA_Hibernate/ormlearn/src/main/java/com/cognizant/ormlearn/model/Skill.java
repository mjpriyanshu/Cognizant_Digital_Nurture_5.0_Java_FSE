package com.cognizant.ormlearn.model;

/*2. Hands on 2 - JPA data and hibernate */
import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "skill")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sk_id")
    private int id;

    @Column(name = "sk_name")
    private String name;

    /*
     * ==========================================================
     * Module 3 - Hands on 6 - ManyToMany Mapping
     * ==========================================================
     */

    @ManyToMany(mappedBy = "skillList")
    private Set<Employee> employeeList;

    public Skill() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Employee> getEmployeeList() {
    return employeeList;
}

public void setEmployeeList(Set<Employee> employeeList) {
    this.employeeList = employeeList;
}


    @Override
    public String toString() {
        return "Skill [id=" + id +
                ", name=" + name + "]";
    }

}