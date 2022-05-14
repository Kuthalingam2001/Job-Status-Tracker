package com.example.demo.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Candidate;
import com.example.demo.Response.CandidatePagedata;
import com.example.demo.Response.CandidateRespon;
import com.example.demo.Service.CandidateService;

@RestController
public class Candidatecontroller {
	
	@Autowired
	CandidateService candidateservice;
	
	
    //Candidate Add And Update
	@PostMapping("Candidate")
	public ResponseEntity<CandidateRespon> Candidate(@RequestBody com.example.demo.Model.Candidate ob)
	{
		return candidateservice.Candidate(ob);
	}
	
	//Candidate PageNation
		@GetMapping("page/candidate")
		public ArrayList<CandidatePagedata> Pageable(Pageable pageable) 
		{
			return candidateservice.Pageable(pageable);
		}
		
		//Candidate full details
		@GetMapping("candidate/fulldetails/{id}")
		public Candidate fulldetails(@PathVariable String id)
		{
			return candidateservice.fulldetails(id);
		}
		
		//Candidate Delete
		@DeleteMapping("deletecandidate/{id}")
		public String deletecandidate(@PathVariable String id)
		{
			return candidateservice.deletecandidate(id);
		}

		//DashBoard
		@GetMapping("DashBoard")
		public ArrayList<com.example.demo.Response.DashBoard> DashBoard()
		{
		   return candidateservice.DashBoard();
		}
}
