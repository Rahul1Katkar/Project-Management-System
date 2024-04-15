package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Project1Repo extends JpaRepository<Project1, Integer> {
	
	int countByEmail(String email);
	Project1 findByEmail(String email);

}
