package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.JobDescription;
import com.example.demo.Repository.JobDescriptionRepo;

@Service
public class Jobservice {
	@Autowired
	 JobDescriptionRepo jobdescriptionrepository;
	
	  //  CREATE JOBDESCRIPTION AND UPDATE
			public JobDescription jobDescription(JobDescription ob) {
				if(ob.getId() == null) {
					
				
					return jobdescriptionrepository.insert(ob);
				}else {
					
				return jobdescriptionrepository.save(ob);
				}
			}

			//DELETE JOBDESCRIPTION 
			public String deletejobdescrption(String id) {
				if(jobdescriptionrepository.existsById(id))
				{
					jobdescriptionrepository.deleteById(id);
					return "Sucessfully Delete";
				}else {
				return "Wrong Id";
				}
			}
	    
}
