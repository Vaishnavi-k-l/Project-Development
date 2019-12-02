package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "employee")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Employee implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private Long employeeId;
	
	@NotNull
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "last_name")
	private String lastName;
	
	
	
	@NotNull
	@Column(name = "user_type")
	private String userType;
	
	@NotNull
	@Column(name = "username", unique = true)
	private String username;
	
	@NotNull
	@Column(name = "password")
	private String password;
	
	@NotNull
	@Column(name = "availability", columnDefinition="boolean default 1")
	private boolean availability;
	
	@Column(name = "eul_agreement", columnDefinition="boolean default 0")
	private boolean eulAgreement;
}
