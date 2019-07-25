package edu.mum.repository;

import edu.mum.domain.Calculation;

import java.util.List;

public interface CalculationRepository {
    public List<Calculation> getAll();
    public void save(Calculation calculation);
}
