package com.springrestservice.springrest.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrestservice.springrest.Beans.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
