package com.muratucar.employee_service.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muratucar.employee_service.model.Employee;
import com.muratucar.employee_service.repository.EmployeeReposity;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	
	 private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
	 
	 
	 @Autowired
	 EmployeeReposity employeeReposity;
	 
	 
	 @PostMapping
	 public Employee add(@RequestBody Employee employee) {
		  LOGGER.info("Added Employee : {}" ,employee);
		  return employeeReposity.addDepartment(employee);
	 }

	 @GetMapping
	 public List<Employee> findAll(){
		 LOGGER.info("Employee find");
		 return employeeReposity.findAll();
	 }
	 
	 @GetMapping("/{id}")
	 public Employee findById(@PathVariable("id") Long id) {
		 LOGGER.info("Employee Find : {}",id);
		 return employeeReposity.findById(id);
	 }
	 
	 @GetMapping("/department/{departmentId}")
	 public List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId){
		 return employeeReposity.findByDepartment(departmentId);
	 }
}
