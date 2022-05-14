package com.example.demo.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Candidate;
import com.example.demo.Repository.CandidateRepo;
import com.example.demo.Response.CandidatePagedata;
import com.example.demo.Response.CandidateRespon;
import com.example.demo.Response.DashBoard;

@Service
public class CandidateService {
	
	@Autowired
	CandidateRepo candidaterepository;
	

	//Candidate Add And Update
	public ResponseEntity<CandidateRespon> Candidate(Candidate ob)
	{
		if(ob.getId() == null) {
			if(candidaterepository.existsByEmail(ob.getEmail()) == false) {
				if(candidaterepository.existsByPhoneno(ob.getPhoneno()) == false) {
					 Candidate last = candidaterepository.findTopByOrderByApplicationnoDesc();
					    long lastNum = last.getApplicationno();
					    ob.setApplicationno(lastNum +1);
					    System.out.println(ob.getLinkedIn());
					candidaterepository.insert(ob);
				   // Data data=new Data(ob.getId(),ob.getFirstname(),ob.getEmail(),ob.getPhoneno(),ob.getStatus());
					return new ResponseEntity<>(new CandidateRespon(true,"Sucess"),HttpStatus.ACCEPTED);
					
				}else
				{
					return new ResponseEntity<>(new CandidateRespon(false,"Already Phoneno Taken"),HttpStatus.UNAUTHORIZED);
				}
			}else {
				return new ResponseEntity<>(new CandidateRespon(false,"Alredy Email Taken"),HttpStatus.UNAUTHORIZED);
			}
		}
		else{
		if(candidaterepository.existsByEmailAndIdIsNot(ob.getEmail(),ob.getId()) == false); {
		if(candidaterepository.existsByPhonenoAndIdIsNot(ob.getPhoneno(),ob.getId()) == false);	{
		candidaterepository.save(ob);
		return new ResponseEntity<>(new CandidateRespon(true,"Susess update"),HttpStatus.ACCEPTED);
		}}}
		}
	
	//Candidate Full Details
	public com.example.demo.Model.Candidate fulldetails(String id) {
		
		Candidate ob=candidaterepository.findById(id).get();
		
		return ob;
	}
	
	//Candidate Delete
	public String deletecandidate(String id) {
		candidaterepository.deleteById(id);
		return "sucessfully delete";
	}
	

	//Candidate Pagination
	public ArrayList<CandidatePagedata> Pageable(Pageable pageable) 
	{
		Page<Candidate> ob1=candidaterepository.findAll(pageable);
		ArrayList<CandidatePagedata> list=new ArrayList<CandidatePagedata>();
		for(Candidate ob:ob1) {
		CandidatePagedata data=new CandidatePagedata(ob.getId(),ob.getFirstname(),ob.getEmail(),ob.getPhoneno(),ob.getStatus());
		
		list.add(data);
		}
		return list;
	}
	
	  //DashBoard
		public ArrayList<DashBoard> DashBoard() {
			/*DashBoard dashBoard = new DashBoard();
			dashBoard.setRequested(can.countByStatus("requested"));
			dashBoard.setProgress(can.countByStatus("progress"));	
			dashBoard.setHired(can.countByStatus("hired"));	
			dashBoard.setWaitinglist(can.countByStatus("waitinglist"));
			dashBoard.setRejected(can.countByStatus("rejected"));
			dashBoard.setTotalcandidate(dashBoard.getRequested() + dashBoard.getProgress() + dashBoard.getHired() + dashBoard.getWaitinglist() + dashBoard.getRejected());	
				return dashBoard;*/
			ArrayList<DashBoard> data=new ArrayList<DashBoard>();
			DashBoard title1 = new DashBoard("requested",candidaterepository.countByStatus("requested"));
			data.add(title1);
			DashBoard title2 = new DashBoard("progress",candidaterepository.countByStatus("progress"));
			data.add(title2);
			DashBoard title3 = new DashBoard("hired",candidaterepository.countByStatus("hired"));
			data.add(title3);
			DashBoard title4 = new DashBoard("waitinglist",candidaterepository.countByStatus("waitinglist"));
			data.add(title4);
			DashBoard title5 = new DashBoard("rejected",candidaterepository.countByStatus("rejected"));
			data.add(title5);
			DashBoard title6 = new DashBoard("totalcandidate",title1.getCount()+title2.getCount()+title3.getCount()+title4.getCount()+title5.getCount());
			data.add(title6);
			return data;
			}


}
