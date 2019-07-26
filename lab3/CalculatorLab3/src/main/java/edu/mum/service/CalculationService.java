package edu.mum.service;

import edu.mum.domain.Calculation;

import java.util.List;
import java.util.Map;

public interface CalculationService {
    public List<Calculation> getAll();

    public void save(Calculation calculation);

    public void sum(Calculation calculation);

    public void multiply(Calculation calculation);
}
