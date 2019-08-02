package mum.edu.service;

import mum.edu.domain.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllCategories();
    Employee getEmployee(int id);
    Employee save(Employee employee);
    Employee update(Employee employee);
    public Employee getEmployeeByName(String name);
    
}
