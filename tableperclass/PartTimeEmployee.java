package com.mph.tableperclass;

import javax.persistence.Entity;

@Entity
public class PartTimeEmployee extends SEmployee{
	private int hourlyrate;

	public PartTimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PartTimeEmployee(int hourlyrate) {
		super();
		this.hourlyrate = hourlyrate;
	}

	public int getHourlyrate() {
		return hourlyrate;
	}

	public void setHourlyrate(int hourlyrate) {
		this.hourlyrate = hourlyrate;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [hourlyrate=" + hourlyrate + "]";
	}
	
}
