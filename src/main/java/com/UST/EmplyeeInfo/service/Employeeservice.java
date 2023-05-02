package com.UST.EmplyeeInfo.service;

import com.UST.EmplyeeInfo.entity.Employee;
import com.UST.EmplyeeInfo.repository.Employeerepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class Employeeservice {
    @Autowired
    private Employeerepository employeerepository;
    public Employee saveemployee(Employee employee) {
        return employeerepository.save(employee);
    }
    public Employee findEmployeebyId(Long id) {
        return employeerepository.findById(id).orElse(null);

    }
//
//
    public void deleteEmployee(Long id) {
        employeerepository.deleteById(id);
    }

    public List<Employee> getAllEmployees() {
        return employeerepository.findAll();

    }


    public Employee searchEmployeebyId(String empid) {
        return employeerepository.findByempid(empid);
    }
}
