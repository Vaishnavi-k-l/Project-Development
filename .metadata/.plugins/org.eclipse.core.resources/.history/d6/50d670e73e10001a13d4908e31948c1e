package com.example.demo;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Employee;
import com.example.demo.model.Project;
import com.example.demo.service.ProjectManagementServiceClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class IntegrationClient {
	
	@Autowired
	private ProjectManagementServiceClient projectManagementServiceClient;
	
	public Collection<Employee> getEmployeeFallback() {
		System.out.println("=======getEmployeeFallback=========");
		return Arrays.asList();
	}

	@HystrixCommand(fallbackMethod = "getEmployeeFallback")
	public Collection<Employee> getEmployees(String fname) {
		return this.projectManagementServiceClient.getData(fname);
	}
	
	public Collection<Project> getProjectDetiails()
	{
		return this.projectManagementServiceClient.getCompletedProjects();
	}
}
