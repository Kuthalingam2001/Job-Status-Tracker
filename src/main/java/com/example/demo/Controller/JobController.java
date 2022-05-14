package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Model.JobDescription;
import com.example.demo.Service.Jobservice;

public class JobController {
	
	@Autowired
	Jobservice jobservice;
	
//  CREATE JOBDESCRIPTION AND UPDATE
    @PostMapping("jobDescription")
    public JobDescription jobDescription(@RequestBody JobDescription ob)
    {
	return jobservice.jobDescription(ob);
    }

    //DELETE JOBDESCRIPTION 
    @DeleteMapping("jobDescription/delete")
    public String deletejobdescrption(@RequestParam("id") String id)
    {
	return jobservice.deletejobdescrption(id);
    }

}
