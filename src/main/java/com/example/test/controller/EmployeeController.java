package com.example.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.dto.EmployeeResponseDto;
import com.example.test.dto.req.EmployeeRequestDto;
import com.example.test.service.EmployeeService;

@RestController("employee")
@RequestMapping("/employee")

public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/getEmployees")
	public List<EmployeeResponseDto> getEmployee(@RequestParam(name="employeeName", required=false)String employeeName) {
		return employeeService.getEmployees(employeeName);
		
	}
	
	@PostMapping("/addEmployee")
	public EmployeeResponseDto addEmployee(@RequestBody EmployeeRequestDto employeeReq) {
		return employeeService.addEmployee(employeeReq);
	}

	
}
