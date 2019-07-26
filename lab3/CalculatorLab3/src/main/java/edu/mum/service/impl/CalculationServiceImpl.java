package edu.mum.service.impl;

import edu.mum.domain.Calculation;
import edu.mum.repository.CalculationRepository;
import edu.mum.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CalculationServiceImpl implements CalculationService {

    @Autowired
    CalculationRepository calculationRepository;

    public List<Calculation> getAll() {
        return calculationRepository.getAll();
    }

    public void save(Calculation calculation) {
        calculationRepository.save(calculation);
    }

    public void sum(Calculation calculation) {
        int addend1 = calculation.getAddend1();
        int addend2 = calculation.getAddend2();
        calculation.setSum(addend1 + addend2);
    }

    public void multiply(Calculation calculation) {
        int multiplicand = calculation.getMultiplicand();
        int multiplier = calculation.getMultiplier();
        calculation.setProduct(multiplicand * multiplier);
    }
}
