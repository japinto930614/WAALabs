package mum.edu.lab10.controller;

import mum.edu.lab10.domain.Employee;
import mum.edu.lab10.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public String getEmployeeForm(@ModelAttribute Employee employee){
        return "employeeForm";
    }

    @PostMapping("/")
    public String saveEmployee(@Valid Employee employee, BindingResult result){
        if(result.hasErrors()){
            return "employeeForm";
        }else{
            employeeService.save(employee);
            return "redirect:/employeelist";
        }
    }

    @GetMapping("/employeelist")
    public String getEmployeeList(Model model, @RequestParam(value = "lastName", required = false) String lastName){
        if(lastName == null || "".equals(lastName)){
            model.addAttribute("list", employeeService.getEmployees());
        }else{
            model.addAttribute("list", employeeService.getEmployeesByLastName(lastName));
        }

        return "employeelist";
    }

    @PostMapping("/employeelist")
    public String filterEmployee(Model model, @RequestParam(value = "id", required = false) Long id){
        model.addAttribute("list", employeeService.getEmployeeByNumber(id));
        return "employeelist";
    }
}
