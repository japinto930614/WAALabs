package mum.edu.controller;

import mum.edu.domain.Calculation;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;
import mum.edu.validator.CalculationValidator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class CalculatorController {

    @AutoWired
    CalculationValidator calculationValidator;

    @RequestMapping(value = { "/", "/calc2" })
    public String inputCalculation(HttpServletRequest request, HttpServletResponse response) {
        return "/WEB-INF/calculator.jsp";
    }

    @RequestMapping(value = "/result")
    public String saveCalculation(Calculation calculation, HttpServletRequest request, HttpServletResponse response) {
        List<String> errors = calculationValidator.validate(calculation);
        if (errors.isEmpty()) {
            // store product in a scope variable for the view
            calculation.setSum(calculation.getAddend1() + calculation.getAddend2());
            calculation.setProduct(calculation.getMultiplicand() * calculation.getMultiplier());

            request.setAttribute("calculation", calculation);
            return "/WEB-INF/result.jsp";
        } else {

            // store errors and product in a scope variable for the view
            request.setAttribute("errors", errors);
            request.setAttribute("form", calculation);
            return "/WEB-INF/calculator.jsp";
        }
    }

}
