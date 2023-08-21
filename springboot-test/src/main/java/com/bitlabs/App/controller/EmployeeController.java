package com.bitlabs.App.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitlabs.App.Entity.Employee;
import com.bitlabs.App.service.EmployeeService;




@RestController
public class EmployeeController {
	@Autowired
    private EmployeeService employeeService;
	
	@GetMapping("/home")
	public String home() {
		return "welcome";
	}
	
	 @PostMapping("/add")
	    public String add(@RequestBody Employee employee){
	        employeeService.saveEmployee(employee);
	        return "New Employee is added";
	    }
   @GetMapping("/getall")
   public List<Employee> findAllEmployees(){
	   return employeeService.getAllEmployees();
   }
   
   @GetMapping("/getbyid/{id}")
   public Employee findEmployeeById(@PathVariable ("id") int empid) {
	   Employee employee=employeeService.getEmployeeById(empid);
	return employee;
	  
   }
   
   @DeleteMapping("/deletebyid/{id}")
   public String deleteEmployee(@PathVariable("id") int empid){
       employeeService.deleteEmployee(empid);;
       return "deleted successfully";
   }
   
   @PutMapping("/update")
   public String updateEmployee(@RequestBody Employee employee) {
	   employeeService.updateEmployee(employee);
	return "updated sucesfully";
	   
   }
}
