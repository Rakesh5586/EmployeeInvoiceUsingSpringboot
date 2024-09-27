package com.Rakesh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rakesh.model.Employee;
import com.Rakesh.repo.EmployeeRepo;
@Service
public class EmployeeServiceImp implements EmployeeService 
{
	@Autowired
     EmployeeRepo repo;
	
	@Override
	public Employee saveEmployee(Employee emps) 
	{
		double ta=0.0,da=0.0,hra=0.0,pf=0.0,gsal=0.0,nsal=0.0;
		double sal  = emps.getSalary();
		if(sal<30000)
		{
			 ta = (sal*7)/100;
			 da = (sal*9)/100;
			 hra = (sal*11)/100;
			 pf = (sal*15)/100;
			 gsal = sal+ta+da+hra;
			 nsal = gsal-pf;
		}
		else if(sal>=30000 && sal<50000)
		{
			 ta = (sal*12)/100;
			 da = (sal*13)/100;
			 hra = (sal*17)/100;
			 pf = (sal*22)/100;
			 gsal = sal+ta+da+hra;
			 nsal = gsal-pf;
		}
		else if(sal>=50000)
		{
			 ta = (sal*17)/100;
			 da = (sal*19)/100;
			 hra = (sal*21)/100;
			 pf = (sal*25)/100;
			 gsal = sal+ta+da+hra;
			 nsal = gsal-pf;
		}
		emps.setTa(ta);
		emps.setDa(da);
		emps.setHra(hra);
		emps.setPf(pf);
		emps.setGross_salary(gsal);
		emps.setNet_salary(nsal);
		Employee saveEmployee  = repo.save(emps);
		return saveEmployee;
	}

	@Override
	public List<Employee> getAllEmployee() 
	{
		List<Employee> listAllEmp  = (List<Employee>) repo.findAll();
		return listAllEmp;
	}
	@Override
	public void deleteEmployee(int empid) 
	{
		repo.deleteById(empid);
	}

	@Override
	public Employee getOneEmployee(int empid) 
	{
		Employee getOneRecord = repo.findById(empid).get();
		return getOneRecord;
	}
	@Override
	public Employee updateEmployee(Employee emps) 
	{
		double ta=0.0,da=0.0,hra=0.0,pf=0.0,gsal=0.0,nsal=0.0;
		double sal  = emps.getSalary();
		if(sal<30000)
		{
			 ta = (sal*7)/100;
			 da = (sal*9)/100;
			 hra = (sal*11)/100;
			 pf = (sal*15)/100;
			 gsal = sal+ta+da+hra;
			 nsal = gsal-pf;
		}
		else if(sal>=30000 && sal<50000)
		{
			 ta = (sal*12)/100;
			 da = (sal*13)/100;
			 hra = (sal*17)/100;
			 pf = (sal*22)/100;
			 gsal = sal+ta+da+hra;
			 nsal = gsal-pf;
		}
		else if(sal>=50000)
		{
			 ta = (sal*17)/100;
			 da = (sal*19)/100;
			 hra = (sal*21)/100;
			 pf = (sal*25)/100;
			 gsal = sal+ta+da+hra;
			 nsal = gsal-pf;
		}
		emps.setTa(ta);
		emps.setDa(da);
		emps.setHra(hra);
		emps.setPf(pf);
		emps.setGross_salary(gsal);
		emps.setNet_salary(nsal);
		Employee updateEmployees  = repo.save(emps);
		return updateEmployees;
	}

}
