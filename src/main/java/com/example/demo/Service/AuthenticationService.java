package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmployeeRepo;
import com.example.demo.Response.Data;
import com.example.demo.Response.LoginResponese;

@Service
public class AuthenticationService {

	@Autowired
	EmployeeRepo employeerepository;
	
	//Login
	public ResponseEntity<LoginResponese> Login(Employee ob) {
		Employee ob1=employeerepository.findByUsername(ob.getUsername());
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		System.out.println(ob1);
		if(ob1 != null) {
			if(passwordEncoder.matches(ob.getPassword(),ob1.getPassword())) 
			{	
				boolean check=false;
				for(String dat :ob1.getRoll()) {
					if(dat.equals(ob.getPosition()))
						check=true;
				}
				System.out.println(check);
				if(check)
				{
				
			Data data=new Data(ob1.getId(),ob1.getUsername(),ob1.getEmail(),ob1.getRoll());
						
				
			return new ResponseEntity<>(new LoginResponese(true,ob.getPosition(),data),HttpStatus.ACCEPTED);
		}
	  else{
			return new ResponseEntity<>(new LoginResponese(false,"Your are Not" + ob.getPosition(),null),HttpStatus.UNAUTHORIZED);
	  }}
	   else {
			return new ResponseEntity<>(new LoginResponese(false,"Password incorect",null),HttpStatus.UNAUTHORIZED);
		}
		}
		else 
		{
			
	return new ResponseEntity<>(new LoginResponese(false,"Username Incorrect",null),HttpStatus.UNAUTHORIZED);
		}
	
	}
	
}
