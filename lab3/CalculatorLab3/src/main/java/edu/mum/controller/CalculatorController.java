package edu.mum.controller;

import edu.mum.domain.Calculation;
import edu.mum.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping("/result")
    public String calculate(Calculation calculation , Model model) {
        calculationService.sum(calculation);
        calculationService.multiply(calculation);

        model.addAttribute("Calculations", calculationService.getAll());

        return "result";
    }

    @RequestMapping("/calculator")
    public String listCalculations(Model model) {
        model.addAttribute("Calculations", calculationService.getAll());
        return "calculator";
    }

//    @RequestMapping(value = { "/", "/calc2" })
//    public String inputCalculation(HttpServletRequest request, HttpServletResponse response) {
//        return "/WEB-INF/calculator.jsp";
//    }
//
//    @RequestMapping(value = "/result")
//    public String saveCalculation(Calculation calculation, HttpServletRequest request, HttpServletResponse response) {
//        List<String> errors = calculationValidator.validate(calculation);
//        if (errors.isEmpty()) {
//            // store Calculation in a scope variable for the view
//            calculation.setSum(calculation.getAddend1() + calculation.getAddend2());
//            calculation.setCalculation(calculation.getMultiplicand() * calculation.getMultiplier());
//
//            request.setAttribute("calculation", calculation);
//            return "/WEB-INF/result.jsp";
//        } else {
//
//            // store errors and Calculation in a scope variable for the view
//            request.setAttribute("errors", errors);
//            request.setAttribute("form", calculation);
//            return "/WEB-INF/calculator.jsp";
//        }
//    }

}
