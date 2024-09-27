package com.Rakesh.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee 
{ @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int empid;
  private String empname;
  private double salary;
  private double ta;
  private double da;
  private double hra;
  private double pf;
  private double gross_salary;
  private double net_salary;
public Employee() {
	super();
}
public Employee(int empid, String empname, double salary, double ta, double da, double hra, double pf,
		double gross_salary, double net_salary) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.salary = salary;
	this.ta = ta;
	this.da = da;
	this.hra = hra;
	this.pf = pf;
	this.gross_salary = gross_salary;
	this.net_salary = net_salary;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public double getTa() {
	return ta;
}
public void setTa(double ta) {
	this.ta = ta;
}
public double getDa() {
	return da;
}
public void setDa(double da) {
	this.da = da;
}
public double getHra() {
	return hra;
}
public void setHra(double hra) {
	this.hra = hra;
}
public double getPf() {
	return pf;
}
public void setPf(double pf) {
	this.pf = pf;
}
public double getGross_salary() {
	return gross_salary;
}
public void setGross_salary(double gross_salary) {
	this.gross_salary = gross_salary;
}
public double getNet_salary() {
	return net_salary;
}
public void setNet_salary(double net_salary) {
	this.net_salary = net_salary;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", ta=" + ta + ", da=" + da
			+ ", hra=" + hra + ", pf=" + pf + ", gross_salary=" + gross_salary + ", net_salary=" + net_salary + "]";
}
}
