package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ProjectMember;
import com.example.demo.repository.ProjectMemberRepository;
import com.example.demo.service.ProjectMemberService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ProjectMemberController {
	
	@Autowired
	private ProjectMemberService projectMemberService ;
	
	@GetMapping("/getteams/{theid}")
	public List<ProjectMember> getAllProjectMember(@PathVariable Long theid )
	{
		return projectMemberService.getByEmpId(theid);
	}
	
	@GetMapping("/getmember/{theId}")
	public List<ProjectMember> getProjectMember(@PathVariable Long theId )
	{
		return projectMemberService.getAllProjectEmployee(theId);
	}
	
	

}
