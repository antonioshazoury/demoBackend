package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.EmployeeRepository;

@Service

public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List getallemployees() {
		return employeeRepository.findAll();
	}
	
	
	
}
