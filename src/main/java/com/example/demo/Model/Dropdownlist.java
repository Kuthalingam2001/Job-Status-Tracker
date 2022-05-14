package com.example.demo.Model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="DropDownList")
public class Dropdownlist {
	
	@Id
	private String dropdownname;
	private ArrayList<String> data;
	
	public String getDropdownname() {
		return dropdownname;
	}
	public void setDropdownname(String dropdownname) {
		this.dropdownname = dropdownname;
	}
	public ArrayList<String> getData() {
		return data;
	}
	public void setData(ArrayList<String> data) {
		this.data = data;
	}
	public Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		return "Dropdownlist [dropdownname=" + dropdownname + ", data=" + data + "]";
	}

	
	
	
	
	
	
	

}
