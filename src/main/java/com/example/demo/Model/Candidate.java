package com.example.demo.Model;

import java.util.ArrayList;
import java.util.Date;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.demo.ModelRestClass.Address;
import com.example.demo.ModelRestClass.Experience;
import com.example.demo.ModelRestClass.Qualification;



@Document(collection="Candidate_details1")
public class Candidate {
  	@Id
  	private String id;
	private long applicationno;
	private String firstname;
	private String lastname;
	private String email;
	private String linkedIn;
	private Long phoneno;
	private Date dob;
	private Address[] address;
	private Qualification[] qualification;
	private Experience[] experience;
	private String status;
	private String job;
	private String description;
	private ArrayList<String> skill;
 
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<String> getSkill() {
		return skill;
	}
	public void setSkill(ArrayList<String> skill) {
		this.skill = skill;
	}
	public Experience[] getExperience() {
		return experience;
	}
	public void setExperience(Experience[] experience) {
		this.experience = experience;
	}
	public long getApplicationno() {
		return applicationno;
	}
	public void setApplicationno(long applicationno) {
		this.applicationno = applicationno;
	}
	public String getLinkedIn() {
		return linkedIn;
	}
	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}
	public void setDob(int date) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
