package com.Rakesh.repo;

import org.springframework.data.repository.CrudRepository;

import com.Rakesh.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> 
{

}
