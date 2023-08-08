package com.lvg.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
//@Table(name="employee")
public class Employee {
	@Id
	@Column(name="empid")
	private int employeeId;
	
	@Column(name="empname")
	private String employeeName;
	
	
	private double salary;
	
	
	@ManyToOne
	@JoinColumn(name="deptno")
	Department department;
	public Employee(){}

	public Employee(int employeeId, String employeeName, double salary) {

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
