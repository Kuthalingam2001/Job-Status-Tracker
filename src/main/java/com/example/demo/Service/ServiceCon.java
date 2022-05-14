package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.Interview;
import com.example.demo.Repository.InterViewRepo;


@Service
public class ServiceCon {

    @Autowired
	InterViewRepo interviewrepository;
 
	//User Management
	//Panel add in Candidate interview
	public String Interviewer(Interview ob) {
		//Candidate ob1=can.findById(ob.getCandidateid()).get();
		//if(ob1.getId().equals(ob.getCandidateid()))
		try
		{
			interviewrepository.save(ob);
			return "sucess";
		}catch(Exception ae){
			return "failed";
		}
		
	}

	
}

/*//Training Purpose
//Details for Between two Dates in Panel 
public ResponseEntity<Interviewerresponse> between(Between ob) {
	
	LocalDateTime start=LocalDateTime.of(ob.getStartdate(),LocalTime.of(0, 0 ,0));
	LocalDateTime end=LocalDateTime.of(ob.getEnddate(), LocalTime.of(0, 0, 0));
	List<Interview> ob1=inter.findByInterviewdateBetween(start, end);
	ArrayList<Panelrespon> in=new ArrayList<Panelrespon>();
	
	int count=ob1.size();
	for(Interview ob2:ob1) 
	{
		String ob3=ob2.getCandidateid();
		Candidate ob4=can.findById(ob3).get();
	    Panelrespon data=new Panelrespon(ob4.getId(),ob4.getFirstname(),ob4.getLastname(),ob2.getInterviewtime(),ob2.getInterviewdate(),ob4.getQualification(),ob4.getExperience());
	    in.add(data);
	    
	}
	return  new ResponseEntity<>(new Interviewerresponse(count,null,in),HttpStatus.ACCEPTED);
}


public List<Interview> try1(Interview ob) {
	List<Interview> ob1=inter.findByInterviewdate(ob.getInterviewdate());
	return ob1;
}


//Training Purpose
 
/*	//InterViwer List
public ResponseEntity<Interviewerresponse> today(Interview ob) 
{
	Interview ob1=inter.findByInterviewdate(ob.getInterviewdate());
	System.out.println(ob1);
	if(ob1 != null) {
		if(emp.findByUsername(ob.getPanelusername()) !=null) {
	//Employee ob2=emp.findByUsername(ob.getInterviewerusername());
	 
		int n=ob1.getCandidateid().size();
		System.out.println(n);
            for(int i=0;i<n;) {
            	ArrayList<String> list=ob1.getCandidateid();
            	System.out.println(list);
            	Candidate ob3=can.findById(list.get(i)).get();
	        i++;
	        ArrayList<Panelrespon> in=new ArrayList<Panelrespon>();
			Panelrespon data=new Panelrespon(ob3.getId(),ob3.getFirstname(),ob3.getLastname(),ob1.getInterviewtime(),ob1.getInterviewdate(),ob3.getQualification(),ob3.getExperience());
			in.add(data);
			System.out.println(in);
		return new ResponseEntity<>(new Interviewerresponse(12,null,in),HttpStatus.ACCEPTED);
	}
	
	}else {
		return new ResponseEntity<>(new Interviewerresponse(0,"Today Not Fixed",null),HttpStatus.OK);
	}}
	else {
	return new ResponseEntity<>(new Interviewerresponse(0,"Today Not Fixed",null),HttpStatus.OK);
	}
	return null;
}*/

