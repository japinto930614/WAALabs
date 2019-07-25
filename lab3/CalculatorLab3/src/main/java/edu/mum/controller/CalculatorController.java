package edu.mum.controller;

import edu.mum.domain.Calculation;
import edu.mum.service.CalculationService;
import edu.mum.validator.CalculationValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequestMapping("/calculation")
@Controller
public class CalculatorController {

    @Autowired
    private CalculationService calculationService;


    @RequestMapping()
    public String getProductForm(Model model) {
        model.addAttribute("calculations", calculationService.getAll());
        return "CalculationForm";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String saveCalculation(Calculation calculation) {
        System.out.println(product.getCategory());
        Category category = categoryService.getCategory(product.getCategory().getId());
        product.setCategory(category);
        productService.save(product);
        return "ProductDetails";
    }

    @RequestMapping("/listproducts")
    public String listProducts(Model model) {
        model.addAttribute("products", productService.getAll());
        return "ListProducts";
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
//            // store product in a scope variable for the view
//            calculation.setSum(calculation.getAddend1() + calculation.getAddend2());
//            calculation.setProduct(calculation.getMultiplicand() * calculation.getMultiplier());
//
//            request.setAttribute("calculation", calculation);
//            return "/WEB-INF/result.jsp";
//        } else {
//
//            // store errors and product in a scope variable for the view
//            request.setAttribute("errors", errors);
//            request.setAttribute("form", calculation);
//            return "/WEB-INF/calculator.jsp";
//        }
//    }

}
