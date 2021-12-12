package com.csa.samplefullstack.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tbl_Employee")
public class Employee {
    
    
    

    private long employeeId;
    private String name;
    private String department;
    private String location;
    
    public Employee(long employeeId, String name, String department, String location) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.location = location;
    }

    public Employee() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public long getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
