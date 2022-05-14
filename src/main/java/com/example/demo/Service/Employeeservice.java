package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmployeeRepo;
import com.example.demo.Response.EmployeePagedata;
import com.example.demo.Response.Panel;

@Service
public class Employeeservice {
	
	
	@Autowired
	EmployeeRepo employeerepository;
	public String Name;
	//Employee Add And Update
		public String employee(Employee ob) {
				if(ob.getUsername() == null) {
						if(employeerepository.existsByEmail(ob.getEmail()) == false) {
					if(employeerepository.existsByPhoneno(ob.getPhoneno()) == false) {
						do {
						Random random = new Random();
						 //R
						//and = random.nextInt(10000);
					    int user=random.nextInt(10000);
					    System.out.println(user);
						ob.setUsername(ob.getFirstname()+ user +"@icannio.com");
						}while(employeerepository.existsByUsername(ob.getUsername()));
						PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(); 
						String encodedPassword = passwordEncoder.encode("abc123");
					     System.out.println(encodedPassword);
						ob.setPassword(encodedPassword );
					   
						employeerepository.insert(ob);
						return "sucess";
					}
					else {
						return "Already Phone no Taken";
					}}
				else
					{
						return "Already Email Taken";
					}}
			else
					{
				if(employeerepository.existsByEmailAndIdIsNot(ob.getEmail(),ob.getId()) == false);{
					if(employeerepository.existsByPhonenoAndIdIsNot(ob.getPhoneno(),ob.getId()) ==false);{
				
						employeerepository.save(ob);
						return "sucess update";
					}
				}
					}
		}

	    //Employee Pagination
		public ArrayList<EmployeePagedata> employeepage(Pageable pageable) 
		{
			Page<Employee> ob=employeerepository.findAll(pageable);
			ArrayList<EmployeePagedata> list=new ArrayList<EmployeePagedata>();
			for(Employee ob1:ob) {
				EmployeePagedata data=new EmployeePagedata(ob1.getUsername(),ob1.getFirstname(),ob1.getEmail(),ob1.getRoll());
			    list.add(data);
			}
			return list;
		}

	   //Employee Full details
		public Employee Employeefulldetails(String username)
		{
			Employee ob=employeerepository.findByUsername(username);
			return ob;
		}

		//Password Change
	    //UserName Checking
		public String usernamecheck(String username) {
			Employee ob=employeerepository.findByUsername(username);
			if(ob.getUsername().equals(username)) {
				Name=username;
				return "sucess";
			}else {
			return "not found";
			}
		}

		//Password change
		public String changeotp(Employee ob) {
			Employee ob1=employeerepository.findByUsername(Name);
			System.out.println(ob.getPassword());
			if(ob.getPassword().equals(ob.getCpassord()))
			{
				ob1.setPassword(ob.getPassword());
				System.out.println(ob1);
				employeerepository.save(ob1);
				return "Sucessfully Password Update";
			}else {
			return "password And Conformpassword not match";
			}
			
		}

		//Delete Employee
		public String employeedelete(String username) {
			employeerepository.deleteByUsername(username);
			return "Sucessfully Delete";
		}
		
		  //Panel List
		public ArrayList<Panel> panel(Employee ob5) {
			List<Employee> ob=employeerepository.findAll();
			ArrayList<Panel> data=new ArrayList<Panel>();
			for(Employee ob1:ob) {
				ArrayList<String> list=ob1.getRoll();
				int n=list.size();
				for(int i=0;i<n;i++) {
					ArrayList<String> pan=ob5.getRoll();
					if(list.get(i).equals(pan.get(0))) {
						  Panel list1=new Panel(ob1.getUsername(),ob1.getRoll(),ob1.getPhoneno());
						data.add(list1);
						System.out.println(data);
					}
				}
			}
			
			return data;
		}




}
