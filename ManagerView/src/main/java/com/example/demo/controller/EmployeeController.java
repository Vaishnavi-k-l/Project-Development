package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.mysqlrepository.EmployeeRepository;
import com.example.demo.service.EmployeeServiceImpl;


@RestController
@RequestMapping(value = "/employee")
@CrossOrigin(origins = "*")

public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	

	@GetMapping( value =  "/getManagersByAvailability")
	public List<Employee> getAll(){		
        return employeeServiceImpl.getAllManagerByAvailability();
	}
	
	@GetMapping( value =  "/getMembersByAvailability")
	public List<Employee> getAllMembers(){		
        return employeeServiceImpl.getAllMembersByAvailability();
	}
	
	@GetMapping("/EmployeeById/{employeeId}")
	public Employee getEmployeeById(@PathVariable Long employeeId) {
		return employeeServiceImpl.getEmployeeById(employeeId);
		
		
	}
	
	@PutMapping("/updateEul")
	public Employee updateEmployeeEul(@RequestBody Employee employee) {
		return employeeServiceImpl.updateEmployeeEul(employee);
	}
	
	
	
	
	

}
