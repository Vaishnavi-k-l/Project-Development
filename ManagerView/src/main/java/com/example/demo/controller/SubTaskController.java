package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Subtask;
import com.example.demo.entity.Task;
import com.example.demo.service.SubTaskServiceImpl;
import com.example.demo.service.TaskServiceImpl;

@RestController
@RequestMapping(value = "/subtask")
@CrossOrigin(origins = "http://localhost:4200")
public class SubTaskController {
	
	@Autowired
	private SubTaskServiceImpl subtaskServiceImpl;
	
	
	@Autowired
	private TaskServiceImpl taskServiceImpl;
	
	@PostMapping("/SubTask")
	public Subtask saveTask(@RequestBody Subtask stask) {	
		return subtaskServiceImpl.saveSubTask(stask);
	}
	
	@GetMapping("/SubTaskByTaskId/{ltaskId}")
	public List<Subtask> getSubTasksByTaskId(@PathVariable Long ltaskId){
		
		
		Task tt = taskServiceImpl.getTasksById(ltaskId);
		return subtaskServiceImpl.findByTaskId(tt);
	}

}