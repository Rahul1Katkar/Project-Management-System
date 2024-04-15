package com.example.demo.project;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class projectdetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String projectname;
	 String  reason;
	 String   type;
	  String  catagery;
	  String  division;
	  Date  startdate;
	  Date  enddate;
	  String  location ;
	  String  status ;
	  
	public projectdetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public projectdetail(int id, String projectname, String reason, String type, String catagery, String division,
			Date startdate, Date enddate, String location, String status) {
		super();
		this.id = id;
		this.projectname = projectname;
		this.reason = reason;
		this.type = type;
		this.catagery = catagery;
		this.division = division;
		this.startdate = startdate;
		this.enddate = enddate;
		this.location = location;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCatagery() {
		return catagery;
	}

	public void setCatagery(String catagery) {
		this.catagery = catagery;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "projectdetail [id=" + id + ", projectname=" + projectname + ", reason=" + reason + ", type=" + type
				+ ", catagery=" + catagery + ", division=" + division + ", startdate=" + startdate + ", enddate="
				+ enddate + ", location=" + location + ", status=" + status + "]";
	}
	  
	
	  
}
