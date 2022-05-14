package com.example.demo.Service;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.Dropdownlist;
import com.example.demo.Repository.DropDownListRepo;

@Service
public class DropDownservice {
	
	 @Autowired
	 DropDownListRepo dropdownlistrepository;

		//DropDownList Add
		public String Dropdownlist(Dropdownlist ob) {
			if(ob != null) 
			{
				dropdownlistrepository.insert(ob);
				return "SuccessFully Add DropDownList";
			}else {
				return "Wrong";
			}
		}

		//DropDownList Update
		public com.example.demo.Model.Dropdownlist Dropdownlistupdate(Dropdownlist ob1) {
			Dropdownlist ob=dropdownlistrepository.findById(ob1.getDropdownname()).get();
			ArrayList<String> list=ob.getData();
			
			for(String data1 : ob1.getData()) {
				list.add(data1);
			}
			ob.setData(list);
	     dropdownlistrepository.save(ob);
			return ob;
		}

		//DropDownList Delete Data
		public com.example.demo.Model.Dropdownlist Dropdownlistdelete(Dropdownlist dropdowndata) {
			Dropdownlist ob=dropdownlistrepository.findById(dropdowndata.getDropdownname()).get();
			if(dropdownlistrepository.findById(dropdowndata.getDropdownname()) != null)
			{
				ArrayList<String> list=dropdowndata.getData();	
				ArrayList<String> ob1=ob.getData();
				
			for(int j=0;j<dropdowndata.getData().size();j++) {
				
				for(int i=0;i<ob.getData().size();i++) {
				if(list.get(j).equals(ob1.get(i)))
					System.out.println(i);
					ob1.remove(i);
					ob.setData(ob1);
						}
			}
				return dropdownlistrepository.save(ob);
				}
			return ob;
		}
		
    //DropDownList Data Send
	public com.example.demo.Model.Dropdownlist DropDownListDataSend(String name) {
		return dropdownlistrepository.findById(name).get();
		}

}
