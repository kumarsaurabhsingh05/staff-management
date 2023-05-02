package com.example.staffmanagement.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Optional<Employee> findById(@PathVariable Integer id) {
        return employeeService.findById(id);
    }

    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @PutMapping("/employees/{id}")
    public void modifyEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
        employeeService.modifyEmployee(id, employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(Employee employee) {
        employeeService.deleteEmployee(employee);
    }

}
