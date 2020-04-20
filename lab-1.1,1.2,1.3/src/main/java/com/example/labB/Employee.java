package com.example.labB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	  private int id;
	  private String name;
	  private double salary;
	  private int age;
	  @Autowired
	  private SBU SBU;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public SBU getSBU() {
		return SBU;
	}
	public void setSBU(SBU sBU) {
		SBU = sBU;
	}
	public void show()
	{
		System.out.println("Employee"+"["+"empAge"+"="+21+" "+"empID"+"="+12345+" "+"empname"+"="+"Harshit Singh"+" "+"empSalary"+"="+10000);
		SBU.compile();
	}
	  
}
