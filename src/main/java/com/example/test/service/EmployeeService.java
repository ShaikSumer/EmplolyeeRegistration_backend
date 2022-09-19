package com.example.test.service;

import java.util.List;

import org.hibernate.service.NullServiceException;
import org.springframework.stereotype.Service;

import com.example.test.dto.EmployeeResponseDto;
import com.example.test.dto.req.EmployeeRequestDto;

@Service
public interface EmployeeService {

	EmployeeResponseDto addEmployee(EmployeeRequestDto employeeReq);

	 List<EmployeeResponseDto> getEmployees(String employeeName)throws Exception;

	
	
}
