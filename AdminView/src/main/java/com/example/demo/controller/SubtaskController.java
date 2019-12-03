package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Subtask;
import com.example.demo.service.SubtaskService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@CrossOrigin(origins = "http://172.18.8.205:4200")
@RestController
@RequestMapping("/api")
public class SubtaskController 
{
	@Autowired
	private SubtaskService subtaskService;
	
	@RequestMapping("/getsubtasks/{projectId}/{taskId}")
	public List<Subtask> getAllSubtasks(@PathVariable (value="projectId") long projectId, @PathVariable (value="taskId") long taskId)
	{
		return subtaskService.getAllSubtasks(projectId,taskId);
	}
	
	
	
	
}
