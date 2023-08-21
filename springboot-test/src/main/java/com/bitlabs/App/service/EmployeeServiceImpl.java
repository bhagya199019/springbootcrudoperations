package com.bitlabs.App.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitlabs.App.Entity.Employee;
import com.bitlabs.App.repository.EmployeeRepository;



@Service
public class EmployeeServiceImpl implements EmployeeService {
	 @Autowired
	    private EmployeeRepository employeeRepository;

	    public Employee saveEmployee(Employee employee) {
			 return employeeRepository.save(employee);
		}

	    @Override
		public List<Employee> getAllEmployees() {
			return (List<Employee>) employeeRepository.findAll();
		}

		@Override
		public Employee getEmployeeById(int empid) {
			
			 Optional<Employee> optionalEmployee = employeeRepository.findById(empid);
			return optionalEmployee.get();
		}

		@Override
		public void deleteEmployee(int empid) {
			employeeRepository.deleteById(empid);
			
		}

		@Override
		public Employee updateEmployee(Employee employee) {
			Employee updatedEmployee=employeeRepository.save(employee);
			
			return updatedEmployee;
		}

		
     

}
