package edu.mum.controller;

import edu.mum.domain.Calculation;
import edu.mum.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

//@RequestMapping("/calculation")
@RequestMapping("/")
@Controller
public class CalculatorController {



    @Autowired
    private CalculationService calculationService;


    @RequestMapping()
    public String getCalculationForm(Model model) {
        model.addAttribute("calculations", calculationService.getAll());
        return "calculator";
    }


    @RequestMapping(method = RequestMethod.POST)
    public String saveCalculation(Calculation calculation) {
        calculationService.save(calculation);
        return "result";
    }

    @RequestMapping("/calculate")
    public String calculate(Calculation calculation , Model model, RedirectAttributes redirectAttributes, HttpServletRequest request) {
        calculationService.sum(calculation);
        calculationService.multiply(calculation);

//        model.addAttribute("Calculations", calculationService.getAll());
//
//        return "result";
        // THIS IS PRG PATTERN
        // Available as request attribute [named "product"] in the GET method
        redirectAttributes.addFlashAttribute(calculation);
        // Returned as a parameter on GET URL
//        redirectAttributes.addAttribute("name", "Kemosabe");
//        redirectAttributes.addFlashAttribute(123456);
//        redirectAttributes.addAttribute(newProduct.getName());


        return "redirect:/result";
    }

    @RequestMapping("/calculator")
    public String listCalculations(Model model) {
        model.addAttribute("Calculations", calculationService.getAll());
        return "calculator";
    }

    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String showCalculation(Model model) {
        //model.addAttribute("Calculations", calculationService.getAll());
        return "result";
    }
}
