package com.tcs.Mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.Mappings.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
