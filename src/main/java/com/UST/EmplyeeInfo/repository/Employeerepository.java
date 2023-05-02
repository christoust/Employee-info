package com.UST.EmplyeeInfo.repository;

import com.UST.EmplyeeInfo.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface Employeerepository extends JpaRepository<Employee,Long> {

    Employee findByempid(String empid);
}
