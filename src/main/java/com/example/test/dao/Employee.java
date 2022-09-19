package com.example.test.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name="Employee")
@Entity
@Data
public class Employee {
	

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="slNo")
	public Integer slNo;
	
	@Column(name="employee_name")
	public String employeeName;
	
	@Column(name="employee_id")
	public String employeeeId;
	
	@Column(name="email_id")
	public String emailId;
	
	@Column(name="salary")
	public Integer salary ;
	
	@Column(name="year_of_joining")
	public Date yearOfJoining;
	
	@Column(name="experience")
	public Integer experience;
	
	@Column(name="job_role")
	public String jobRole;
	
	@Column(name="address")
	public String address;
	
	@Column(name="company_address")
	public String companyAddress;
	
	@Column(name="location")
	public String location;
	

}
