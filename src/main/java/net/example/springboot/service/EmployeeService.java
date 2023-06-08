package net.example.springboot.service;

import net.example.springboot.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(long id);
    Employee updateEmployeeById(Employee employee, long id);
    void deleteEmployeeById(long id);

}
