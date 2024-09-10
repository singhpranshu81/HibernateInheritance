package com.mph.singletable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="EMP_TYPE")
@Entity
public class SEmployee {
    @Id
	private int id;
	private String name;
	public SEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SEmployee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "SEmployee [id=" + id + ", name=" + name + "]";
	}
	
	
}
