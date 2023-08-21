package com.bitlabs.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bitlabs.App.Entity.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	

}
