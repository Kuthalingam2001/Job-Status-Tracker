package com.example.demo.Model;

import java.util.ArrayList;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.demo.ModelRestClass.Address;
import com.example.demo.ModelRestClass.Experience;
import com.example.demo.ModelRestClass.Qualification;



@Document(collection="Employee_Details")
public class Employee {
	
	@Id
	private String id;
	private String firstname;
	private String lastname;
	private String username;
	private String email;
	private String LinkedIn;
	private Date dob;
	private String gender;
	private String position;
	private ArrayList<String> skill;
	private String password;
	private String cpassord;
	private Long phoneno;
	private Address[] address;
	private Qualification[] qualification;
	private Experience[] experience;
	private ArrayList<String> roll;
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}
	public Address[] getAddress() {
		return address;
	}
	public void setAddress(Address[] address) {
		this.address = address;
	}
	
	public Qualification[] getQualification() {
		return qualification;
	}
	public void setQualification(Qualification[] qualification) {
		this.qualification = qualification;
	}
	public Experience[] getExperience() {
		return experience;
	}
	public void setExperience(Experience[] experience) {
		this.experience = experience;
	}
	
	
	public ArrayList<String> getRoll() {
		return roll;
	}
	public void setRoll(ArrayList<String> roll) {
		this.roll = roll;
	}
	public String getCpassord() {
		return cpassord;
	}
	public void setCpassord(String cpassord) {
		this.cpassord = cpassord;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public ArrayList<String> getSkill() {
		return skill;
	}
	public void setSkill(ArrayList<String> skill) {
		this.skill = skill;
	}
	public ArrayList<String> getRoll(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getLinkedIn() {
		return LinkedIn;
	}
	public void setLinkedIn(String linkedIn) {
		LinkedIn = linkedIn;
	}
	
	
	
	
	

}
