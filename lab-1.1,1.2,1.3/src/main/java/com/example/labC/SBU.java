package com.example.labC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SBU {
private int sbuID;
private String sbuName;
private String sbuHead;
@Autowired
private Employee employee;
public int getSbuID() {
	return sbuID;
}
public void setSbuID(int sbuID) {
	this.sbuID = sbuID;
}
public String getSbuName() {
	return sbuName;
}
public void setSbuName(String sbuName) {
	this.sbuName = sbuName;
}
public String getSbuHead() {
	return sbuHead;
}
public void setSbuHead(String sbuHead) {
	this.sbuHead = sbuHead;
}
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}
public void show()
{
	System.out.println();
}
}
