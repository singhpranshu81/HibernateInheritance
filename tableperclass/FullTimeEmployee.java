package com.mph.tableperclass;


import javax.persistence.Entity;

@Entity
public class FullTimeEmployee extends SEmployee {
   private int salary;

public FullTimeEmployee() {
	super();
	// TODO Auto-generated constructor stub
}

public FullTimeEmployee(int salary) {
	super();
	this.salary = salary;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "FullTimeEmployee [salary=" + salary + "]";
}
   
}
