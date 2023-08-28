package com.imaginnovate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imaginnovate.entity.Employee;

public interface  EmpRepo extends JpaRepository<Employee, Long> {

}
