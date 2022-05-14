package com.example.demo.Response;

import java.util.ArrayList;

public class Data {
	
	private String id;
	private String username;
	private String email;
	private ArrayList<String> roll;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<String> getRoll() {
		return roll;
	}
	public void setRoll(ArrayList<String> roll) {
		this.roll = roll;
	}
	public Data(String id, String username, String email, ArrayList<String> roll) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.roll = roll;
	}
	
	
	
	
}
