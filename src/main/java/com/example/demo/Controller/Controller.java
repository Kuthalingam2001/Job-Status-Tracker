package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Interview;
import com.example.demo.Service.ServiceCon;

@RestController
@CrossOrigin
public class Controller {
	
	
	@Autowired
	ServiceCon service;
	
 
		

	
		

	
    //User Management
	//Panel add in Candidate interview
	@PostMapping("Interviewer")
	public String Interviewer(@RequestBody Interview ob)
	{
		return service.Interviewer(ob);
	}

	

  

    


	
	//Panel in
	
	
/*	//Training Purpose
	//Training
	@GetMapping("between")
	public ResponseEntity<Interviewerresponse> between(@RequestBody Between ob) {
		return service.between(ob);
	}
	
	@GetMapping("try")
	public List<Interview> try1(Interview ob) {
		return service.try1(ob);
	}*/
	
  /*//Today Interview List
	@GetMapping("today")
	public ResponseEntity<Interviewerresponse> today(@RequestBody Interview ob)
	{
		return service.today(ob);
	}*/

	
	/*//Panel Interview Date
	@GetMapping("panel/interviewlist")
	public ArrayList< Panelrespon> panelinterviewlist(Pageable pageable) 
	{
		return service.panelinterviewlist(pageable);
	}*/
	
}
