package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Dropdownlist;
import com.example.demo.Service.DropDownservice;

@RestController
public class DropDownController {
	
	@Autowired
	DropDownservice dropdownservice;

     //DropDownList Add And Update
    @PostMapping("Dropdownlistadd")
    public String Dropdownlistadd(@RequestBody Dropdownlist ob)
    {
	return dropdownservice.Dropdownlist(ob);
    }

    //DropDownList Update
    @PostMapping("Dropdownlistupdate")
    public com.example.demo.Model.Dropdownlist Dropdownlistupdate(@RequestBody Dropdownlist ob1)
    {
	     return dropdownservice.Dropdownlistupdate(ob1);
    }

    //DropDownList Delete Data
    @DeleteMapping("Dropdownlistdelete")
    public com.example.demo.Model.Dropdownlist Dropdownlistdelete(@RequestBody Dropdownlist dropdowndata)
    {
	     return dropdownservice.Dropdownlistdelete(dropdowndata);
    }
    
    //DropDownList Data Send
    @GetMapping("DropDown/{name}")
    public com.example.demo.Model.Dropdownlist DropDownListDataSend(@PathVariable String name)
    {
	     return dropdownservice.DropDownListDataSend(name);
    }

}
