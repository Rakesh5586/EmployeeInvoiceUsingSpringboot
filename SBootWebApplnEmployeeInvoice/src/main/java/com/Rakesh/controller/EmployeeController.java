package com.Rakesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Rakesh.model.Employee;
import com.Rakesh.service.EmployeeServiceImp;

@Controller
public class EmployeeController 
{
	@Autowired
	public EmployeeServiceImp service;
	
	@RequestMapping("/")
    public String homePage()
    {
    	return "home";
    }
	@RequestMapping("/addempUrl")
    public String addEmployee()
    {
    	return "addemp";
    }
	@RequestMapping("/saveUrl")
    public String saveProduct(Employee emps, ModelMap model)
    {
		service.saveEmployee(emps);
    	return "success";
    }
	@RequestMapping("/viewAllUrl")
	public String displayAllEmployee(ModelMap model)
	{
		model.put("employees",service.getAllEmployee());
		return "viewemp";
	}
	@RequestMapping("/deleteUrl/{empid}")
	public String deleteEmployee(@PathVariable int empid, ModelMap model)
	{
		service.deleteEmployee(empid);
		return "redirect:/viewAllUrl";
	}
	@RequestMapping("/editUrl/{empid}")
	public String editEmployee( @PathVariable int empid, ModelMap model)
	{
		model.put("command", service.getOneEmployee(empid));
		return "editemp";
	}
	@RequestMapping("/editsaveUrl")
	public String editSave(Employee emps, ModelMap model)
	{
		service.saveEmployee(emps);
		return "redirect:/viewAllUrl";
	}
	@RequestMapping("/viewUrl")
	public String viewEmployee()
	{
		return "viewone";
	}
	@RequestMapping("/viewOneUrl")
	public String getOneEmp(@RequestParam int empid,Employee emps, ModelMap model)
	{
		model.put("eid",empid);
		if(emps.getEmpid()==empid)
		{
			model.put("emps", service.getOneEmployee(empid));
		    return "viewOneEmp";
		}
		else
		{
			return "error";
		}
	}
	
}
