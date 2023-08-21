package com.bitlabs.App.service;

import java.util.List;

import com.bitlabs.App.Entity.Employee;


public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	  public List<Employee> getAllEmployees();
	  public Employee getEmployeeById(int id);
	  public void deleteEmployee (int id);
	  public Employee updateEmployee(Employee employee);
	  }
