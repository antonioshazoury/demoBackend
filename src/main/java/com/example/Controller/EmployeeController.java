package com.example.Controller;

import java.util.List;

import com.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.EmployeeService;

@RestController
@RequestMapping("Employees/")
@CrossOrigin(origins="*")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("All")	
	public List<Employee> getAllEmployees() {
		return employeeService.getallemployees();
	}
	
}
