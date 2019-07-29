package com.students.validator;

import com.students.domain.Student;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class StudentValidator implements Validator {
	@Override
	public boolean supports(Class<?> c) {
		return Student.class.isAssignableFrom(c);
	}

	@Override
	public void validate(Object command, Errors errors) {
		String[] errorArgs = { "First Name" };
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "NotEmpty", errorArgs);
		errorArgs = new String[] { "Last Name" };
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "NotEmpty", errorArgs);
		Student student = (Student) command;

		if (student.getId() == null || student.getId() <= 0)
			errors.rejectValue("studentNumber", "Student.Number.lessthan");
//		if (student.getId() == null || student.getAge() < 18)
//			errors.rejectValue("age", "Student.age");
		
	}

}
