package com.Geekster.Test;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    public String name;
    public String designation;
    public int id;
    public int salary;

    public Employee() {}

    public Employee(String name,String designation,int id,int salary)
    {
        this.name=name;
        this.designation=designation;
        this.id=id;
        this.salary=salary;
    }
    //---------------------------------


    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
