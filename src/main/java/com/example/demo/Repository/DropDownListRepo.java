package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Model.Dropdownlist;

@Repository
public interface DropDownListRepo extends MongoRepository<Dropdownlist, String>
{

	void deleteByData(int i);


	

}
