package com.example.demo.Model.training;

import java.util.ArrayList;
import java.util.Date;

public class Panel {
	
	private String candidateid;
	private Date interviewdate;
	private String interviewtime;
	private String candidatename;
	private ArrayList<String> skill;
	public String getCandidateid() {
		return candidateid;
	}
	public void setCandidateid(String candidateid) {
		this.candidateid = candidateid;
	}
	public Date getInterviewdate() {
		return interviewdate;
	}
	public void setInterviewdate(Date interviewdate) {
		this.interviewdate = interviewdate;
	}
	public String getInterviewtime() {
		return interviewtime;
	}
	public void setInterviewtime(String interviewtime) {
		this.interviewtime = interviewtime;
	}
	public String getCandidatename() {
		return candidatename;
	}
	public void setCandidatename(String candidatename) {
		this.candidatename = candidatename;
	}
	public ArrayList<String> getSkill() {
		return skill;
	}
	public void setSkill(ArrayList<String> skill) {
		this.skill = skill;
	}
	public Panel(String candidateid, Date interviewdate, String interviewtime, String candidatename,
			ArrayList<String> skill) {
		super();
		this.candidateid = candidateid;
		this.interviewdate = interviewdate;
		this.interviewtime = interviewtime;
		this.candidatename = candidatename;
		this.skill = skill;
	}
	
	

}
