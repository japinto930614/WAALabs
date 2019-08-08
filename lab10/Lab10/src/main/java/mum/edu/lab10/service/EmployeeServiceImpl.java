package mum.edu.lab10.service;

import mum.edu.lab10.domain.Employee;
import mum.edu.lab10.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getEmployees() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployeesByLastName(String lastName) {
        return employeeRepository.findByLastName(lastName);
    }

    @Override
    public List<Employee> getEmployeeByNumber(Long id) {
        return employeeRepository.locateOneEmployeeByHisNumber(id);
    }
}
