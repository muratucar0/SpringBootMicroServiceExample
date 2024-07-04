package com.muratucar.employee_service.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.muratucar.employee_service.model.Employee;

@Repository
public class EmployeeReposity {


	private List<Employee> departments = new ArrayList<Employee>();
	
	public Employee addDepartment(Employee department) {
		this.departments.add(department);
		return department;
	}
	
	public Employee findById(Long id) {
		 return departments.stream()
				 .filter(d -> d.id().equals(id)).findFirst()
				 .orElseThrow();
	}
	 
	public List<Employee> findAll(){
		return departments;
	}
	
	public List<Employee> findByDepartment(Long departmentId){
		 return departments.stream().filter(d-> d.departmentId().equals(departmentId) )
				 .toList();
	}
	
}
