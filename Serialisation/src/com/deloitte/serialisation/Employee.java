package com.deloitte.serialisation;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = 451215;
	int empId;
	String ename;
	float salary;

	public Employee() {

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Employee(int empId, String ename, float salary) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", salary=" + salary + "]";
	}
	

}
