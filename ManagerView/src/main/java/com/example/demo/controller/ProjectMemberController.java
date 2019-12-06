package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Project;
import com.example.demo.entity.ProjectMember;
import com.example.demo.service.ProjectMemberServiceImpl;
import com.example.demo.service.ProjectServiceImpl;

@RestController
@RequestMapping(value = "/projectMember")
@CrossOrigin(origins = "*")
public class ProjectMemberController {
	
	
	@Autowired
	private ProjectMemberServiceImpl projectMemberServiceImpl;
	
	@Autowired
	private ProjectServiceImpl projectServiceImpl;
	
	
	@LoadBalanced
	@PostMapping(value = "/saveProjectMember")
	public void saveProjectMember(@RequestBody ProjectMember projectMember) {	
		
		 projectMemberServiceImpl.saveProjectMember(projectMember);
	}
	
	@LoadBalanced
	@GetMapping("/getProjectMember")
	public List<ProjectMember> getAll(){		
		return projectMemberServiceImpl.getAll();		
	}
	
	@LoadBalanced
	@GetMapping("/getAllMembersOfAProject/{project}")
	public List<ProjectMember> getAllMembersOfAProject(@PathVariable Long project){	
		Project p = projectServiceImpl.getProjectById(project);
		return projectMemberServiceImpl.getProjectMemberByProjectId(p);
		
	}
	
	
}
