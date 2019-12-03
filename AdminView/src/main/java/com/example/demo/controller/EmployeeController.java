package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeSkills;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.EmployeeSkillsService;

@CrossOrigin(origins = "http://172.18.8.205:4200")
@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeSkillsService employeeSkillsService;
	
	@GetMapping("/search")
	public List<Employee> getAll()
	{
		List<Employee> ch= employeeService.getAllEmployee();
		System.out.println(ch);
		return ch;
	}
	
	@GetMapping("/search/{fname}")
	public List<Employee> getData(@PathVariable String fname)
	{
		List<Employee> ch= employeeService.findByFirstName(fname);
		System.out.println(ch);
		return ch;
	}
	
	/*@GetMapping("/search/skills/{theId}")
	public List<EmployeeSkills> getEmpSkills(@PathVariable Long theId)
	{
		List<EmployeeSkills> sk = employeeSkillsService.getEmployeeSkills(theId);
		return sk;
	}*/

}
