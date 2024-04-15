package com.example.demo.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
public class MyController {

	@Autowired
	projectdetailRepo projectdetailRepo;
	
//	@ExceptionHandler
	@PostMapping("addproject")
	public boolean addproject(@RequestBody projectdetail projectdetail) {
		try {
			projectdetailRepo.save(projectdetail);
			return true; 
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
//	@ExceptionHandler
	@GetMapping("getallproject")
	public List<projectdetail> getallproject(){
		
		try {
			List<projectdetail> allproject = projectdetailRepo.findAll();
			return allproject;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	
//	@ExceptionHandler
	@GetMapping("updatestatus{projectid}and{status}")
	public boolean updatestatus(@PathVariable int projectid,@PathVariable String status) {
		try {
			projectdetail detail = projectdetailRepo.findById(projectid).get();
			 detail.setStatus(status);
			 
			 projectdetailRepo.save(detail);
			 return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		 
	}
	
	 
	@GetMapping("getcountofall")
	public statusDetail getcountofall() {
		 statusDetail statusdetail = projectdetailRepo.dashBoardDetail();
		System.out.println(statusdetail.getTotalcnt());
		System.out.println(statusdetail.getRunningcnt());
		System.out.println(statusdetail.getCancelcnt());
		System.out.println(statusdetail.getClosecnt());
		return statusdetail;
			
		 
	}
}
