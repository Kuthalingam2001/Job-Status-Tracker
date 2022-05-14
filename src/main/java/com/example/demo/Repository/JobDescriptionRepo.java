package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.JobDescription;

@Repository
public interface JobDescriptionRepo extends MongoRepository<JobDescription, String>{

}
