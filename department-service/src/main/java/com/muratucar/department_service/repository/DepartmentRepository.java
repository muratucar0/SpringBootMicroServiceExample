package com.muratucar.department_service.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.muratucar.department_service.model.Department;

@Repository
public class DepartmentRepository  {

	
	private List<Department> departments = new ArrayList<Department>();
	
	
	public Department addDepartment(Department department) {
		this.departments.add(department);
		return department;
	}
	
	public Department findById(Long id) {
		 return departments.stream()
				 .filter(d -> d.getId().equals(id)).findFirst()
				 .orElseThrow();
	}
	 
	public List<Department> findAll(){
		return departments;
	}
}
