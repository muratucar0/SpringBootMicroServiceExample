package com.muratucar.department_service.model;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private Long id;
	private String name;
	private List<Employee> employees = new ArrayList<>();
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	public Department(Long id) {
		 this.id = id;
	}
	
	public Department(Long id , String name ) {
		this.id = id;
		this.name = name;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
	

}
