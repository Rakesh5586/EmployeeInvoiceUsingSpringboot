package com.Rakesh.service;

import java.util.List;

import com.Rakesh.model.Employee;

public interface EmployeeService 
{
  public Employee saveEmployee(Employee emps);
  public Employee getOneEmployee(int empid);
  public void deleteEmployee(int empid);
  public List<Employee> getAllEmployee();
  public Employee updateEmployee(Employee emps);
}
