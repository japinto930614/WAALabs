package mum.edu.validator;



import mum.edu.domain.Calculation;

import java.util.ArrayList;
import java.util.List;

public class CalculationValidatorImpl implements CalculationValidator{
    @Override
    public List<String> validate(Object object) {
        List<String> errors = new ArrayList<String>();

        Calculation calculation = (Calculation) object;
        Integer addend1 = calculation.getAddend1();
        if (addend1 == null) {
            errors.add("The first addend must have a value");
        }
        Integer addend2 = calculation.getAddend2();
        if (addend2 == null) {
            errors.add("The second addend must have a value");
        }
        Integer multiplicand = calculation.getMultiplicand();
        if (multiplicand == null) {
            errors.add("The multiplicand must have a value");
        }
        Integer multiplier = calculation.getMultiplier();
        if (multiplier == null) {
            errors.add("The multiplier must have a value");
        }

        return errors;
    }
}
