package com.example.demo.Queries;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Queries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    public String name;
    @Column(name = "age")
    public Integer age;
    @Column(name = "mobile")
    public Integer mobile;
    @Column(name = "salary")
    public Integer salary;
    @Column(name = "designation")
    public String designation;
    public Queries() {
    }
    public Queries(Long id, String name, Integer age, Integer mobile, Integer salary, String designation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobile = mobile;
        this.salary = salary;
        this.designation = designation;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getMobile() {
        return (int)Math.random()*(int)Math.pow(10, 10);
    }
    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }
    public Integer getSalary() {
        return (int) Math.random()*100000;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    @Override
    public String toString() {
        return "Queries [id=" + id + ", name=" + name + ", age=" + age + ", mobile=" + mobile + ", salary=" + salary
                + ", designation=" + designation + "]";
    }
    
}
