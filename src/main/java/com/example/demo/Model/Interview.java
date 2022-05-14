package com.example.demo.Model;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="interview_details1")
public class Interview {
	
	private ArrayList<String> candidateid;
	private Date interviewdate;
	private String interviewtime;
	private String candidatename;
	private String panelusername;
	
	
	
	public ArrayList<String> getCandidateid() {
		return candidateid;
	}
	public void setCandidateid(ArrayList<String> candidateid) {
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
	
	public String getPanelusername() {
		return panelusername;
	}
	public void setPanelusername(String panelusername) {
		this.panelusername = panelusername;
	}
	public ArrayList<String> getCandidateid(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		return "Interview [candidateid=" + candidateid + ", interviewdate=" + interviewdate + ", interviewtime="
				+ interviewtime + ", candidatename=" + candidatename + ", panelusername=" + panelusername + "]";
	}
	

	
	
	

}
