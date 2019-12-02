package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.demo.composite.ProjectManagerComposite;

import lombok.Data;

@Data
@Entity
@Table(name = "project_manager")

@IdClass(ProjectManagerComposite.class)
public class ProjectManager implements Serializable
{
	@Id
	@OneToOne(fetch = FetchType.LAZY,optional=false,targetEntity = Employee.class)
    @JoinColumn(name="manager_id")
	private Employee employeeId;
	
	@Id
	@OneToOne(fetch = FetchType.LAZY,optional=false,targetEntity = Project.class)
    @JoinColumn(name="project_id")
	private Project projectId;
	
}
