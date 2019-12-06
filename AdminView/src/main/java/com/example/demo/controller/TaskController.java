package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TaskService;
import com.example.demo.entity.Task;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class TaskController {
	@Autowired
	public TaskController(TaskService taskService) {
		super();
		this.taskService = taskService;
	}

	private TaskService taskService;
	
	@GetMapping("/getTasks/{projectId}")
	public List<Task> getTaskByProjectId(@PathVariable long projectId )
	{
		return taskService.getTaskByProjectId(projectId);
	}
	
	@GetMapping("/getTasks")
	public List<Task> getallTasks()
	{
		return taskService.getTasks();
	}

}
