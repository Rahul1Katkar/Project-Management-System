package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class Mycontroller {
	
	@Autowired
	Project1Repo project1Repo;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("register")
	public boolean register(@RequestBody Project1 project1 )
	{
		try {
			project1Repo.save(project1);
			return true;
		} 
		catch (Exception e) {
			 e.printStackTrace();
			 return false;
		}
	}
	
	@GetMapping("checklogin{email}and{password}")
	@ExceptionHandler
	public boolean checklogin(@PathVariable String email,@PathVariable String password) 
	{
		int coutByEmail = project1Repo.countByEmail(email);
		if(coutByEmail==1) {
			 Project1 findByEmail = project1Repo.findByEmail(email);
			    if(findByEmail.getEmail().equals(email)&& findByEmail.getPassword().equals(password))
			    	return true;
			    else
			    	return false;
			
		}
		else
			return false;
		
	}

}
