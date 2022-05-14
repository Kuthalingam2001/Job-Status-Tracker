package com.example.demo.Response;

import java.util.ArrayList;

public class Panel {
	
	private String username;
	private ArrayList<String> roll;
	private Long phoneno;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public ArrayList<String> getRoll() {
		return roll;
	}
	public void setRoll(ArrayList<String> roll) {
		this.roll = roll;
	}
	public Long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}
	public Panel(String username, ArrayList<String> roll, Long phoneno) {
		super();
		this.username = username;
		this.roll = roll;
		this.phoneno = phoneno;
	}
	
	

}
