package com.example.demo.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.Response.EmployeePagedata;
import com.example.demo.Response.Panel;
import com.example.demo.Service.Employeeservice;

@RestController
public class EmployeeController {
	
	@Autowired
	Employeeservice employeeservice;
	
	
    //Employee Add And Update
	@PostMapping("employee")
	public String employee(@RequestBody Employee ob)
	{
		return employeeservice.employee(ob);
	}
	
	//Employee Pagination
	@GetMapping("employeepage")
	public ArrayList<EmployeePagedata> employeepage(Pageable pageable)
	{
		return employeeservice.employeepage(pageable);
	}
	
	//Employee FullDetails
	@GetMapping("Employee/{username}")
	public Employee Employeefulldetails(@PathVariable String username)
	{
		return employeeservice.Employeefulldetails(username);
	}
	
	//Password Change 
	//UserName Checking
	@PostMapping("usernamecheck")
	public String usernamecheck(@RequestParam("username") String username)
	{
		return employeeservice.usernamecheck(username);
	}
	
	//Password change
	@PostMapping("changeotp")
	public String changeotp(@RequestBody Employee ob)
	{
		return employeeservice.changeotp(ob);
	}
	
	//Delete Employee
	@DeleteMapping("employeedelete/{username}")
	public String employeedelete(@PathVariable String username)
	{
		return employeeservice.employeedelete(username);
	}
	
	
    //Panel List
	@GetMapping("employee/rolllist")
	public  ArrayList<Panel> panel(@RequestBody Employee ob5)
	{
	    return employeeservice.panel(ob5);
	}
	

}
