package com.UST.EmplyeeInfo.controller;

import com.UST.EmplyeeInfo.entity.Employee;

import com.UST.EmplyeeInfo.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/employee")
public class Employeecontroller {

    @Autowired
    private Employeeservice employeeservice;
    @PostMapping("/")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeservice.saveemployee(employee);
    }
    @GetMapping("/{id}")
    public Employee findEmployeebyid(@PathVariable Long id)
    {
        return employeeservice.findEmployeebyId(id);
    }



    @GetMapping("/search/{empid}")
    public Employee searchEmployeebyId(@PathVariable String empid) {
        return employeeservice.searchEmployeebyId(empid);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeservice.deleteEmployee(id);
    }
    @GetMapping("/")
    public List<Employee> getAllEmployees() {
        return employeeservice.getAllEmployees();
    }

}
