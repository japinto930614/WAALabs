package mum.edu.lab10.service;

import mum.edu.lab10.domain.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();

    Employee save(Employee employee);

    List<Employee> getEmployeesByLastName(String lastName);

    List<Employee> getEmployeeByNumber(Long id);

}
