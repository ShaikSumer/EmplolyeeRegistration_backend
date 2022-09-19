package com.example.test.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.dao.Employee;
import com.example.test.dto.EmployeeResponseDto;
import com.example.test.dto.req.EmployeeRequestDto;
import com.example.test.repo.EmployeeRepo;
import com.example.test.service.EmployeeService;

@Service

public class EmployeeSeriveImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepo eRepo;
	
	
	
	
	
	@Override
	public EmployeeResponseDto addEmployee(EmployeeRequestDto employeeReq) {
		Employee employeeDao = eRepo.save(convetToDao(employeeReq)) ;
		return convetToDto(employeeDao);
	}

	

	private Employee convetToDao(EmployeeRequestDto employee) {
		Employee employeeDao= new Employee();
		employeeDao.setEmployeeName(employee.getEmployeeName());
		employeeDao.setEmailId(employee.getEmailId());
		employeeDao.setEmployeeeId(employee.getEmployeeeId());
		employeeDao.setSalary(employee.getSalary());
		employeeDao.setYearOfJoining(employee.getYearOfJoining());
		employeeDao.setExperience(employee.getExperience());
		employeeDao.setJobRole(employee.getJobRole());
		employeeDao.setAddress(employee.getAddress());
		employeeDao.setCompanyAddress(employee.getCompanyAddress());
		employeeDao.setLocation(employee.getLocation());
		
		return employeeDao;
	}
	private EmployeeResponseDto convetToDto(Employee employee) {

		EmployeeResponseDto employeeResponse = new EmployeeResponseDto();
		employeeResponse.setSlNo(employee.getSlNo());
		employeeResponse.setEmployeeName(employee.getEmployeeName());
		employeeResponse.setEmailId(employee.getEmailId());
		employeeResponse.setEmployeeeId(employee.getEmployeeeId());
		employeeResponse.setSalary(employee.getSalary());
		employeeResponse.setYearOfJoining(employee.getYearOfJoining());
		employeeResponse.setExperience(employee.getExperience());
		employeeResponse.setJobRole(employee.getJobRole());
		employeeResponse.setAddress(employee.getAddress());
		employeeResponse.setCompanyAddress(employee.getCompanyAddress());
		employeeResponse.setLocation(employee.getLocation());
		
		return employeeResponse;
	}

	
	

	@Override
	public List<EmployeeResponseDto> getEmployees(String employee) {
		
		List<Employee> EmployeeList = eRepo.findAll();
		
		List<EmployeeResponseDto> employeeResponseList=new ArrayList<>();
		
		for (Employee employeeDao : EmployeeList) {
					employeeResponseList.add(convetToDto(employeeDao));
		}
		
		return employeeResponseList;
	}
	
	
	

}
