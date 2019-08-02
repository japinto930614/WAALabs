package mum.edu.controller;

import mum.edu.domain.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EmployeeRestController {

    @PostMapping(value="/api/addEmployee", produces = "application/json")
    public Employee saveEmployee(@Valid @RequestBody Employee employee) {
        //employee.setDescription("This is default description...");
//        categoryService.save(category);
        return employee;
    }

}
