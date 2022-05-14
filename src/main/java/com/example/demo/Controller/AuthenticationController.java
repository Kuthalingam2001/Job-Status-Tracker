package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.Response.LoginResponese;
import com.example.demo.Service.AuthenticationService;

@RestController
public class AuthenticationController {
	
	@Autowired 
	AuthenticationService authenticationservice;

	//Login
	@PutMapping("Login")
	public ResponseEntity<LoginResponese> Login(@RequestBody Employee ob) {
		return authenticationservice.Login(ob);
	}
		

}
