package edu.mum.controller;

import edu.mum.domain.Employee;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;

@Controller
public class EmployeeController {

	private static final Log logger = LogFactory.getLog(EmployeeController.class);

	@RequestMapping(value = { "/", "employee_input" })
	public String inputEmployee(@ModelAttribute("employee") Employee employee) {
		return "EmployeeForm";
	}

	@RequestMapping(value = "/employee_save")
	public String saveEmployee(@Valid Employee emp, BindingResult bindingResult,
							   Model model, HttpServletRequest request) {
		
		if (bindingResult.hasErrors()) {
			return "EmployeeForm";
		}

		String[] suppressedFields = bindingResult.getSuppressedFields();
		if (suppressedFields.length > 0) {
			throw new RuntimeException("Attempt to bind fields that haven't been allowed in initBinder(): "
					+ StringUtils.addStringToArray(suppressedFields, ", "));
		}

		MultipartFile employeeImage = emp.getEmployeeImage();
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		if (employeeImage != null && !employeeImage.isEmpty()) {
			try {
				System.out.println(rootDirectory + "resources\\images\\" + emp.getId()+ ".png");
				employeeImage.transferTo(
						new File(rootDirectory + "resources\\images\\" + emp.getId() + ".png"));
			} catch (Exception e) {
				throw new RuntimeException("Employee Image saving failed", e);
			}
		}

		// save employee here
		model.addAttribute("employee", emp);

		return "EmployeeDetails";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// binder.setDisallowedFields(new String[]{"firstName"});
	}
}
