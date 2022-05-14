package com.example.demo.Repository;


import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Interview;

@Repository
public interface InterViewRepo extends MongoRepository<Interview, String> {

	


	List<Interview> findByInterviewdateBetween(LocalDateTime start, LocalDateTime end);

	List<Interview> findByInterviewdateBetween(Date startdate, Date enddate);

	Interview findByInterviewdate(Date interviewdate);



	//List<Interview> findByInterviewdateBetweenAll(LocalDateTime start, LocalDateTime end);

	
	



	
	
}
