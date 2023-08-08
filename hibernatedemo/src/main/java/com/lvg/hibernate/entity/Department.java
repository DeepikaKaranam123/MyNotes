package com.lvg.hibernate.entity;

import java.util.List;



import javax.persistence.CascadeType;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.FetchType;

import javax.persistence.Id;

import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;

 

@Entity

public class Department

{

    @Id

    @Column(name="deptno")

    private int departmentNo;

    @Column(name="deptname")

    private String departmentName;

    private String location;

    /*@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)

    @JoinColumn(name="deptno")*/

    @OneToMany(mappedBy="department")

    List<Employee> employees;

    public Department() {}

    public Department(int departmentNo, String departmentName, String location) {

        this.departmentNo =departmentNo ;

        this.departmentName = departmentName;

        this.location = location;

    }

    public int getdepartmentNo() {

        return departmentNo;

    }

    public void setdepartmentNo(int departmentNo) {

        this.departmentNo = departmentNo;

    }

    public String getDepartmentName() {

        return departmentName;

    }

    public void setDepartmentName(String departmentName) {

        this.departmentName = departmentName;

    }

    public String getLocation() {

        return location;

    }

    public void setLocation(String location) {

        this.location = location;

    }

    public List<Employee> getEmployees() {

        return employees;

    }

    public void setEmployees(List<Employee> employees) {

        this.employees = employees;

    }

    

    

}