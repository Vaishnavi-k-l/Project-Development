package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeSkills;
import com.example.demo.service.EmployeeSkillsServiceImpl;

@RestController
@RequestMapping(value = "/employeeSkill")
@CrossOrigin(origins = "*")
public class EmployeeSkillsController {
	
	@Autowired
	private EmployeeSkillsServiceImpl employeeSkillServiceImpl;
	
	
	@GetMapping(value = "/getEmployeesBySkills/{skillName}")
	public List<Employee> getEmployeesBySkills(@PathVariable String skillName){
		
		
		return employeeSkillServiceImpl.getEmployeesBySkill(skillName);
		
		
	}
	
	@GetMapping(value = "/getEmployeeSkills/{employeeId}")
	public List<EmployeeSkills> getEmployeeSkills(@PathVariable Long employeeId){
		
		return employeeSkillServiceImpl.getEmployeeSkills(employeeId);	
		
	}
	

}
