package com.example.demo.Model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.demo.ModelRestClass.Salary;

@Document(collection="JobDescription")
public class JobDescription {
	
	@Id
	private String id;
	private ArrayList<String> requiredskills;
	private ArrayList<String> qualification;
	private String position;
	private String experience;
	private ArrayList<String> joblocation;
	private Salary salary;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<String> getRequiredskills() {
		return requiredskills;
	}
	public void setRequiredskills(ArrayList<String> requiredskills) {
		this.requiredskills = requiredskills;
	}
	public ArrayList<String> getQualification() {
		return qualification;
	}
	public void setQualification(ArrayList<String> qualification) {
		this.qualification = qualification;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public ArrayList<String> getJoblocation() {
		return joblocation;
	}
	public void setJoblocation(ArrayList<String> joblocation) {
		this.joblocation = joblocation;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	
	
	
	

	
	
	
	

}
